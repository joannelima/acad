package com.livres.acad.infra.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.livres.acad.application.usecases.CreatePersonUseCase;
import com.livres.acad.domain.entity.Person;
import com.livres.acad.infra.controllers.dto.PersonDTO;
import com.livres.acad.infra.mappers.PersonDTOMapper;

@RestController
@RequestMapping("/person")
public class PersonController {
    
    private final CreatePersonUseCase createPersonUseCase;
    
    private final PersonDTOMapper personDTOMapper;

    public PersonController(CreatePersonUseCase createPersonUseCase, PersonDTOMapper personDTOMapper) {
        this.createPersonUseCase = createPersonUseCase;
        this.personDTOMapper = personDTOMapper;
    }

    @PostMapping
    public PersonDTO save(@RequestBody PersonDTO personDTO){
        return personDTOMapper.toDTO(createPersonUseCase.createPerson(personDTOMapper.toDomain(personDTO)));
    }
}
