package org.aom.movie_catalog.service;

import org.aom.movie_catalog.model.Movie;
import org.aom.movie_catalog.repository.MovieCatalogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Abhishek
 * @since : 2024-08-21, Wednesday
 **/
@Service
public class MovieCatalogService {
    private final MovieCatalogRepository movieCatalogRepository;

    public MovieCatalogService(MovieCatalogRepository movieCatalogRepository) {
        this.movieCatalogRepository = movieCatalogRepository;
    }
    public Movie getMovieById(int id){
        return movieCatalogRepository.findById(id).get();
    }

    public Movie addMovie(Movie movie){
        return movieCatalogRepository.save(movie);
    }

    public List<Movie> findAll() {
        return movieCatalogRepository.findAll();
    }
}
