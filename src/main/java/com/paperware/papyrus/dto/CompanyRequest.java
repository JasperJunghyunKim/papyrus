package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.common.Address;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CompanyRequest {
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
}
