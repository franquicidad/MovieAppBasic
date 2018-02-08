package com.example.mac.movieappbasic.Model;

/**
 * Created by mac on 7/02/18.
 */

public class Movie {

    private String movieName;
    private String movieImage;

    public Movie(String movieName, String movieImage) {
        this.movieName = movieName;
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }
}
