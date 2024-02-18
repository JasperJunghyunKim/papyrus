package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.common.Address;
import com.paperware.papyrus.domain.company.Company;
import com.paperware.papyrus.domain.company.CompanyRelation;
import jakarta.persistence.Embedded;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CompanyDto {
    private Long companyId;
    private String registrationNo;
    private String companyNameOfficial;
    private String companyNameNickname;
    private String representative;
    private String phoneNo;
    private String faxNo;
    private Address companyAddress;
    private String industryType;
    private String businessType;

    private List<CompanyRelationDto> fromCompanyRelationList;
    private List<CompanyRelationDto> toCompanyRelationList;

    public CompanyDto(Company company) {
        this.companyId = company.getId();
        this.registrationNo = company.getRegistrationNo();
        this.companyNameOfficial = company.getCompanyNameOfficial();
        this.companyNameNickname = company.getCompanyNameNickname();
        this.representative = company.getRepresentative();
        this.phoneNo = company.getPhoneNo();
        this.faxNo = company.getFaxNo();
        this.companyAddress = company.getCompanyAddress();
        this.industryType = company.getIndustryType();
        this.businessType = company.getBusinessType();
        this.fromCompanyRelationList = company.getFromCompanyRelationList().stream().map(CompanyRelationDto::new).collect(Collectors.toList());
        this.toCompanyRelationList = company.getToCompanyRelationList().stream().map(CompanyRelationDto::new).collect(Collectors.toList());
    }
}
