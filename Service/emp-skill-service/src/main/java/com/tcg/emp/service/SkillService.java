package com.tcg.emp.service;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.tcg.emp.dto.SkillRequest;
import com.tcg.emp.dto.SkillResponse;
import com.tcg.emp.dto.SkillTypeResponse;
import com.tcg.emp.model.Skill;
import com.tcg.emp.model.SkillType;
import com.tcg.emp.repo.SkillRepository;
import com.tcg.emp.repo.SkillTypeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SkillService {

	@Autowired
	private SkillTypeRepository skillTypeRepo;
	
	@Autowired
	private SkillRepository skillInfoRepo;
	
	public List<SkillTypeResponse> getAllSkillType() throws ParseException {
		log.info("Entered Skill Type Service");
		List<SkillType> skillTypeList = skillTypeRepo.findAllByActiveOrderBySkillTypeAsc(Boolean.TRUE);
		
		List<SkillTypeResponse> skillTypes = Collections.emptyList();
		if (!CollectionUtils.isEmpty(skillTypeList)) {
			skillTypes = skillTypeList.stream().map(st -> new SkillTypeResponse(st)).collect(Collectors.toList());
		}
		
		return skillTypes;		
	}
	
	public List<SkillResponse> getAllSkills(SkillRequest request) throws ParseException{
		
		log.info("Entered Skill Info List Service");
		
		List<Skill> skillList = skillInfoRepo.findAllByActiveAndSkillTypeOrderBySkillNameAsc(Boolean.TRUE,new SkillType(request.getSkillTypeId()));
		
		List<SkillResponse> skills = Collections.emptyList();
		if (!CollectionUtils.isEmpty(skillList)) {
			skills = skillList.stream().map(st -> new SkillResponse(st)).collect(Collectors.toList());
		}
		
		return skills;
	}
}
