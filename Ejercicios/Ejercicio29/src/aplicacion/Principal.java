package aplicacion;

import localidades.Localidad;
import personas.Persona;

public class Principal{

	public static void main(String[] args){
		Localidad socovos = new Localidad();
		socovos.setNombre("Socovos");
		socovos.setNumeroDeHabitantes(2000);
		Persona juan = new Persona();
		juan.setNombre("Juan");
		juan.setLugarDeNacimiento(socovos);
		System.out.println(juan);
	}
}

