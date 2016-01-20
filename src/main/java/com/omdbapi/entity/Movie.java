package com.omdbapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer year;//no primitives?
    private Character rated;
    private String released;//date to released
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;//string to URL?
    private Integer metascore;
    private Double imdbRating;
    private Integer imdbVotes;//integer with comma?
    private String imdbID;
    private String type;//enum?
    private Boolean response;//String?

    /*
{"Title":"Requiem for a Dream",
"Year":"2000",
"Rated":"R",
"Released":"15 Dec 2000",
"Runtime":"102 min",
"Genre":"Drama",
"Director":"Darren Aronofsky",
"Writer":"Hubert Selby Jr. (based on the book by), Hubert Selby Jr. (screenplay), Darren Aronofsky (screenplay)",
"Actors":"Ellen Burstyn, Jared Leto, Jennifer Connelly, Marlon Wayans",
"Plot":"The drug-induced utopias of four Coney Island people are shattered when their addictions become stronger.",
"Language":"English",
"Country":"USA",
"Awards":"Nominated for 1 Oscar. Another 32 wins & 61 nominations.",
"Poster":"http://ia.media-imdb.com/images/M/MV5BMTkzODMzODYwOF5BMl5BanBnXkFtZTcwODM2NjA2NQ@@._V1_SX300.jpg",
"Metascore":"68",
"imdbRating":"8.4",
"imdbVotes":"539,268",
"imdbID":"tt0180093",
"Type":"movie",
"Response":"True"
 */

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Character getRated() {
        return rated;
    }

    public String getReleased() {
        return released;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getAwards() {
        return awards;
    }

    public String getPoster() {
        return poster;
    }

    public Integer getMetascore() {
        return metascore;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public Integer getImdbVotes() {
        return imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return type;
    }

    public Boolean getResponse() {
        return response;
    }
}
