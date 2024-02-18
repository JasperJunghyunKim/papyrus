package com.paperware.papyrus.dto;

import com.paperware.papyrus.domain.company.CompanyRelation;
import com.paperware.papyrus.domain.enumerator.CompanyRelationStatus;
import lombok.Data;

@Data
public class CompanyRelationDto {
    private Long companyRelationId;
    private Long fromCompanyId;
    private Long toCompanyId;
    private CompanyRelationStatus companyRelationStatus;

    public CompanyRelationDto(CompanyRelation companyRelation) {
        this.companyRelationId = companyRelation.getId();
        this.fromCompanyId = companyRelation.getFromCompany().getId();
        this.toCompanyId = companyRelation.getToCompany().getId();
        this.companyRelationStatus = companyRelation.getCompanyRelationStatus();
    }
}
