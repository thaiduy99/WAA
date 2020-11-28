package edu.miu.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;

import edu.miu.service.StarbuckService;
import edu.miu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({ "user" })
public class AuthenticationController {

    @Autowired
    StarbuckService service;

    private static final long serialVersionUID = 1L;

    @GetMapping(value = {"/", "/login"})
    protected String loginForm(Model model) throws ServletException, IOException {
        Map map = model.asMap();
        if (map.get("user") == null)
            return "login";
        else
            return "redirect:/advice";
    }

    @PostMapping(value = {"/authenticate"})
    protected String login(User user, Model model) throws ServletException, IOException {
        String name = user.getName();
        String password = user.getPassword();
        String expectedPassword = service.findPassword(name);

        if (expectedPassword == null || !expectedPassword.equals(password)) {
            return "Login";
        } else {
            model.addAttribute("user", user);
            return "LoginSuccessful";
        }
    }

    @GetMapping(value = {"/signout"})
    protected String logout(SessionStatus status) throws Exception {
        System.out.println("Logout!!!!!");
        status.setComplete();
        return "login";
    }
}
