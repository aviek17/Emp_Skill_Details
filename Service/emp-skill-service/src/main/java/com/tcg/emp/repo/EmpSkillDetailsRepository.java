package com.tcg.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcg.emp.model.EmployeeSkillsDetails;

public interface EmpSkillDetailsRepository extends JpaRepository<EmployeeSkillsDetails, Long> {

}
