package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Stock;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByCodeAndDateBetween(String code, Date start, Date end);

    List<Stock> findByCodeAndCloseGreaterThan(String code, Double close);

    List<Stock> findTop3ByOrderByVolumeDesc();

    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}
