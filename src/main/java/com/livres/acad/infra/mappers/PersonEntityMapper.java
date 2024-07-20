package com.livres.acad.infra.mappers;

import com.livres.acad.domain.entity.Person;
import com.livres.acad.infra.persistence.entity.PersonEntity;

public class PersonEntityMapper {

    public PersonEntity toEntity(Person personDomain){
        return PersonEntity.builder()
                .birthday(personDomain.getBirthday())
                .name(personDomain.getName())
                .password(personDomain.getPassword())
                .build();
    }

    public Person toDomain(PersonEntity personEntity){
        return Person.builder()
                .birthday(personEntity.getBirthday())
                .name(personEntity.getName())
                .password(personEntity.getPassword())
                .build();
    }
}
