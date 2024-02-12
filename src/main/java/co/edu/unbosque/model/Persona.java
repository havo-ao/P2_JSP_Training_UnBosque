package co.edu.unbosque.model;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private String correo;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, String apellido, String correo, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
