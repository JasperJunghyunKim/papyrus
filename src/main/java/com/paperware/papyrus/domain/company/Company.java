package com.paperware.papyrus.domain.company;

import com.paperware.papyrus.domain.common.Address;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"registrationNo"}))
public class Company {
    /**
     * fields
     */
    @Id
    @GeneratedValue
    @Column(name = "COMPANY_ID")
    private Long id;
    private String registrationNo;
    private String companyNameOfficial;
    private String companyNameNickname;
    private String representative;
    private String phoneNo;
    private String faxNo;
    @Embedded
    private Address companyAddress;
    private String industryType;
    private String businessType;

    /**
     * fields - collection
     */
    @OneToMany(mappedBy = "fromCompany")
    private List<CompanyRelation> fromCompanyRelationList = new ArrayList<>();

    @OneToMany(mappedBy = "toCompany")
    private List<CompanyRelation> toCompanyRelationList = new ArrayList<>();

    /**
     * constructor
     */
    public Company(String registrationNo, String companyNameOfficial, String companyNameNickname, String representative, String phoneNo, String faxNo, Address companyAddress, String industryType, String businessType) {
        this.registrationNo = registrationNo;
        this.companyNameOfficial = companyNameOfficial;
        this.companyNameNickname = companyNameNickname;
        this.representative = representative;
        this.phoneNo = phoneNo;
        this.faxNo = faxNo;
        this.companyAddress = companyAddress;
        this.industryType = industryType;
        this.businessType = businessType;
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
