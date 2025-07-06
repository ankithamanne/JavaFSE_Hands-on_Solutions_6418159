package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryRepository countryRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryRepository = context.getBean(CountryRepository.class);

        testFindByNameContaining();
        testFindByNameContainingSorted();
        testFindByNameStartingWith();
    }

    static void testFindByNameContaining() {
        LOGGER.info("---- Countries containing 'ou' ----");
        List<Country> countries = countryRepository.findByNameContaining("ou");
        countries.forEach(c -> LOGGER.info(c.toString()));
    }

    static void testFindByNameContainingSorted() {
        LOGGER.info("---- Countries containing 'ou' sorted ----");
        List<Country> countries = countryRepository.findByNameContainingOrderByNameAsc("ou");
        countries.forEach(c -> LOGGER.info(c.toString()));
    }

    static void testFindByNameStartingWith() {
        LOGGER.info("---- Countries starting with 'Z' ----");
        List<Country> countries = countryRepository.findByNameStartingWith("Z");
        countries.forEach(c -> LOGGER.info(c.toString()));
    }
}
