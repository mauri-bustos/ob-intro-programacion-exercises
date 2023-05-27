
public class ExercisesTema3 {
	
	public static void main(String[] args) {
		
		int resultado = suma(11, 34, 45);
		System.out.println(resultado);
		
		Coche miCoche = new Coche();
		System.out.println("Mi coche rojo tiene " + miCoche.puertas + " puertas");
		miCoche.agregarPuertas();
		System.out.println("Mi coche rojo ahora tiene " + miCoche.puertas + " puertas");	
	}
	
	public static int suma(int x, int y, int z) {
		return x + y + z;
	}	
	
}
