package com.arturobl.springExample.dog;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DogRequestDto {

    @NotBlank
    @Size(min = 1, max = 50)
    private String name;

    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("2.0")
    private Double height;

    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("200.0")
    private Double weight;

    @NotNull
    @Past
    private LocalDate birthDate;

}