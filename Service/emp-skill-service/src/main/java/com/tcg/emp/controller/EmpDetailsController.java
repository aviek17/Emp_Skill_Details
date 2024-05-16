package com.tcg.emp.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcg.emp.dto.EmpDetailsRequest;
import com.tcg.emp.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping({ "/employee" })
public class EmpDetailsController {
	
	@Autowired
    private EmployeeService empService;

	@PostMapping("/create")
	public ResponseEntity<String> saveEmpDetails(@RequestBody @Valid EmpDetailsRequest request) throws ParseException{
		System.out.println(request);
		return new ResponseEntity<>(empService.saveUserDetails(request) , HttpStatus.OK);
	}
}
