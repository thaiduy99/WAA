package edu.mum.springbootapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {

	@NotEmpty // any characters including "space"
	@Size(min = 4, max = 50, message = "{Size.name.validation}")
	private String firstName;

	@NotEmpty(message = "Enter the last name")
	private String lastName;

	@NotNull
	private Integer age;

	@NotNull
	private Integer memberNumber;
}
