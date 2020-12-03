package edu.mum.rest_ajax.controller;

import edu.mum.rest_ajax.domain.Employee;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeRestController {

    @PostMapping(value = "/api/saveEmployee")
    public Employee add(@Valid  @RequestBody  Employee employee)  {
        return employee;
    }
}
