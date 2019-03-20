enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

public class Estudiante extends Persona{
	Curso curso;
	private String nombre;
	private String apellidos;
	private String nif;

	
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	
	protected String getNombre() {
		return nombre;
	}

	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	protected String getApellidos() {
		return apellidos;
	}

	
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
	protected String getNif() {
		return nif;
	}

	
	protected void setNif(String nif) {
		this.nif = nif;
	}
		
	
	protected Curso getCurso() {
		return curso;
	}

	
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
