package com.paperware.papyrus.service;

import com.paperware.papyrus.domain.common.Address;
import com.paperware.papyrus.domain.company.Company;
import com.paperware.papyrus.dto.CompanyDto;
import com.paperware.papyrus.dto.CompanyRequest;
import com.paperware.papyrus.dto.CompanyResponse;
import com.paperware.papyrus.mapper.CompanyMapper;
import com.paperware.papyrus.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyResponse createCompany(CompanyRequest companyRequest){
        // Company company = CompanyMapper.INSTANCE.companyRequestToCompany(companyRequest);
        // Company save = companyRepository.save(company);
        // return CompanyMapper.INSTANCE.companyToCompanyResponse(save);

        Company company = companyRequestToCompany(companyRequest);
        Company save = companyRepository.save(company);
        return CompanyToCompanyResponse(save);
    }

    public List<CompanyDto> findAll(){
        List<Company> companies = companyRepository.findAll();
        return companies.stream().map(CompanyDto::new).collect(Collectors.toList());
    }


    /**
     * static method
     */
    private static Company companyRequestToCompany(CompanyRequest companyRequest) {
        return new Company(
                companyRequest.getRegistrationNo(),
                companyRequest.getCompanyNameOfficial(),
                companyRequest.getCompanyNameNickname(),
                companyRequest.getRepresentative(),
                companyRequest.getPhoneNo(),
                companyRequest.getFaxNo(),
                new Address(companyRequest.getAddress(), companyRequest.getDetailAddress(), companyRequest.getZonecode()),
                companyRequest.getIndustryType(),
                companyRequest.getBusinessType()
        );
    }
    private static CompanyResponse CompanyToCompanyResponse(Company company) {
        return new CompanyResponse(
                company.getId(),
                company.getRegistrationNo(),
                company.getCompanyNameOfficial(),
                company.getCompanyNameNickname(),
                company.getRepresentative(),
                company.getPhoneNo(),
                company.getFaxNo(),
                company.getCompanyAddress().getAddress(),
                company.getCompanyAddress().getDetailAddress(),
                company.getCompanyAddress().getZonecode(),
                company.getIndustryType(),
                company.getBusinessType()
        );
    }

}
