package com.zolotar.project.controller;

import com.zolotar.project.entity.Movie;
import com.zolotar.project.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/json")
public class WebController {

    @Inject
    MovieService movieService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

}
