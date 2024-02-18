package com.paperware.papyrus.dto;

import lombok.Data;

@Data
public class CompanyResponse {
    private Long id;
    private String registrationNo;
    private String companyNameOfficial;
    private String companyNameNickname;
    private String representative;
    private String phoneNo;
    private String faxNo;
    private String address;
    private String detailAddress;
    private String zonecode;
    private String industryType;
    private String businessType;

    public CompanyResponse(Long id, String registrationNo, String companyNameOfficial, String companyNameNickname, String representative, String phoneNo, String faxNo, String address, String detailAddress, String zonecode, String industryType, String businessType) {
        this.id = id;
        this.registrationNo = registrationNo;
        this.companyNameOfficial = companyNameOfficial;
        this.companyNameNickname = companyNameNickname;
        this.representative = representative;
        this.phoneNo = phoneNo;
        this.faxNo = faxNo;
        this.address = address;
        this.detailAddress = detailAddress;
        this.zonecode = zonecode;
        this.industryType = industryType;
        this.businessType = businessType;
    }
}
