package com.paperware.papyrus.service;

import com.paperware.papyrus.domain.company.Company;
import com.paperware.papyrus.domain.company.CompanyRelation;
import com.paperware.papyrus.domain.enumerator.CompanyRelationStatus;
import com.paperware.papyrus.repository.CompanyRelationRepository;
import com.paperware.papyrus.repository.CompanyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyRelationService {

    private final CompanyRelationRepository companyRelationRepository;
    private final CompanyRepository companyRepository;

    public void establishRelation(Long fromCompanyId, Long toCompanyId){
        Company fromCompany = companyRepository.findById(fromCompanyId).orElseThrow(() -> new EntityNotFoundException("company not found"));
        Company toCompany = companyRepository.findById(toCompanyId).orElseThrow(() -> new EntityNotFoundException("company not found"));
        companyRelationRepository.save(new CompanyRelation(fromCompany, toCompany, CompanyRelationStatus.ESTABLISHED));
    }
}
