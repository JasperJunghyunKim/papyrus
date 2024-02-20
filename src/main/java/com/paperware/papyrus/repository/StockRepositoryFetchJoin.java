package com.paperware.papyrus.repository;

import com.paperware.papyrus.domain.stock.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StockRepositoryFetchJoin {
    List<Stock> findAllStocksFetchingPapertype(int offset, int limit);
}
