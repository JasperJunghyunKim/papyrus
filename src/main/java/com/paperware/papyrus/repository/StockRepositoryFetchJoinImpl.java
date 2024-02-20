package com.paperware.papyrus.repository;

import com.paperware.papyrus.domain.stock.Stock;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class StockRepositoryFetchJoinImpl implements StockRepositoryFetchJoin {

    private final EntityManager entityManager;

    @Override
    public List<Stock> findAllStocksFetchingPapertype(int offset, int limit) {
        return entityManager.createQuery(
                        "select s from Stock s " +
                                "join fetch s.papertype p ", Stock.class)
                .setFirstResult(offset)
                .setMaxResults(limit).getResultList();
    }
}
