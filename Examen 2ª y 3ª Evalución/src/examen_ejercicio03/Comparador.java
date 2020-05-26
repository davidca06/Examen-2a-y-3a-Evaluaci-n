package examen_ejercicio03;

import java.util.Comparator;

public class Comparador implements Comparator<Empleado> {

	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {
		
		int resultado;
		
		if (empleado1.getSalario() > empleado2.getSalario()) {
			resultado=-1;
			
		}
		
		else if (empleado1.getSalario() < empleado2.getSalario()){
			resultado=1;
			
		}
		
		else {
			resultado=0;
		}
		
		if (resultado == 0) {
			if (empleado1.getApellidos().compareTo(empleado2.getApellidos()) == 0) {
			return empleado1.getNombre().compareTo(empleado2.getNombre());}
			else {
				return empleado1.getApellidos().compareTo(empleado2.getApellidos());
			}
			
		}
		return resultado;
	}

}
