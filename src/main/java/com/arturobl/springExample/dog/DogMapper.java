package com.arturobl.springExample.dog;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DogMapper {

    @Mapping(target = "id", ignore = true)
    Dog toDomain(DogRequestDto dogDto);

    DogResponseDto toDto(Dog dog);

    List<DogResponseDto> toDto(List<Dog> dogs);

}

