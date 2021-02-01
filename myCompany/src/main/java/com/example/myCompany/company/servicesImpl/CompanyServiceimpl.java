package com.example.myCompany.company.servicesImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myCompany.company.dao.CompanyDao;
import com.example.myCompany.company.entities.Company;
import com.example.myCompany.company.services.CompanyService;

@Service
public class CompanyServiceimpl implements CompanyService {

	private Long globalCompanyId = 100L;

	@Autowired
	private CompanyDao companyDao;

	/*
	 * List<Company> list;
	 * 
	 * public CompanyServiceimpl() { list = new ArrayList<>(); list.add(new
	 * Company(111, "ABC", "My First Comapny")); list.add(new Company(222, "DEF",
	 * "My Second Comapny")); }
	 */

	@Override
	public List<Company> getCompany(Long comapnyId) {

		if (null == comapnyId) {
			return this.companyDao.findAll();
		} else {
			return Arrays.asList(this.companyDao.findById(comapnyId).get());
		}

	}

	@Override
	public Company createCompany(Company company) {

		this.companyDao.save(company);
		return company;
	}

	@Override
	public Company updateCompany(Company company) {

		this.companyDao.save(company);
		return company;
	}

	@Override
	public void deleteCompany(Long companyId) {

		Company entity = companyDao.findById(companyId).get();
		this.companyDao.delete(entity);
	}

}
