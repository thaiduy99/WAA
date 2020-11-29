package com.students.domain;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

public class Student {
	
	private Integer id;
	@NotBlank
	@Size(min = 4, max = 50, message = "{Size.name.validation}")
 	private String firstName = null;

	@NotBlank
 	private  String lastName  = null;

	@NotBlank
	@Email
 	private String email = null;

	@NotBlank
 	private String gender = null;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Past
    private LocalDate birthday;

	@Valid
	private Phone phone;

  	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
	   	
	   

}
