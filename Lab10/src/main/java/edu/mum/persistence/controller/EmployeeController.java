package edu.mum.persistence.controller;

import edu.mum.persistence.domain.Employee;
import edu.mum.persistence.service.AddressService;
import edu.mum.persistence.service.EmployeeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class EmployeeController {

	private static final Log logger = LogFactory.getLog(EmployeeController.class);
	@Autowired
	EmployeeService empService;

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid Employee emp, BindingResult bindingResult,
			Model model) {
		
		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}

		// save product here
		model.addAttribute("employee", emp);
		empService.save(emp);

		return "EmployeeDetails";
	}

	@GetMapping(value = { "search_employeeform" })
	public String search() {
		return "SearchEmployeeForm";
	}

	@PostMapping(value = { "search_employee" })
	public String search(@Param("search") String number, Model model) {
		Employee emp = empService.getEmployeeByNumber(Integer.parseInt(number));

		if (emp != null) {
			model.addAttribute("employee", emp);
			return "EmployeeDetails";
		}

		return "SearchEmployeeForm";
	}
}
