package com.paperware.papyrus.controller;

import com.paperware.papyrus.Result;
import com.paperware.papyrus.dto.CompanyDto;
import com.paperware.papyrus.dto.CompanyRequest;
import com.paperware.papyrus.dto.CompanyResponse;
import com.paperware.papyrus.service.CompanyRelationService;
import com.paperware.papyrus.service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyApiController {
    private final CompanyService companyService;
    private final CompanyRelationService companyRelationService;

    @PostMapping("api/company")
    public CompanyResponse addCompany(@Valid @RequestBody CompanyRequest companyRequest){
        return companyService.createCompany(companyRequest);
    }

    @GetMapping("api/company")
    public Result<List<CompanyDto>> getCompany(){
        List<CompanyDto> companies = companyService.findAll();
        return new Result<>(companies.size(), companies);
    }

    @PostMapping("api/company/relation/establish")
    public void establishRelation(
            @RequestParam(name = "fromCompanyId") Long fromCompanyId,
            @RequestParam(name = "toCompanyId") Long toCompanyId){
        companyRelationService.establishRelation(fromCompanyId, toCompanyId);
    }
}
