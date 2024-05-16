package com.tcg.emp.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcg.emp.dto.SkillRequest;
import com.tcg.emp.dto.SkillResponse;
import com.tcg.emp.dto.SkillTypeResponse;
import com.tcg.emp.service.SkillService;

@RestController
@CrossOrigin
@RequestMapping({ "/skill" })
public class SkillController {
	
	@Autowired
	private SkillService skillService;

	@GetMapping(value="/type")
    public ResponseEntity<List<SkillTypeResponse>> getLogo() throws ParseException{
    	return new ResponseEntity<>(skillService.getAllSkillType(), HttpStatus.OK);
    }
	
	@PostMapping("/list")
	public ResponseEntity<List<SkillResponse>> getPlantDataSim(@RequestBody @Valid SkillRequest request) throws ParseException{
	   return new ResponseEntity<>(skillService.getAllSkills(request) , HttpStatus.OK);
	}
}
