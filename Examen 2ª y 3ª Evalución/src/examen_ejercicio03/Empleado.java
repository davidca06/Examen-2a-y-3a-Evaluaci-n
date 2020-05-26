package examen_ejercicio03;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

public class Empleado implements IngresoEnCuenta, Comparable<Empleado>, Empresa, Serializable {
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaAlta;
	private double salario;
	private int numeroCuenta;
	
	public Empleado(String nombre, String apellidos, LocalDate fechaAlta, int numeroCuenta, double salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
		this.numeroCuenta = numeroCuenta;
		
		try {
		if (salario < 0) {
			throw new SalarioException("El salario no puede ser negativo");
		}
		else {
			this.salario = salario;
		}
		}
		catch (SalarioException e1) {
			System.out.println(e1.getMessage());
		}
		
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		try {
		
		if (salario < 0) {
			throw new SalarioException("El salario no puede ser negativo");
		}
		else {
		this.salario = salario;
		}
		}
		catch (SalarioException e2) {
			System.out.println(e2.getMessage());
		}
	}

	@Override
	public int compareTo(Empleado empleado) {
		
		
		
		if (apellidos.compareTo(empleado.apellidos)==0) {
			return nombre.compareTo(empleado.nombre);
		}
		
		return apellidos.compareTo(empleado.apellidos);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numeroCuenta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroCuenta != other.numeroCuenta)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmpleado: \n Nombre=" + nombre + "\n Apellidos=" + apellidos + ",\n Fecha de Alta=" + fechaAlta
				+ "\n Número de Cuenta=" + numeroCuenta + "\n Salario=" + salario;
	}

	

	@Override
	public void realizarIngreso(double cantidad) {
		// TODO Auto-generated method stub
		
	}

	
	
	

	
	
	
	

}
