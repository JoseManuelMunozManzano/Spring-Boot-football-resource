package com.jmunoz.footballresource.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/football")
@RestController
public class Football {

    @GetMapping("/teams")
    public List<String> getTeams() {
        return List.of("Argentina", "Australia", "Brazil");
    }
}
