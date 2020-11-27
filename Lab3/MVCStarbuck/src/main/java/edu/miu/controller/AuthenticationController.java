package edu.miu.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import edu.miu.service.StarbuckService;
import edu.miu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {

    @Autowired
    StarbuckService service;

    private static final long serialVersionUID = 1L;

    @GetMapping(value = {"/", "login"})
    protected String loginForm() throws ServletException, IOException {
        return "login";
    }

    @PostMapping(value = {"authenticate"})
    protected String login(User user) throws ServletException, IOException {
        String name = user.getName();
        String password = user.getPassword();
        String expectedPassword = service.findPassword(name);

        if (expectedPassword == null || !expectedPassword.equals(password)) {
            return "Login";
        } else {
            return "LoginSuccessful";
        }
    }
}
