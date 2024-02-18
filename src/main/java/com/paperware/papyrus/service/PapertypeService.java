package com.paperware.papyrus.service;

import com.paperware.papyrus.domain.stock.Papertype;
import com.paperware.papyrus.dto.PapertypeDto;
import com.paperware.papyrus.dto.PapertypeResponse;
import com.paperware.papyrus.repository.PapertypeRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PapertypeService {

    private final PapertypeRepository papertypeRepository;

    public PapertypeResponse createPapertype(String name){
        Papertype save = papertypeRepository.save(new Papertype(name));
        return new PapertypeResponse(save);
    }

    public List<PapertypeDto> getPapertype() {
        return papertypeRepository.findAll().stream().map(PapertypeDto::new).collect(Collectors.toList());

    }
}
