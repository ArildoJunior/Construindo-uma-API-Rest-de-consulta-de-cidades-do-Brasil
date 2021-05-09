package com.github.arildo.junior.citiesapi;

import com.github.arildo.junior.citiesapi.countries.Country;
import com.github.arildo.junior.citiesapi.repository.CoutryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.print.Pageable;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CoutryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll((org.springframework.data.domain.Pageable) page);
    }
}