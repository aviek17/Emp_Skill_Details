package com.tcg.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcg.emp.model.EmployeeDetails;

public interface EmpDetailsRepository extends JpaRepository<EmployeeDetails, String> {
	
}
