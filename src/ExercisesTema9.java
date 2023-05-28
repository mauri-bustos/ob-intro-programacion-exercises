
public class ExercisesTema9 {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Mauricio");
		cliente1.setEdad(33);
		cliente1.setTelefono(1134808356);
		cliente1.setCredito(120000);
		
		System.out.println("El nuevo cliente " + cliente1.getNombre() + " tiene " + cliente1.getEdad() + " años de edad. Le daremos un limite de crédito de $" + cliente1.getCredito() + ". Este es su teléfono por si debes contactarlo.");
		
		Trabajador trabajador1 = new Trabajador();
		trabajador1.setNombre("Joaquín");
		trabajador1.setEdad(29);
		trabajador1.setTelefono(1133652881);
		trabajador1.setSalario(80000);
		
		System.out.println("Ha llamado " + trabajador1.getNombre() + ". Dijo que quiere que aumentemos su salario en $" + trabajador1.getSalario() + ". Considerando que tiene solo " + trabajador1.getEdad() + " años, deberíamos retenerlo. Mejor llamalo y negocia con él, aquí te dejo su número de teléfono, " + trabajador1.getTelefono());
	}

}

class Cliente extends Persona {
	
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	
}

class Trabajador extends Persona {
	
	private int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
}


