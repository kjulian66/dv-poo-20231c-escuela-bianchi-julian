package domain;

public class Materia {
	
	//Atributos
	private String nombre;
	private Integer cuatrimestre;
	
	//Constructor
	public Materia(String nombre, Integer cuatrimestre) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(Integer cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", cuatrimestre=" + cuatrimestre + "]";
	}	
	

}
