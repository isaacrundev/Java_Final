package com.company_mngm_sys.demo;

import org.springframework.beans.factory.annotation.Autowired;

//don't change

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company_mngm_sys.demo.dao.EmployeeRepo;
import com.company_mngm_sys.demo.employees.Employees;

@SpringBootApplication
public class DemoApplication {

	@Autowired 
	EmployeeRepo empRepo;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// sample data
	}

	public void run() {
		Employees em1 = new Employees("firstName", "lastName", "hikari@gmail.com", "female", 12071995);

		empRepo.save(em1);
	}

}