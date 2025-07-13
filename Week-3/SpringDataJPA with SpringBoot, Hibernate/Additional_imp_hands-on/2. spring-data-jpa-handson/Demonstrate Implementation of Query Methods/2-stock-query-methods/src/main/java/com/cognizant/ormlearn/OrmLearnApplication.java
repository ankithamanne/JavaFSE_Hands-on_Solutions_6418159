package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static StockRepository stockRepository;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        stockRepository = context.getBean(StockRepository.class);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("✅ FB Stocks in Sept 2019:");
        List<Stock> fb = stockRepository.findByCodeAndDateBetween("FB", sdf.parse("2019-09-01"),
                sdf.parse("2019-09-30"));
        fb.forEach(System.out::println);

        System.out.println("✅ Google Stocks with close > 1250:");
        stockRepository.findByCodeAndCloseGreaterThan("GOOGL", 1250.0).forEach(System.out::println);

        System.out.println("✅ Top 3 stocks by volume:");
        stockRepository.findTop3ByOrderByVolumeDesc().forEach(System.out::println);

        System.out.println("✅ Netflix lowest closing prices:");
        stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX").forEach(System.out::println);
    }
}
