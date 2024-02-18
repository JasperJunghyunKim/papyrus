package com.paperware.papyrus.mapper;

import com.paperware.papyrus.domain.stock.Stock;
import com.paperware.papyrus.dto.StockRequest;
import com.paperware.papyrus.dto.StockResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StockMapper {
    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);

    StockResponse stockToStockResponse(Stock stock);
    Stock stockRequestToStock(StockRequest stockRequest);
}

