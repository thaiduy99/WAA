package edu.mum.springbootapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @NotEmpty(message = "{String.empty}")
    private String street;
    private String city;

    @Size(min = 2, max = 2, message = "{Size.state}")
    private String state;

    private String zipCode;
}
