package mum.edu.cs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.data.*;

/**
 * Servlet implementation class AdviceServlet
 */
@WebServlet(urlPatterns = {"/Advice"})
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdviceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		 <select name="roast" disabled="disabled" >
//        <option value="-">--Choose Roast--</option>
//        <option value="dark">Dark</option>
//        <option value="medium">Medium</option>
//        <option value="light">Light</option>
//      </select>

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("Dark", "dark");
		hash.put("Medium", "medium");
		hash.put("light", "light");
		request.setAttribute("list", hash);
		request.getRequestDispatcher("advice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roast = request.getParameter("roast");
		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		List<String> advice = data.getAdvice(roast);
		request.setAttribute("advices", advice);
		request.getRequestDispatcher("display.jsp").forward(request, response);
	}

	private String prepareAdviceOutput(String roast, List<String> advice) {

		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>\n");
		sb.append("<html><head> </head>\n");
		sb.append("<body><form action=\"../action/login\" method=\"get\">\n");

		sb.append("Starbuck's " + roast.toUpperCase() + " Roast Coffees:");

		sb.append("<table>\n");
		for( int i=0;i<advice.size();i++) {
			if (i%2 == 0)  sb.append("<tr style=\"background-color:cyan\">");
			else sb.append("<tr style=\"background-color:yellow\">");

			sb.append("<td>" + advice.get(i) + "</td></tr>\n");

		}
		sb.append("</table>\n");

		sb.append("<input type=\"submit\" value=\"Back\">\n");
		sb.append("</body></html>");
		return sb.toString();
	}

}
