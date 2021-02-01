package com.example.myCompany.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myCompany.company.entities.Company;

public interface CompanyDao extends JpaRepository<Company, Long> {

}
