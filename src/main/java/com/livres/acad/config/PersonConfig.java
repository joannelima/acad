package com.livres.acad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.livres.acad.application.gateways.PersonGateway;
import com.livres.acad.application.usecases.CreatePersonUseCase;
import com.livres.acad.infra.gateway.PersonRepositoryJPA;
import com.livres.acad.infra.mappers.PersonDTOMapper;
import com.livres.acad.infra.mappers.PersonEntityMapper;
import com.livres.acad.infra.persistence.repository.PersonRepository;

@Configuration
public class PersonConfig {

    @Bean
    public CreatePersonUseCase createPerson(PersonGateway personGateway){
        return new CreatePersonUseCase(personGateway);
    }

    @Bean
    public PersonRepositoryJPA createRepository(PersonRepository personRepository, PersonEntityMapper personMapper){
        return new PersonRepositoryJPA(personRepository, personMapper);
    }

    @Bean
    public PersonEntityMapper createPersonEntityMapper(){
        return new PersonEntityMapper();
    }

    @Bean
    public PersonDTOMapper createMapper(){
        return new PersonDTOMapper();
    }

}
