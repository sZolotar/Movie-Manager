package com.zolotar.project.service;

import com.zolotar.project.dao.MovieDao;
import com.zolotar.project.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieDao movieDao;


    public List<Movie> findAll() {
        return movieDao.findAll();
    }
}
