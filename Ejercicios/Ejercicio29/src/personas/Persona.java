package personas;

import localidades. Localidad;

public class Persona{

String nombre;
Localidad lugarDeNacimiento;

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public Localidad getLugarDeNacimiento(){
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(Localidad localidad){
		return nombre + ", " + lugarDeNacimiento;
	}
}
