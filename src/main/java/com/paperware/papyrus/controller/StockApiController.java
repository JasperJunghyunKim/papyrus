package com.paperware.papyrus.controller;

import com.paperware.papyrus.Result;
import com.paperware.papyrus.dto.*;
import com.paperware.papyrus.service.StockService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StockApiController {

    private final StockService stockService;

    @PostMapping("api/stock/roll")
    public ResponseEntity<RollCreateResponse> createRoll(@Valid @RequestBody RollCreateRequest rollRequest){
        return ResponseEntity.ok(stockService.createRoll(rollRequest));
    }

    @PostMapping("api/stock/ream")
    public ResponseEntity<ReamCreateResponse> createReam(@Valid @RequestBody ReamCreateRequest reamCreateRequest){
        return ResponseEntity.ok(stockService.createReam(reamCreateRequest));
    }

    @GetMapping("api/stock")
    public Result<List<StockDto>> getAllStocks(
            @RequestParam(name = "offset", defaultValue = "0") int offset,
            @RequestParam(name = "limit", defaultValue = "50") int limit
    ){
        List<StockDto> allStocks = stockService.getAllStocks(offset, limit);
        return new Result<>(allStocks.size(), allStocks);
    }
}
