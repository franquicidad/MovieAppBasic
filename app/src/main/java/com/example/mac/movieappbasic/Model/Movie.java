package com.example.mac.movieappbasic.Model;

/**
 * Created by mac on 7/02/18.
 */

public class Movie {

    private String movieName;
    private String poster_path;
    private Double voteAverage;
    private String overview;
    private String releaseDate;

    public Movie(String movieName, String poster_path, Double voteAverage, String overview, String releaseDate) {
        this.movieName = movieName;
        this.poster_path = poster_path;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.releaseDate = releaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
