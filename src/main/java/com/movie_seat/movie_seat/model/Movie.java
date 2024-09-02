package com.movie_seat.movie_seat.model;


import jakarta.persistence.Entity;

@Entity
public class Movie {
    private String name;
    private String description;
    private String image;
    private double duration;
    private int age_rating;
    private String trailer;
    private String genre;
    private String director;


}
