package edu.mum.rest_ajax.controller;

import java.util.List;

import edu.mum.rest_ajax.domain.dto.DomainError;
import edu.mum.rest_ajax.domain.dto.DomainErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {

    @Autowired
    private MessageSourceAccessor messageAccessor ;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public DomainErrors handleException(MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

        DomainErrors errors = new DomainErrors();
        errors.setErrorType("ValidationError");
        for (FieldError fieldError : fieldErrors) {
            DomainError error = new DomainError(messageAccessor.getMessage(fieldError));
//            DomainError error = new DomainError(fieldError.getDefaultMessage());
            errors.addError(error);
        }
        return errors;
    }
}