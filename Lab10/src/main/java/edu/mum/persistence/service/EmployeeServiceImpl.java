package edu.mum.persistence.service;

import edu.mum.persistence.domain.Employee;
import edu.mum.persistence.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository empRepository;

    @Override
    public Employee save(Employee emp) {
        return empRepository.save(emp);
    }

    @Override
    public List<Employee> getAll() {
        Iterable<Employee> itr = empRepository.findAll();
        List<Employee> list = new ArrayList<>();
        itr.forEach(emp -> list.add(emp));
        return list;
    }

    @Override
    public Employee getEmployeeByNumber(int number) {
        return empRepository.locateOneEmployeeByHisNumber(number);
    }
}
