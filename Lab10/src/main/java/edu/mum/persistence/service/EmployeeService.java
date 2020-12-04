package edu.mum.persistence.service;

import edu.mum.persistence.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee save(Employee emp);
    public List<Employee> getAll();
    public Employee getEmployeeByNumber(int number);
}
