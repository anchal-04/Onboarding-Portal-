package org.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.entities.PersonalDetailsEntity;
import org.training.repository.PersonalDetailRepository;

@Service
public class PersonalDetailService {
	
	@Autowired
	PersonalDetailRepository personalDetailRepository;
	
	
	
	
	public String save(PersonalDetailsEntity personalDetailsEntity)
	{
		personalDetailRepository.save(personalDetailsEntity);
		return null;
	}
	public List<PersonalDetailsEntity> find()
	{
		List<PersonalDetailsEntity> personalDetailsEntity = new ArrayList<>();
		personalDetailRepository.findAll().forEach(personalDetailsEntity::add);
		return personalDetailsEntity;
	}

}
