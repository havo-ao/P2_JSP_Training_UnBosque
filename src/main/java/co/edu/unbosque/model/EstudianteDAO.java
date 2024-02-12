package co.edu.unbosque.model;

import java.util.List;

public interface EstudianteDAO {
	void agregarEstudiante(EstudianteDTO estudiante);

	EstudianteDTO obtenerEstudiante(int id);

	EstudianteDTO actualizarEstudiante(EstudianteDTO estudiante);

	void eliminarEstudiante(int id);

	List<EstudianteDTO> obtenerEstudiantes();
}
