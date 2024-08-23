package org.aom.movie_info.repository;

import org.aom.movie_info.model.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Abhishek
 * @since : 2024-08-22, Thursday
 **/
@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Integer> {
}
