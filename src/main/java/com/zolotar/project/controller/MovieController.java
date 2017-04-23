package com.zolotar.project.controller;

import com.zolotar.project.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MovieController {

    @Autowired
    private MovieService service;

    @RequestMapping(name ="/movies", method = RequestMethod.GET)
    public String showAll(Model model){
        model.addAttribute("movieList", service.findAll());
        return "movies";
    }

}
