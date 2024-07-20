package com.livres.acad.domain.entity;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void shouldReturnExceptionWhenNameIsBlankTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("", LocalDate.of(2024, 01, 02), "23232"));
    }

    @Test
    public void shouldReturnExceptionWhenBirthdayIsInvalid(){

    }

    @Test
    public void shouldReturnPersonWithSucessTest(){
        Person person = new Person("Jose", LocalDate.of(2010, 10, 12), "23232");
        Assertions.assertEquals("Jose", person.name);
        Assertions.assertEquals(LocalDate.of(2010, 10, 12), person.birthday);
        Assertions.assertEquals("23232", person.password);

    }

}
