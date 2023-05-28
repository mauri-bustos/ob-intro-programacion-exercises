
public class ExercisesTema8 {

	public static void main(String[] args) {
		
		Persona miPersona = new Persona();
		miPersona.setEdad(24);
		miPersona.setNombre("Ramon");
		miPersona.setTelefono(1130866528);
		
		System.out.println(miPersona.getNombre() + " cumple " + miPersona.getEdad() + " años hoy. Aquí te dejo su teléfono para que puedas saludarlo, " + miPersona.getTelefono());
	}	
}

class Persona {
	
	private String nombre;
	private int edad;
	private int telefono;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}

