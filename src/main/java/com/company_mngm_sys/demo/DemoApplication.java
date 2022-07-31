package com.company_mngm_sys.demo;

//don't change

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company_mngm_sys.demo.employees.Employees;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		//sample data
		// public void run(){
		// 	Employees em1 = new Employees("firstName","lastName","email", "birthday")
		// 	empRepo.save(em1);
		// }
	}

}
