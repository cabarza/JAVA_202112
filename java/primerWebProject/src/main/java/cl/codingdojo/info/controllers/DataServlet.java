package cl.codingdojo.info.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import cl.codingdojo.info.models.Modelo;

/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Modelo modelo = (Modelo) request.getSession().getAttribute("modelo");
		System.out.println("Modelo" + modelo);
		request.getSession().removeAttribute("modelo");
		request.setAttribute("m", modelo);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/data.jsp");
		view.forward(request, response);
	}

}
