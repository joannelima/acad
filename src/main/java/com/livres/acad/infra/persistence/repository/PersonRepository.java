package com.livres.acad.infra.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.livres.acad.infra.persistence.entity.PersonEntity;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {
}
