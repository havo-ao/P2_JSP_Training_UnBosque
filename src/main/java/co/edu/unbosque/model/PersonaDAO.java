package co.edu.unbosque.model;

import java.util.List;

public interface PersonaDAO {
	void agregarPersona(PersonaDTO persona);
	PersonaDTO actualizarPersona(PersonaDTO persona);
	List<PersonaDTO> obtenerTodasPersonas();
	PersonaDTO obtenerPersonaPorCorreo(String correo);
	
}
