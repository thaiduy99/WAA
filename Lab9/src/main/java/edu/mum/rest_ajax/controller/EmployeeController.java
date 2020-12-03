package edu.mum.rest_ajax.controller;

import javax.validation.Valid;

import edu.mum.rest_ajax.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmployeeController {

    @GetMapping(value = {"/", "/addEmployee"})
    public String showEmployForm(@ModelAttribute("employee") Employee employee){
        return "EmployeeForm";
    }
	
}
