package com.zolotar.project.entity;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "Movie-Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Column(name = "ID")
    private long id;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "STORY")
    private String story;

    @Column(name = "RELEASEDATE")
    private Date releaseDate;

    @Column(name = "URL", nullable = false)
    private String URL;

    @Column(name = "RATING")
    private double rating;

    @Column(name = "HAVESEEN")
    private boolean haveSeen;

    @Column(name = "WANTSEE")
    private boolean wantSee;


    @ManyToOne(fetch = EAGER)
    private Genre genreType;

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isHaveSeen() {
        return haveSeen;
    }

    public void setHaveSeen(boolean haveSeen) {
        this.haveSeen = haveSeen;
    }

    public boolean isWantSee() {
        return wantSee;
    }

    public void setWantSee(boolean wantSee) {
        this.wantSee = wantSee;
    }

    public Genre getGenreType() {
        return genreType;
    }

    public void setGenreType(Genre genreType) {
        this.genreType = genreType;
    }
}
