package com.paperware.papyrus.mapper;

import com.paperware.papyrus.domain.stock.Ream;
import com.paperware.papyrus.domain.stock.Roll;
import com.paperware.papyrus.dto.ReamCreateRequest;
import com.paperware.papyrus.dto.ReamCreateResponse;
import com.paperware.papyrus.dto.RollCreateRequest;
import com.paperware.papyrus.dto.RollCreateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StockMapper {
    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);

    /**
     * ROLL
     */
    Roll rollCreeateRequestToRoll(RollCreateRequest rollCreateRequest);
    RollCreateResponse rollToRollCreateResponse(Roll roll);

    /**
     * REAM
     */
    Ream reamCreateRequestToReam(ReamCreateRequest reamCreateRequest);
    ReamCreateResponse reamToReamCreateResponse(Ream ream);


}

