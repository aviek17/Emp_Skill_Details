package com.tcg.emp.dto;

import com.tcg.emp.model.SkillType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SkillTypeResponse {
	
	private String skillTypeId;
    
    private String skillType;
    
//    private boolean active;
    
    public SkillTypeResponse(SkillType skillType) {
		if (null != skillType) {
			this.skillTypeId = skillType.getSkillTypeId();
			this.skillType = skillType.getSkillType();
//			this.setActive(skillType.isActive());
		}
	}
}
