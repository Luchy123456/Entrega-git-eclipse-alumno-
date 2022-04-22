package ejercicioevaluable;

public class Alumno {
	//ATRIBUTOS 
	private String nombre;
	private String apellido;
	private int dni;
	
	public Alumno(String n, String apl, int dni) {
		this.nombre=n;
		this.apellido=apl;
		this.dni=dni;
	}
	
	public String toString() {
	
	return "Alumno->Nombre:"+nombre+"Apellido"+apellido+"DNI O NIE:"+dni;
		
	}
}
