package com.livres.acad.infra.gateway;

import com.livres.acad.application.gateways.PersonGateway;
import com.livres.acad.domain.entity.Person;
import com.livres.acad.infra.mappers.PersonEntityMapper;
import com.livres.acad.infra.persistence.entity.PersonEntity;
import com.livres.acad.infra.persistence.repository.PersonRepository;

public class PersonRepositoryJPA implements PersonGateway {
    private final PersonRepository personRepository;
    private final PersonEntityMapper personMapper;

    public PersonRepositoryJPA(PersonRepository personRepository, PersonEntityMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @Override
    public Person createPerson(Person person) {
        PersonEntity entity = personMapper.toEntity(person);
        return personMapper.toDomain(personRepository.save(entity));
    }
}
