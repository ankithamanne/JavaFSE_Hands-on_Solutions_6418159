package com.cognizant.springjwt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Map<String, String>> getAllCountries() {
        return List.of(
            Map.of("code", "IN", "name", "India"),
            Map.of("code", "US", "name", "United States"),
            Map.of("code", "DE", "name", "Germany")
        );
    }
}
