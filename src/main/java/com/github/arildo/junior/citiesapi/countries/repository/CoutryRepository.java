package com.github.arildo.junior.citiesapi.countries.repository;

import com.github.arildo.junior.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoutryRepository extends JpaRepository <Country, Long> {
}