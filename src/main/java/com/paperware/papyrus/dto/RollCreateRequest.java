package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.enumerator.Manufacturer;
import com.paperware.papyrus.domain.enumerator.PipeWidthUnit;
import lombok.Data;

@Data
public class RollCreateRequest {
    private Long papertypeId;
    private int gsm;
    private Manufacturer manufacturer;
    private int paperWidth;
    private int pipeWidth;
    private PipeWidthUnit pipeWidthUnit;
    private int initialRollLength;
}
