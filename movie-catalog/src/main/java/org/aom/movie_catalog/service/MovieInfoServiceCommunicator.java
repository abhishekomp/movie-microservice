package org.aom.movie_catalog.service;

import org.aom.movie_catalog.model.MovieInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Abhishek
 * @since : 2024-08-22, Thursday
 **/
@Component
public class MovieInfoServiceCommunicator {

    public static final String MOVIE_INFO_SERVICE = "http://movie-info/movie-info-service/";

    private final RestTemplate restTemplate;

    public MovieInfoServiceCommunicator(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MovieInfo getMovieGenre(int movieInfoId){
        ResponseEntity<MovieInfo> responseEntity = restTemplate.getForEntity(MOVIE_INFO_SERVICE + "getGenre/{movieId}", MovieInfo.class, movieInfoId);
        return responseEntity.getBody();
    }

//    public String getMovieGenre(int movieInfoId){
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(MOVIE_INFO_SERVICE + "getGenre/{movieId}", String.class, movieInfoId);
//        return responseEntity.getBody();
//    }
}
