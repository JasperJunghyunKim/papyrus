package com.paperware.papyrus.repository;

import com.paperware.papyrus.domain.stock.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
