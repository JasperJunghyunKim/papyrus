package com.paperware.papyrus.domain.enumerator;

import lombok.Getter;

@Getter
public enum SheetsPerReam {
    _100(100),
    _125(125),
    _150(150),
    _200(200),
    _250(250);

    // Getter
    private final int code;

    // Constructor
    SheetsPerReam(int code) {
        this.code = code;
    }

}
