package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.stock.Papertype;
import lombok.Data;

@Data
public class PapertypeResponse {
    private Long papertype_id;
    private String papertype_name;

    public PapertypeResponse(Papertype papertype) {
        this.papertype_id = papertype.getId();
        this.papertype_name = papertype.getName();
    }
}
