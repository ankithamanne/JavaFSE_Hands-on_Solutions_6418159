package com.example.springdatajpademo.service;

import com.example.springdatajpademo.entity.Country;
import com.example.springdatajpademo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepo;

    public Country getCountry(String code) {
        return countryRepo.findById(code).orElse(null);
    }

    public Country addCountry(Country country) {
        return countryRepo.save(country);
    }

    public Country updateCountry(Country country) {
        return countryRepo.save(country);
    }

    public void deleteCountry(String code) {
        countryRepo.deleteById(code);
    }

    public List<Country> searchCountryByName(String name) {
        return countryRepo.findByCoNameContaining(name);
    }
}
