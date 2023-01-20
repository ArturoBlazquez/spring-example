package com.arturobl.springExample.dog;

import java.util.List;

import javax.validation.Valid;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dogs")
@RequiredArgsConstructor
public class DogController {

    private final DogService service;

    private final DogMapper mapper;

    @GetMapping
    public List<DogResponseDto> getAllDogs() {
        List<Dog> dogs = service.getAllDogs();
        return mapper.toDto(dogs);
    }

    @GetMapping("{dogId}")
    public DogResponseDto getDog(@PathVariable Long dogId) {
        Dog dog = service.getDog(dogId);
        return mapper.toDto(dog);
    }

    @PostMapping
    public DogResponseDto createDog(@Valid @RequestBody DogRequestDto dogRequest) {
        Dog dogToCreate = mapper.toDomain(dogRequest);
        Dog createdDog = service.createDog(dogToCreate);
        return mapper.toDto(createdDog);
    }

    @PutMapping("{dogId}")
    public DogResponseDto editDog(@PathVariable Long dogId, @Valid @RequestBody DogRequestDto dogRequest) {
        Dog newDogData = mapper.toDomain(dogRequest);
        Dog editedDog = service.editDog(dogId, newDogData);
        return mapper.toDto(editedDog);
    }

    @DeleteMapping("{dogId}")
    public void deleteDog(@PathVariable Long dogId) {
        service.deleteDog(dogId);
    }

}

