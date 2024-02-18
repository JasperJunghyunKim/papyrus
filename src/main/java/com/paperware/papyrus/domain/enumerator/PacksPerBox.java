package com.paperware.papyrus.domain.enumerator;

import lombok.Getter;

@Getter
public enum PacksPerBox {
    _4(4),
    _5(5),
    _6(6),
    _8(8);

    // Getter
    private final int code;

    // Constructor
    PacksPerBox(int code) {
        this.code = code;
    }

}
