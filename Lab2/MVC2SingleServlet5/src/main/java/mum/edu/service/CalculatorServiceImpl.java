package mum.edu.service;

import mum.edu.model.Calculator;


public class CalculatorServiceImpl implements CalculatorService {


    public void add(Calculator calculator) {
        calculator.add();
    }

    public void mult(Calculator calculator) {
        calculator.mult();
    }

}
