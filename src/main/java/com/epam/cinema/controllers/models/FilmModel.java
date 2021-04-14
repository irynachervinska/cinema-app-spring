package com.epam.cinema.controllers.models;

import com.epam.cinema.dtos.FilmDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class FilmModel extends RepresentationModel<FilmModel> {

    @JsonUnwrapped
    private FilmDto filmDto;
}
