package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.SheetsPerReam;
import lombok.Data;

@Data
public class ReamCreateRequest {
    private Long papertypeId;
    private int gsm;
    private Manufacturer manufacturer;
    private int paperWidth;
    private int paperLength;
    private SheetsPerReam sheetsPerReam;
    private int initialSheets;
}
