package com.arturobl.springExample.dog;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DogResponseDto {

    private Long id;

    private String name;

    private double height;

    private double weight;

    private int age;

}

