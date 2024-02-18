package com.paperware.papyrus.mapper;

import com.paperware.papyrus.domain.company.Company;
import com.paperware.papyrus.dto.CompanyRequest;
import com.paperware.papyrus.dto.CompanyResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    Company companyRequestToCompany(CompanyRequest companyRequest);

    CompanyResponse companyToCompanyResponse(Company company);
}
