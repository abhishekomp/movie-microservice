package org.aom.movie_info.controller;

import org.aom.movie_info.model.MovieInfo;
import org.aom.movie_info.service.MovieInfoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Abhishek
 * @since : 2024-08-22, Thursday
 **/
@RestController
@RequestMapping("/movie-info-service/")
public class MovieInfoController {

    private final MovieInfoService movieInfoService;

    public MovieInfoController(MovieInfoService movieInfoService) {
        this.movieInfoService = movieInfoService;
    }

    @GetMapping("getMovieInfo/{id}")
    public ResponseEntity<MovieInfo> getMovieInfo(@PathVariable int id){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("my-custom-header", "single-movie-info");
        return ResponseEntity.ok().headers(httpHeaders).body(movieInfoService.getMovieInfo(id));
    }

    @PostMapping("addMovieInfo")
    @ResponseStatus(HttpStatus.CREATED)
    public MovieInfo addMovieInfo(@RequestBody MovieInfo movieInfo){
        return movieInfoService.addMovieInfo(movieInfo);
    }

    public ResponseEntity<List<MovieInfo>> getAllMovieInfo(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("my-custom-header", "all-movie-info");
        return new ResponseEntity<>(movieInfoService.getAllMovieInfo(), httpHeaders, HttpStatus.OK);
    }

//    @GetMapping("getGenre/{movieId}")
//    public String getGenre(@PathVariable int movieId){
//        MovieInfo movieInfo = movieInfoService.getMovieInfo(movieId);
//        return movieInfo.getGenre();
//    }

    @GetMapping("getGenre/{movieId}")
    public MovieInfo getGenre(@PathVariable int movieId){
        MovieInfo movieInfo = movieInfoService.getMovieInfo(movieId);
        return movieInfo;
    }
}
