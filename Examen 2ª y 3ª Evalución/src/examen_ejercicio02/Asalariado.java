package examen_ejercicio02;

import java.time.LocalDate;

public class Asalariado extends Empleado implements IngresoEnCuenta{
	
	private String departamento;

	public Asalariado(String nombre, String apellidos, LocalDate fechaAlta, int numeroCuenta, double salario, String departamento) {
		super(nombre, apellidos, fechaAlta, numeroCuenta, salario);
		this.departamento = departamento;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return  "\nEmpleado: \n Nombre=" + super.getNombre() + "\n Apellidos=" + super.getApellidos() + ",\n Fecha de Alta=" + super.getFechaAlta()
				+ "\n Número de Cuenta=" + super.getNumeroCuenta() + "\n Salario=" + super.getSalario() + "\n Departamento=" + departamento;
						
				
	}





	@Override
	public void realizarIngreso(double cantidad) {
		System.out.println("Ingreso en cuenta del trabajador "+super.getNombre()+" "+super.getApellidos()+" de la cantidad de "+cantidad+"€ en concepto de nómina. A fecha de "+LocalDate.now());
		
	}
	
	
	
}
