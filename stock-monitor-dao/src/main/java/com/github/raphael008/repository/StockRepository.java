package com.github.raphael008.repository;

import com.github.raphael008.dao.StockDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockDao, Long> {
}
