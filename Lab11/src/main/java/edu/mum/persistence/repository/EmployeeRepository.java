package edu.mum.persistence.repository;

import edu.mum.persistence.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Query(value = "select e from Employee e where e.number = :number")
    public Employee locateOneEmployeeByHisNumber(int number);
}
