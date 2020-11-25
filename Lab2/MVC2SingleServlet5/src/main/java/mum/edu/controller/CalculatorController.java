package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.model.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.annotation.Controller;
import mum.edu.service.CalculatorService;
import mum.edu.validator.CalculatorValidator;


@Controller
public class CalculatorController {


    @AutoWired
    CalculatorValidator calculatorValidator;

    @AutoWired
    CalculatorService calculatorService;

    @RequestMapping(value = {"/", "/calculator"})
    public String loadCalc(Calculator calculator) {
        return "/WEB-INF/jsp/Display.jsp";
    }

    @RequestMapping(value = "/calculatorSave")
    public String calc(Calculator calculator, HttpServletRequest request,
                             HttpServletResponse response) {


        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {

            calculatorService.add(calculator);
            calculatorService.mult(calculator);

            request.setAttribute("calculator", calculator);
            return "/WEB-INF/jsp/Result.jsp";
        } else {

            // store errors and calculator in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/jsp/Display.jsp";
        }
    }
}
