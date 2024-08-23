package org.aom.movie_info.service;

import org.aom.movie_info.model.MovieInfo;
import org.aom.movie_info.repository.MovieInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Abhishek
 * @since : 2024-08-22, Thursday
 **/
@Service
public class MovieInfoService {
    private final MovieInfoRepository movieInfoRepository;

    public MovieInfoService(MovieInfoRepository movieInfoRepository) {
        this.movieInfoRepository = movieInfoRepository;
    }

    public MovieInfo getMovieInfo(int id){
        return movieInfoRepository.findById(id).get();
    }

    public List<MovieInfo> getAllMovieInfo(){
        return movieInfoRepository.findAll();
    }

    public MovieInfo addMovieInfo(MovieInfo movieInfo){
        return movieInfoRepository.save(movieInfo);
    }
}
