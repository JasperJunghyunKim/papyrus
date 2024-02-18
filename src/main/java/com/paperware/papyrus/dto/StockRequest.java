package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.enumerator.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@NotNull
public class StockRequest {
    private Long papertypeId;
    @NotBlank @Min(1)
    private int gsm;
    private Manufacturer manufacturer;
    private int paperWidth;
    private int paperLength;

    private Packaging packaging;
    private int initialQuantity;

    // Roll
    private int pipeWidth;
    private PipeWidthUnit pipeWidthUnit;

    // Ream
    private SheetsPerReam sheetsPerReam;

    // Skid
    // none

    // Box
    private PacksPerBox packsPerBox;
    private SheetsPerPack sheetsPerPack;
}
