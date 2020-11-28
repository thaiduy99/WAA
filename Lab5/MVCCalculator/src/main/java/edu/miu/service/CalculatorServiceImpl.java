package edu.miu.service;


import edu.miu.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public void add(Calculator calculator) {
        calculator.add();
    }

    public void mult(Calculator calculator) {
        calculator.mult();
    }

}
