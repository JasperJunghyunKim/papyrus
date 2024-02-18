package com.paperware.papyrus.domain.company;


import com.paperware.papyrus.domain.enumerator.CompanyRelationStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class CompanyRelation {

    /**
     * fields
     */
    @Id
    @GeneratedValue
    @Column(name = "COMPANY_RELATION_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FROM_COMPANY_ID", nullable = false)
    private Company fromCompany;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TO_COMPANY_ID", nullable = false)
    private Company toCompany;
    @Enumerated(EnumType.STRING)
    private CompanyRelationStatus companyRelationStatus;

    /**
     * constructor
     */
    public CompanyRelation(Company fromCompany, Company toCompany, CompanyRelationStatus companyRelationStatus) {
        this.fromCompany = fromCompany;
        this.toCompany = toCompany;
        this.companyRelationStatus = companyRelationStatus;
    }

    /**
     * atomic relation method
     */

    /**
     * change method (i.e., alternative of @Setter)
     */

    /**
     * static create method
     */

    /**
     * business method
     */
}
