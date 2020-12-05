package edu.mum.persistence.controller;

import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

public class VolunteerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
        Principal principal = request.getUserPrincipal();
        String userMessage = "Please login!";
        if (principal != null) {
            if (request.isUserInRole("ROLE_ ADMIN")) {
                userMessage += " Your role is ADMIN";
            } else
                userMessage += " Your role is USER";
        }
        request.setAttribute("userMessage", userMessage);
        return true;
    }
}
