package com.tcg.emp.dto;

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
public class EmpSkillDetailsRequest {
    private String skillId;	    
    private String skillInYears;
    private String lastUsedIn;
    private String certificateName;
    private String proficiency; 
}
