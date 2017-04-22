package com.zolotar.project.dao;

import com.zolotar.project.entity.Movie;

import java.util.List;

public interface MovieDao {
    public List<Movie> findAll();
}
