package com.livres.acad.application.usecases;

import com.livres.acad.application.gateways.PersonGateway;
import com.livres.acad.domain.entity.Person;

public class CreatePersonUseCase {
    private PersonGateway personGateway;

    public CreatePersonUseCase(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    public Person createPerson(Person person){
        return personGateway.createPerson(person);
    }
}
