package co.edu.unbosque.model;

public class EstudianteDTO extends PersonaDTO {
	private int idEstudiante;
	private String programa;

	public EstudianteDTO(String nombre, String apellido, String correo, String fechaNacimiento, int idEstudiante,
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
