package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CurrencyConverter;

/**
 * Servlet implementation class getCADServlet
 */
@WebServlet("/getCADServlet")
public class getCADServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCADServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userUsd = request.getParameter("userUSD");
		
		CurrencyConverter userCad = new CurrencyConverter(Double.parseDouble(userUsd));
		
		request.setAttribute("userCad", userCad);
		
		getServletContext().getRequestDispatcher("/cadResult.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userCAD.toString());
		//writer.close();
	}

}
