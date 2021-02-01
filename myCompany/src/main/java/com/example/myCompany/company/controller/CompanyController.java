package com.example.myCompany.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myCompany.company.entities.Company;
import com.example.myCompany.company.services.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/{companyId}")
	public List<Company> getCompany(@PathVariable String companyId) {
		return this.companyService.getCompany(Long.parseLong(companyId));
	}

	@PostMapping()
	public Company createCompany(@RequestBody Company company) {
		return this.companyService.createCompany(company);
	}

	@PutMapping()
	public Company updateCompany(@RequestBody Company company) {
		return this.companyService.updateCompany(company);
	}

	@DeleteMapping("/{companyId}")
	public ResponseEntity<HttpStatus> deleteCompany(@PathVariable String companyId) {
		try {
			this.companyService.deleteCompany(Long.parseLong(companyId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
