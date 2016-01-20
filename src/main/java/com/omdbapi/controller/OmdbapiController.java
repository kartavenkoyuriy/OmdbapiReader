package com.omdbapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("http://www.omdbapi.com/")
public class OmdbapiController {

    @RequestMapping(value = "/?t={searchQuery}&y={year}&plot=full&r=json&type=series", method = RequestMethod.GET)
    public void getMovieByNameAndYear(@PathVariable("searchQuery")String query, @PathVariable("year")int year){

    }
}
