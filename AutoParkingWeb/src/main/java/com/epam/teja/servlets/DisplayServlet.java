package com.epam.teja.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.teja.parking_operations.ParkingOperations;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,Integer> parkedCarDetails = ParkingOperations.getCarsInParkingArea();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<marquee><h1>Auto Parking Application</h1></marquee>");
		out.println("Status of Lobby");
		out.println("<center>");
		out.println("<table border=\"1\">");
		out.println("<tr>");
		out.println("<td>Car Number</td>");
		out.println("<td>Slot Number</td>");
		out.println("</tr>");
		for(Entry<String,Integer> entry:parkedCarDetails.entrySet()){
			out.println("<tr>");
			out.println("<td>"+entry.getKey()+"</td>");
			out.println("<td>"+(entry.getValue()+1)+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
		out.println("<a href=\"home.jsp\">Go back</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
