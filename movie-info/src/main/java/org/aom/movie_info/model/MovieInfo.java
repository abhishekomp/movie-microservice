package org.aom.movie_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author : Abhishek
 * @since : 2024-08-22, Thursday
 **/
@Entity
public class MovieInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String movieName;
    private String movieId;
    private String genre;

    public MovieInfo() {
    }

    public MovieInfo(int id, String movieName, String movieId, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.movieId = movieId;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieId='" + movieId + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
