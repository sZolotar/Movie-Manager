package com.zolotar.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "GENRE")
public class Genre {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "GENRE-SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Column(name = "ID")
    private long id;

    @Column(name = "GENRE", unique = true, nullable = false)
    private String genre;

    public Genre() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
