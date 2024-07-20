package com.livres.acad.infra.controllers.dto;

import java.time.LocalDate;

public record PersonDTO(String name, LocalDate birthday, String password) {
}
