package edu.miu.controller;

import edu.miu.model.Calculator;
import edu.miu.service.CalculatorService;
import edu.miu.validator.CalculatorValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorValidator calculatorValidator;

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = {"/", "/calculator"})
    public String loadCalc(Calculator calculator) {
        return "Display";
    }

    @RequestMapping(value = "/calculatorSave")
    public String calc(Calculator calculator, HttpServletRequest request,
                       HttpServletResponse response) {


        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {

            calculatorService.add(calculator);
            calculatorService.mult(calculator);

            request.setAttribute("calculator", calculator);
            return "Result";
        } else {

            // store errors and calculator in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/jsp/Display.jsp";
        }
    }
}
