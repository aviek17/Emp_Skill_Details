package com.tcg.emp.dto;

import com.tcg.emp.model.Skill;

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
public class SkillResponse {
	 private String skillId;
	 private String skillName;
//	 private SkillTypeResponse skillType;
//	 private boolean active;
	 
	 public SkillResponse(Skill skill) {
			if (null != skill) {
				this.skillId = skill.getSkillId();
				this.skillName = skill.getSkillName();
//				this.skillType = new SkillTypeResponse(skill.getSkillType());
//				this.setActive(skill.isActive());
			}
		}
}


