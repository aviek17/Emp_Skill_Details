package com.tcg.emp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmployeeDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String empId;
    
    private String empName;
    
    private String empEmail;
    
    @OneToMany(mappedBy = "employeeDetails")
    private List<EmployeeSkillsDetails> empSkillDetails;
}
