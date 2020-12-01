package edu.mum.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(FileNotFoundException.class)
    public ModelAndView handleError(HttpServletRequest req, FileNotFoundException exception) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("error", exception.getMessage());
        mav.setViewName("ImageNotFound");
        return mav;
    }
}
