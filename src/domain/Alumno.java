package domain;

public class Alumno {
	
	//Atributos
	private String nombre;
	private Integer edad;

	//Constructor
	public Alumno(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	//Metodos
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

}
