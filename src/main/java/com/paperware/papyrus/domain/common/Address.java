package com.paperware.papyrus.domain.common;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {
    private String address;
    private String detailAddress;
    private String zonecode;

    public Address(String address, String detailAddress, String zonecode) {
        this.address = address;
        this.detailAddress = detailAddress;
        this.zonecode = zonecode;
    }
}
