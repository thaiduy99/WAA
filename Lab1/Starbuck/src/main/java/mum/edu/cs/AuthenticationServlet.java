package mum.edu.cs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.data.*;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet(urlPatterns = {"/Login"})
public class AuthenticationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext ctx = request.getServletContext();

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
        String expectedPassword = data.findPassword(name);

        if (expectedPassword == null || !expectedPassword.equals(password)) {
            response.sendRedirect("Login");
        } else {

            response.sendRedirect("success.jsp");
        }
    }

}
