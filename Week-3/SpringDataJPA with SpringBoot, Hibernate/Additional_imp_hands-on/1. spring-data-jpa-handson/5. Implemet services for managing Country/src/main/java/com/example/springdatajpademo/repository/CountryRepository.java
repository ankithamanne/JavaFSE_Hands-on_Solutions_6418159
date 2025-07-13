package com.example.springdatajpademo.repository;

import com.example.springdatajpademo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByCoNameContaining(String name);
}
