package co.edu.unbosque.model;

import java.time.LocalDate;

public class Estudiante extends Persona {

	private int idEstudiante;
	private String programa;

	public Estudiante(String nombre, String apellido, String correo, LocalDate fechaNacimiento, int idEstudiante,
			String programa) {
		super(nombre, apellido, correo, fechaNacimiento);
		this.idEstudiante = idEstudiante;
		this.programa = programa;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

}
