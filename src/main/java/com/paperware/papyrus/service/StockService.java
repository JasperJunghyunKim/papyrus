package com.paperware.papyrus.service;

import com.paperware.papyrus.domain.stock.Papertype;
import com.paperware.papyrus.domain.stock.Ream;
import com.paperware.papyrus.domain.stock.Roll;
import com.paperware.papyrus.domain.stock.Stock;
import com.paperware.papyrus.dto.*;
import com.paperware.papyrus.mapper.StockMapper;
import com.paperware.papyrus.repository.PapertypeRepository;
import com.paperware.papyrus.repository.StockRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.paperware.papyrus.domain.stock.Roll.ROLL_LENGTH;

@Service
@Transactional
@RequiredArgsConstructor
public class StockService {

    private final StockRepository stockRepository;
    private final PapertypeRepository papertypeRepository;

    public RollCreateResponse createRoll(RollCreateRequest rollCreateRequest){
        Papertype papertype = getPapertype(rollCreateRequest.getPapertypeId());
        Roll roll = rollCreateRequestToRoll(rollCreateRequest, papertype);
        Roll save = stockRepository.save(roll);
        return rollToRollCreateResponse(save);

    }

    public ReamCreateResponse createReam(ReamCreateRequest reamCreateRequest){
        Papertype papertype = getPapertype(reamCreateRequest.getPapertypeId());
        Ream ream = reamCreateRequestToReam(reamCreateRequest, papertype);
        Ream save = stockRepository.save(ream);
        return reamToReamCreateResponse(save);
    }


    public List<StockDto> getAllStocks(int offset, int limit){
        List<Stock> stocks = stockRepository.findAllStocksFetchingPapertype(offset, limit);
        return stocks.stream().map(StockDto::new).toList();
    }

    /**
     * method
     */

    private Papertype getPapertype(Long papertypeId) {
        return papertypeRepository.findById(papertypeId).orElseThrow(() -> new EntityNotFoundException("papertype not found"));
    }

    /**
     * ROLL converter method using MapStruct
     */
    private static Roll rollCreateRequestToRoll(RollCreateRequest rollCreateRequest, Papertype papertype) {
        Roll roll = StockMapper.INSTANCE.rollCreeateRequestToRoll(rollCreateRequest);
        roll.changePapertype(papertype);
        roll.changePaperLength(ROLL_LENGTH);
        return roll;
    }

    private static RollCreateResponse rollToRollCreateResponse(Roll save) {
        RollCreateResponse rollCreateResponse = StockMapper.INSTANCE.rollToRollCreateResponse(save);
        rollCreateResponse.setStockId(save.getId());
        rollCreateResponse.setPackaging(save.getPackagingType());
        return rollCreateResponse;
    }

    /**
     * REAM converter method using MapStruct
     */
    private static Ream reamCreateRequestToReam(ReamCreateRequest reamCreateRequest, Papertype papertype) {
        Ream ream = StockMapper.INSTANCE.reamCreateRequestToReam(reamCreateRequest);
        ream.changePapertype(papertype);
        return ream;
    }

    private static ReamCreateResponse reamToReamCreateResponse(Ream save) {
        ReamCreateResponse reamCreateResponse = StockMapper.INSTANCE.reamToReamCreateResponse(save);
        reamCreateResponse.setStockId(save.getId());
        reamCreateResponse.setPackaging(save.getPackagingType());
        return reamCreateResponse;
    }

}
