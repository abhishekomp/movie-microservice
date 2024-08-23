package org.aom.movie_catalog.controller;

import org.aom.movie_catalog.model.Movie;
import org.aom.movie_catalog.model.MovieInfo;
import org.aom.movie_catalog.service.MovieCatalogService;
import org.aom.movie_catalog.service.MovieInfoServiceCommunicator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Abhishek
 * @since : 2024-08-21, Wednesday
 **/
@RestController
@RequestMapping("/movie-catalog-service/")
public class MovieCatalogController {

    private static final Logger logger = LoggerFactory.getLogger(MovieCatalogController.class);
    private final MovieCatalogService movieCatalogService;
    @Autowired
    private MovieInfoServiceCommunicator movieInfoServiceCommunicator;

    public MovieCatalogController(MovieCatalogService movieCatalogService) {
        this.movieCatalogService = movieCatalogService;
    }

    @GetMapping("getMovie/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("my-custom-header", "single-movie");
        return ResponseEntity.ok().headers(httpHeaders).body(movieCatalogService.getMovieById(id));
    }

    @PostMapping("addMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie addMovie(@RequestBody Movie movie){
        return movieCatalogService.addMovie(movie);
    }

    @GetMapping("getAllMovies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("my-custom-header", "all-movies");
        return new ResponseEntity<>(movieCatalogService.findAll(), httpHeaders, HttpStatus.OK);
    }

    @GetMapping("getGenre/{movieId}")
    public MovieInfo getGenre(@PathVariable int movieId){
        logger.info("Fetching genre details for movieId: {}", movieId);
        return movieInfoServiceCommunicator.getMovieGenre(movieId);
    }
}
