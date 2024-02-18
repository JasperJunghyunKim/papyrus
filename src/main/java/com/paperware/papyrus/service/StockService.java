package com.paperware.papyrus.service;

import com.paperware.papyrus.dto.StockRequest;
import com.paperware.papyrus.domain.enumerator.Packaging;
import com.paperware.papyrus.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;

    public void createStock(StockRequest stockRequest){
        if (stockRequest.getPackaging() == Packaging.ROLL){
            // Roll roll = new Roll(
            //         stockRequest.getPapertype(),
            //         stockRequest.getGsm(),
            //         stockRequest.getManufacturer(),
            //         stockRequest.getPaperWidth(),
            //         stockRequest.getPaperLength(),
            //         stockRequest.getColor(),
            //         stockRequest.getPattern(),
            //         stockRequest.getCert(),
            //         stockRequest.getPipeWidth(),
            //         stockRequest.getPipeWidthUnit(),
            //         stockRequest.getInitialQuantity()
            // );

            // Roll save = stockRepository.save(roll);
            // return
        }

    }
}
