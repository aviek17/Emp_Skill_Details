package com.tcg.emp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcg.emp.model.Skill;
import com.tcg.emp.model.SkillType;

@Repository
public interface SkillRepository extends JpaRepository<Skill, String> {
	
	List<Skill> findAllByActiveAndSkillTypeOrderBySkillNameAsc(boolean active, SkillType skillType );
}
