package org.training.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.training.entities.*;

@Transactional
public interface PersonalDetailRepository extends CrudRepository<PersonalDetailsEntity,String> {

}
