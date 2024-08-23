package org.aom.movie_catalog.model;

/**
 * @author : Abhishek
 * @since : 2024-08-22, Thursday
 **/

public class MovieInfo {

    private String movieName;
    private String movieId;
    private String genre;

    public MovieInfo() {
    }

    public MovieInfo(String movieName, String movieId, String genre) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.genre = genre;
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
                ", movieName='" + movieName + '\'' +
                ", movieId='" + movieId + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
