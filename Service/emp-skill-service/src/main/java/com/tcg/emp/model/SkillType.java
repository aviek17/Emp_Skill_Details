package com.tcg.emp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "skill_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SkillType {

	@Id
    private String skillTypeId;
    
    private String skillType;
    
    private boolean active;
    
    public SkillType(String skillTypeId) {
    	this.skillTypeId = skillTypeId;
    }
}
