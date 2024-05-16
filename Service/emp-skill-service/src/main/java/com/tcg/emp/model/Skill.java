package com.tcg.emp.model;

import javax.persistence.Entity;
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
@Table(name = "skills")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Skill {
	@Id
    private String skillId;
    
    @ManyToOne
    @JoinColumn(name = "skill_type_id")
    private SkillType skillType;
    
    private String skillName;
    
    private boolean active;
}
