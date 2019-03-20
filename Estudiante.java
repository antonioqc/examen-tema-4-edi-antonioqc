/**
 * Documentacion estudiante
 * @author QuesadaCuadradoAntonio
 * @version 1.0
 */


enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};


public class Estudiante extends Persona{
	Curso curso;
	private String nombre;
	private String apellidos;
	private String nif;

	/**
	 * Definimos los siguientes parametros
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param curso
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * Metodo get y set
	 * Devuelve nombre
	 * @return nombre
	 */
	
	protected String getNombre() {
		return nombre;
	}

	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Método set y get devuelve apellidos
	 * @return apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
	/**
	 * Método set y get devuelve nif
	 * @return nif
	 */
	protected String getNif() {
		return nif;
	}

	
	protected void setNif(String nif) {
		this.nif = nif;
	}
	
	/**
	 * Método set y get devuelve curso
	 * @return curso
	 */
	
	protected Curso getCurso() {
		return curso;
	}

	
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
