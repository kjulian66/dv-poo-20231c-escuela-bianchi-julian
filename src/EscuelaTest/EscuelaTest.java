package EscuelaTest;

import domain.Alumno;
import domain.Asignacion;
import domain.Escuela;
import domain.Materia;

public class EscuelaTest {

	public static void main(String[] args) {
		
		//Instanciar Escuela
		Escuela escuela = new Escuela();
		
		//Instanciar Alumnos
		Alumno alumno1 = new Alumno("Julian Bianchi", 27);
		Alumno alumno2 = new Alumno("Clark Kent", 45);
		Alumno alumno3 = new Alumno("Bruce Wayne", 32);
		
		//Instanciar Materias
		Materia materia1 = new Materia("Programacion", 1);
		Materia materia2 = new Materia("Matematicas", 2);
		Materia materia3 = new Materia("Ingles", 1);
		
		//Instanciar Asignaciones
		Asignacion asignacion1 = new Asignacion(alumno1, materia1);
		Asignacion asignacion2 = new Asignacion(alumno1, materia2);
		Asignacion asignacion3 = new Asignacion(alumno2, materia1);
		Asignacion asignacion4 = new Asignacion(alumno2, materia3);
		Asignacion asignacion5 = new Asignacion(alumno3, materia2);
		Asignacion asignacion6 = new Asignacion(alumno3, materia3);
		
		//Asigno asignaciones a escuela
		escuela.addAsignacion(asignacion1);
		escuela.addAsignacion(asignacion2);
		escuela.addAsignacion(asignacion3);
		escuela.addAsignacion(asignacion4);
		escuela.addAsignacion(asignacion5);
		escuela.addAsignacion(asignacion6);
		
		
		//Asignar notas (Si configuro notas mayores a 10 o menores a 1 se rompe)
		asignacion1.setNotas(8.5, 9.0, 7.0);
		asignacion2.setNotas(9.0, 5.5, 6.5);
		asignacion3.setNotas(2.0, 3.5, 1.0);
		asignacion4.setNotas(2.0, 10.0, 6.0);
		asignacion5.setNotas(8.5, 1.0, 7.0);
		asignacion6.setNotas(3.0, 7.0, 10.0);
		
		//Mostrar por asignacion
		escuela.mostrarEstadoAsignaciones(asignacion2);
		System.out.println("-----------------------------------------------------");
		
		//Mostrar todas las asignaciones
		escuela.mostrarTodasAsignaciones();

	}

}
