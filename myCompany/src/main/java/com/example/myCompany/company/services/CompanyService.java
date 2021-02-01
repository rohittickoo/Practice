package com.example.myCompany.company.services;

import java.util.List;

import com.example.myCompany.company.entities.Company;

public interface CompanyService {

	public List<Company> getCompany(Long companyId);

	public Company createCompany(Company company);

	public Company updateCompany(Company company);

	public void deleteCompany(Long companyId);

}
