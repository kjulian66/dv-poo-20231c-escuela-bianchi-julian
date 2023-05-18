package domain;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
	//Atributos
	private List <Asignacion> asignaciones;
	
	//Constructor
	public Escuela() {
		asignaciones = new ArrayList <>();
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	//Metodos
	public void addAsignacion(Asignacion asignacion) {
		asignaciones.add(asignacion);
	}
	
	public void mostrarEstadoAsignaciones(Asignacion asig) {
		for (Asignacion asignacion : asignaciones) {
			if (asignacion.equals(asig))
				System.out.println("Nombre: " + asig.getAlumno().getNombre() + "\n"
						+ "Materia: " + asig.getMateria().getNombre() + "\n"
						+ "Cuatrimestre: " + asig.getMateria().getCuatrimestre() + "\n"
						+ "Notas: " + asig.getPrimerParcial() + "," + asig.getSegundoParcial() + "," + asig.getTrabajoPractico() + "\n"
						+ "Promedio: " + asig.calcularPromedio() + "\n"
						+ "Estado: " + asig.estado());
		}
	}
	
	public void mostrarTodasAsignaciones() {
		for (Asignacion asig : asignaciones) {
			System.out.println("Nombre: " + asig.getAlumno().getNombre() + "\n"
					+ "Materia: " + asig.getMateria().getNombre() + "\n"
					+ "Cuatrimestre: " + asig.getMateria().getCuatrimestre() + "\n"
					+ "Notas: " + asig.getPrimerParcial() + "," + asig.getSegundoParcial() + "," + asig.getTrabajoPractico() + "\n"
					+ "Promedio: " + asig.calcularPromedio() + "\n"
					+ "Estado: " + asig.estado() + "\n"
					+ "-----------------------------------------------------");
		}
	}

	@Override
	public String toString() {
		return "Escuela [asignaciones=" + asignaciones + "]";
	}
		
	
}
