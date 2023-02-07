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
 * Servlet implementation class getEUROServlet
 */
@WebServlet("/getEUROServlet")
public class getEUROServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getEUROServlet() {
        super();
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
		
		DecimalFormat df = new DecimalFormat();
		
		CurrencyConverter userEuros = new CurrencyConverter(Double.parseDouble(userUsd));
		
		request.setAttribute("userEuros", userEuros);
		
		getServletContext().getRequestDispatcher("/euroResult.jsp").forward(request, response);
		
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userEuros.toString());
		//writer.close();
	}

}
