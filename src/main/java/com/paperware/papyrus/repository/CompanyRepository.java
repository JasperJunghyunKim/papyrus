package com.paperware.papyrus.repository;

import com.paperware.papyrus.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
