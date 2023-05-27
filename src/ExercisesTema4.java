
public class ExercisesTema4 {
	
	public static void main(String[] args) {
	
		int numeroIf = 0;
		
		//Sentencia IF
		System.out.println("Ejecutado con IF");
		if(numeroIf < 0) {
			System.out.println("El número es negativo");
		}else if(numeroIf > 0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número es cero");
		}
		
		int numeroWhile = 0;
		String estacion = "otoño";
		
		//Sentencia WHILE
		System.out.println("Ejecutado con WHILE");
		while(numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}
		
		//Sentencia DO WHILE
		System.out.println("Ejecutado con DO WHILE");
		do {
			System.out.println(numeroWhile);
		} while(numeroWhile == 0);
		
		//Sentencia FOR
		System.out.println("Ejecutado con FOR");
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}
		
		//Sentencia BREAK
		System.out.println("Ejecutando un BREAK");
		switch(estacion) {
		
		case "verano":
			System.out.println("Estamos en Verano");
			break;
		case "invierno":
			System.out.println("Estamos en invierno");
			break;
		case "otoño":
			System.out.println("Estamos en otoño");
			break;
		case "primavera":
			System.out.println("Estamos en primavera");
			break;
		default:
			System.out.println("No queda claro en que estación estamos actualmente");
		
		}
		
		
	}

}
