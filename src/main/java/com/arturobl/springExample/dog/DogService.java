package com.arturobl.springExample.dog;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dog")
@RequiredArgsConstructor
public class DogService {

    private final DogRepository repository;

    public List<Dog> getAllDogs() {
        return repository.findAll();
    }

    public Dog getDog(Long id) {
        return repository.findById(id).get();
    }

    public Dog createDog(Dog dog) {
        return repository.save(dog);
    }

    public Dog editDog(Long id, Dog dog) {
        dog.setId(id);
        return repository.save(dog);
    }

    public void deleteDog(Long id) {
        repository.deleteById(id);
    }

}