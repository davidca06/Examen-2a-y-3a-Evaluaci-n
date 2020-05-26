package examen_ejercicio02;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contratista extends Empleado implements IngresoEnCuenta {
	
	private ArrayList<Sociedad> sociedades;

	public Contratista(String nombre, String apellidos, LocalDate fechaAlta, int numeroCuenta, double salario, ArrayList<Sociedad> sociedades) {
		super(nombre, apellidos, fechaAlta, numeroCuenta, salario);
		this.sociedades = sociedades;
	}

	public ArrayList<Sociedad> getSociedades() {
		return sociedades;
	}

	public void setSociedades(ArrayList<Sociedad> sociedades) {
		this.sociedades = sociedades;
	}

	@Override
	public void realizarIngreso(double cantidad) {
		
		System.out.println("Ingreso en cuenta del contratista "+super.getNombre()+" "+super.getApellidos()+" de la cantidad de "+cantidad+"� en concepto de n�mina. A fecha de "+LocalDate.now());
		
	}
	
	
	
}

