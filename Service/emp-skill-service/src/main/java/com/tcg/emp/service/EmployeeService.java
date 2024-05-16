package com.tcg.emp.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcg.emp.dto.EmpDetailsRequest;
import com.tcg.emp.model.EmployeeDetails;
import com.tcg.emp.repo.EmpDetailsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {
	
	@Autowired
	private EmpDetailsRepository empDetailsRepo;
	
	public String saveUserDetails(EmpDetailsRequest request) throws ParseException{
		EmployeeDetails empdet = new EmployeeDetails();
		empdet.setEmpId("123");
		empdet.setEmpName("1234");
		empdet.setEmpEmail("something@email.com");
		empDetailsRepo.save(empdet);
		return "OK";
	}

}
