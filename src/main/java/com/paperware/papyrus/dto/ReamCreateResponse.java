package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.Packaging;
import com.paperware.papyrus.domain.enumerator.PipeWidthUnit;
import com.paperware.papyrus.domain.enumerator.SheetsPerReam;
import com.paperware.papyrus.domain.stock.Papertype;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReamCreateResponse {
    @NotNull
    private Long stockId;
    private Packaging packaging;
    private Papertype papertype;
    private int gsm;
    private Manufacturer manufacturer;
    private int paperWidth;
    private int paperLength;
    private SheetsPerReam sheetsPerReam;
    private int initialSheets;
}
