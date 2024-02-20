package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.Packaging;
import com.paperware.papyrus.domain.enumerator.PipeWidthUnit;
import com.paperware.papyrus.domain.stock.Papertype;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RollCreateResponse {
    @NotNull
    private Long stockId;
    private Packaging packaging;
    private Papertype papertype;
    private int gsm;
    private Manufacturer manufacturer;
    private int paperWidth;
    private int pipeWidth;
    private PipeWidthUnit pipeWidthUnit;
    private int initialRollLength;

    public RollCreateResponse(Long stockId, Packaging packaging, Papertype papertype, int gsm, Manufacturer manufacturer, int paperWidth, int pipeWidth, PipeWidthUnit pipeWidthUnit, int initialRollLength) {
        this.stockId = stockId;
        this.packaging = packaging;
        this.papertype = papertype;
        this.gsm = gsm;
        this.manufacturer = manufacturer;
        this.paperWidth = paperWidth;
        this.pipeWidth = pipeWidth;
        this.pipeWidthUnit = pipeWidthUnit;
        this.initialRollLength = initialRollLength;
    }
}


