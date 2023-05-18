package domain;

public class Asignacion {
	
	//Constantes
	public static final String APROBADO = "APROBADO";
	public static final String DESAPROBADO = "DESAPROBADO";
	
	//Atributos
	private Alumno alumno;
	private Materia materia;
	private Double primerParcial;
	private Double segundoParcial;
	private Double trabajoPractico;
		
	//Constructor
	public Asignacion(Alumno alumno, Materia materia) {
		this.alumno = alumno;
		this.materia = materia;
		this.primerParcial = 0.0;
		this.segundoParcial = 0.0;
		this.trabajoPractico = 0.0;
	}
	
	//Getters & Setters
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Double getPrimerParcial() {
		return primerParcial;
	}

	public void setPrimerParcial(Double primerParcial) {
		this.primerParcial = primerParcial;
	}

	public Double getSegundoParcial() {
		return segundoParcial;
	}

	public void setSegundoParcial(Double segundoParcial) {
		this.segundoParcial = segundoParcial;
	}

	public Double getTrabajoPractico() {
		return trabajoPractico;
	}

	public void setTrabajoPractico(Double trapajoPractico) {
		this.trabajoPractico = trapajoPractico;
	}

	public static String getAprobado() {
		return APROBADO;
	}

	public static String getDesaprobado() {
		return DESAPROBADO;
	}
	
	//Metodos
	public void setNotas (Double notaPP, Double notaSP, Double notaTP) {
		if (notaPP > 0.0 && notaPP <= 10.0 && notaSP > 0.0 && notaSP <= 10.0 && notaTP > 0.0 && notaTP <= 10.0) {
			this.primerParcial = notaPP;
			this.segundoParcial = notaSP;
			this.trabajoPractico = notaTP;
		} else {
			System.out.println("Las notas deben ser entre 1 y 10");
		}
	}

	public Double calcularPromedio() {
		return (this.primerParcial + this.segundoParcial + this.trabajoPractico) / 3;
	}
	
	public String estado() {
		if (calcularPromedio()>=6) {
			return getAprobado();
		} else {
			return getDesaprobado();
		}
	}
	
	public void mostrarPromedio() {
		if (calcularPromedio()>=6) {
			System.out.println("El promedio del alumno: " + alumno.getNombre() + 
					"\n es de: " + calcularPromedio() + 
					"\n el alumno se encuentra: " + getAprobado());
		} else {
			System.out.println("El promedio del alumno: " + alumno.getNombre() + 
					"\n es de: " + calcularPromedio() + 
					"\n el alumno se encuentra: " + getDesaprobado());
		}
	}

	@Override
	public String toString() {
		return "Asignacion [alumno=" + alumno + ", materia=" + materia + ", primerParcial=" + primerParcial
				+ ", segundoParcial=" + segundoParcial + ", trapajoPractico=" + trabajoPractico + "]";
	}
	
	
	
	
}
