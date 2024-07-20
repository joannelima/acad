package com.livres.acad.infra.mappers;

import com.livres.acad.domain.entity.Person;
import com.livres.acad.infra.controllers.dto.PersonDTO;

public class PersonDTOMapper {

    public Person toDomain(PersonDTO dto){
        return Person.builder()
                .birthday(dto.birthday())
                .name(dto.name())
                .password(dto.password())
                .build();
    }

    public PersonDTO toDTO(Person personEntity){
        return new PersonDTO(personEntity.getName(), personEntity.getBirthday(), personEntity.getPassword());
    }

}
