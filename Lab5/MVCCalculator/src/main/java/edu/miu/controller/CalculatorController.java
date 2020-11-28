package edu.miu.controller;

import edu.miu.model.Calculator;
import edu.miu.service.CalculatorService;
import edu.miu.validator.CalculatorValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String loadCalc(@ModelAttribute("newCalculator") Calculator calculator) {
        return "Display";
    }

    @RequestMapping(value = "/calculatorSave")
    public String calc(Calculator calculator, Model model, RedirectAttributes redirectAttributes) {
        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {
            calculatorService.add(calculator);
            calculatorService.mult(calculator);

            redirectAttributes.addFlashAttribute(calculator);
            redirectAttributes.addFlashAttribute("greeting", "The calculation have been done. Please try again!");

            return "redirect:/display";
        } else {
            model.addAttribute("errors", errors);
            model.addAttribute("calculator", calculator);
            return "Display";
        }
    }

    @GetMapping(value = {"/display"})
    public String display(){
        System.out.println("Display here.....");
        return "Result";
    }
}
