package org.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.entities.PersonalDetailsEntity;
import org.training.service.PersonalDetailService;

@RestController
public class PersonalDetailController {
	
	@Autowired
	PersonalDetailService personalDetailService;
	
	
	@PostMapping(value="/display", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	private HttpStatus personalDetails(@RequestBody PersonalDetailsEntity personalDetailsEntity)
	{
		personalDetailService.save(personalDetailsEntity);
		return HttpStatus.CREATED;
	}
	
	@RequestMapping("/display")
	private List<PersonalDetailsEntity> getDetails()
	{
		return personalDetailService.find();
	}
	
	

}
