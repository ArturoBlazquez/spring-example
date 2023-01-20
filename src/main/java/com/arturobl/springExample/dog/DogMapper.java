package com.arturobl.springExample.dog;

import static java.time.temporal.ChronoUnit.YEARS;

import java.time.LocalDate;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface DogMapper {

    @Mapping(target = "id", ignore = true)
    Dog toDomain(DogRequestDto dogDto);

    @Mapping(target = "age", source = "birthDate", qualifiedByName = "birthDateToAge")
    DogResponseDto toDto(Dog dog);

    List<DogResponseDto> toDto(List<Dog> dogs);

    @Named("birthDateToAge")
    default long birthYearToAge(LocalDate birthDate) {
        return YEARS.between(birthDate, LocalDate.now());
    }

}

