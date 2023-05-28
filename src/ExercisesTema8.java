
public class ExercisesTema8 {

	public static void main(String[] args) {
		
		Persona miPersona = new Persona();
		miPersona.setEdad(24);
		miPersona.setNombre("Ramon");
		miPersona.setTelefono(1130866528);
		
		System.out.println(miPersona.getNombre() + " cumple " + miPersona.getEdad() + " años hoy. Aquí te dejo su teléfono para que puedas saludarlo, " + miPersona.getTelefono());
	}	
}
