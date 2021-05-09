package com.github.arildo.junior.citiesapi;

import com.github.arildo.junior.citiesapi.countries.Country;
import com.github.arildo.junior.citiesapi.repository.CoutryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CoutryRepository repositpry;

    @GetMapping
    public List<Country> countries() {
        return repositpry.findAll();
    }
}