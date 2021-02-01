package com.example.myCompany.company.servicesImpl;

import org.junit.jupiter.api.Test;

public class CompanyServiceimplTest {
	
	CompanyServiceimpl companyServiceimpl = new CompanyServiceimpl(); 

	@Test
	public void testGetCompany() {
		companyServiceimpl.getCompany(null);
	}

}
