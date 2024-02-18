package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.stock.Papertype;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class PapertypeDto {
    private Long id;
    private String name;

    public PapertypeDto(Papertype papertype) {
        this.id = papertype.getId();
        this.name = papertype.getName();
    }
}
