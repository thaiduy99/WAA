package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = {"/RandomServlet"})
public class RandomNumberServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Random random = new Random();
        int num = random.nextInt(10);
        int firstNum = random.nextInt(10);
        int secondNum = random.nextInt(10);
        int thirdNum = random.nextInt(10);

        request.setAttribute("num", num);
        request.setAttribute("first", firstNum);
        request.setAttribute("second", secondNum);
        request.setAttribute("third", thirdNum);

        System.out.println("Random numbers are " + num + " "+ firstNum + " "+ secondNum + " "+ thirdNum);

        request.getRequestDispatcher("comparison.jsp").forward(request, response);
    }
}
