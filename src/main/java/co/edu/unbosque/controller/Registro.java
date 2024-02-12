package co.edu.unbosque.controller;

import java.io.IOException;

import co.edu.unbosque.model.EstudianteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registro() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Conectado");

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		int idEstudiante = Integer.parseInt(request.getParameter("idEstudiante"));
		String programa = request.getParameter("programa");

		EstudianteDTO nuevoEstudiante = new EstudianteDTO(nombre, apellido, correo, fechaNacimiento, idEstudiante, programa);
		
		request.setAttribute("estudiante", nuevoEstudiante);
		
		request.getRequestDispatcher("respuesta.jsp").forward(request, response);

	}

}
