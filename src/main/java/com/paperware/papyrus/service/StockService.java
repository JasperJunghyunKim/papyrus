package com.paperware.papyrus.service;

import com.paperware.papyrus.domain.stock.Papertype;
import com.paperware.papyrus.domain.stock.Roll;
import com.paperware.papyrus.dto.ReamRequest;
import com.paperware.papyrus.dto.RollRequest;
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

    public void createRoll(RollRequest rollRequest){

    }

    public void createReam(ReamRequest reamRequest){
    }


    /**
     * static method
     */
}
