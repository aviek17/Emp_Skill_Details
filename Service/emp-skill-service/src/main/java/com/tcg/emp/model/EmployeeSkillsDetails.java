package com.tcg.emp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "emp_skills_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmployeeSkillsDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "emp_details_id")
    private EmployeeDetails employeeDetails;
    
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    
    private String skillInYears;
    private String lastUsedIn;
    private String certificateName;
    private String proficiency; 

}
