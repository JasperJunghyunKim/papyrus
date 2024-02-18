package com.paperware.papyrus.controller;

import com.paperware.papyrus.Result;
import com.paperware.papyrus.dto.PapertypeDto;
import com.paperware.papyrus.dto.PapertypeResponse;
import com.paperware.papyrus.service.PapertypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PapertypeApiController {
    private final PapertypeService papertypeService;

    @PostMapping("/api/papertype")
    public PapertypeResponse createPapertype(@RequestParam(name = "papertypeName") String papertypeName){
        return papertypeService.createPapertype(papertypeName);
    }

    @GetMapping("api/papertype")
    public Result<List<PapertypeDto>> getPapertype(){
        List<PapertypeDto> papertypeDtos = papertypeService.getPapertype();
        return new Result<>(papertypeDtos.size(), papertypeDtos);
    }
}
