package org.aom.movie_catalog.repository;

import org.aom.movie_catalog.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Abhishek
 * @since : 2024-08-21, Wednesday
 **/
@Repository
public interface MovieCatalogRepository extends JpaRepository<Movie, Integer> {
}
