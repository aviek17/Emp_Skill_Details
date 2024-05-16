package com.tcg.emp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcg.emp.model.SkillType;

@Repository
public interface SkillTypeRepository extends JpaRepository<SkillType, String> {
	List<SkillType> findAllByActiveOrderBySkillTypeAsc(boolean active);
}
