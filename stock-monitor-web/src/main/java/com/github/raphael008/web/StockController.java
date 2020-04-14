package com.github.raphael008.web;

import com.github.raphael008.dao.StockDao;
import com.github.raphael008.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {
    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("test")
    public Object test() {
        StockDao stockDao = new StockDao();
        stockDao.setStockName("test");
        stockService.save(stockDao);

        return stockService.findAll();
    }

    @GetMapping("print")
    public Object print() {
        return "successful";
    }
}
