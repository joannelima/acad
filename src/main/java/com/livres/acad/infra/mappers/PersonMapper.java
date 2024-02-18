package com.livres.acad.infra.mappers;

import com.livres.acad.domain.entity.Person;
import com.livres.acad.infra.persistence.entity.PersonEntity;

public class PersonMapper {

    public PersonEntity toEntity(Person personDomain){
        return PersonEntity.builder()
                .birthday(personDomain.birthday())
                .name(personDomain.name())
                .password(personDomain.password())
                .build();
    }

    public Person toDomain(PersonEntity personEntity){
        return new Person(personEntity.getName(), personEntity.getBirthday(), personEntity.getPassword());
    }
}
