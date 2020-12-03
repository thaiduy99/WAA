package edu.mum.rest_ajax.domain;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@NotBlank
	@Size(min = 4, max = 20, message = "{Size.firstname.validation}")
    private String firstName;

	@NotBlank
	@Size(min = 4, max = 20, message = "{Size.lastname.validation}")
    private String lastName;

	@NotBlank
	@Email
    private String email;
}
