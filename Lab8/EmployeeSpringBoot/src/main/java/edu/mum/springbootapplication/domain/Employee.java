package edu.mum.springbootapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
	private static final long serialVersionUID = -908L;

	private Long id;
	
	@NotEmpty // any characters including "space"
//	 @NotNull
//	 @NotBlank // must have characters BESIDES "space"
	@Size(min = 4, max = 50, message = "{Size.name.validation}")
	private String firstName;
	
	@NotEmpty(message = "Enter the last name")
	private String lastName;

	@NotNull
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	// @DateTimeFormat(iso = ISO.DATE) // yyyy-MM-dd
	// @DateTimeFormat(style = "L-") // July 12, 2001
	// @DateTimeFormat(pattern="hh:mm:ss")
	@Past
	private LocalDate birthDate;

	// @NotEmpty //Gives NO Integer validation exception
	@NotNull
	private Integer salaryLevel;

	@Valid
	private Address address;

}
