package com.tcg.emp.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmpDetailsRequest {
	private String empId;	    
    private String empName;    
    private String empEmail;    
    private List<EmpSkillDetailsRequest> empSkillDetails;
}
