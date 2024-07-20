package com.livres.acad.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class Person {

    public String name;
    public LocalDate birthday;
    public String password;

    public Person(String name, LocalDate birthday, String password) {
        validName(name);
        this.name = name;
        this.birthday = birthday;
        this.password = password;
    }

    public void validName(String name){
        if(name.isBlank())
            throw new IllegalArgumentException("O nome deve ser obrigatório");
    }


}
