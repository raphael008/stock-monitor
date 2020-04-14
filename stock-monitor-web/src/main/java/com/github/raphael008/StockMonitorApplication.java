package com.github.raphael008;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.raphael008"})
public class StockMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockMonitorApplication.class, args);
    }
}
