package examen_ejercicio03;

import java.time.LocalDate;

public class Servicio implements IngresoEnCuenta, Empresa {

	private String nombre;
	private String tipoServicio;
	private double importeServicio;
	private int numeroCuenta;
	
	public Servicio(String nombre, String tipoServicio, int numeroCuenta, double importeServicio) {
		super();
		this.nombre = nombre;
		this.tipoServicio = tipoServicio;
		this.numeroCuenta = numeroCuenta;
		
		try {
			if (importeServicio < 0) {
				throw new ImporteMensualException("El importe del servicio no puede ser negativo");
			}
			else {
				this.importeServicio = importeServicio;
			}
			}
			catch (ImporteMensualException e1) {
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

	public String getTipoServicio() {
		return tipoServicio;
	}
	
	public double getImporteServicio() {
		return importeServicio;
	}

	public void setImporteServicio(double importeServicio) {
		
		try {
			if (importeServicio < 0) {
				throw new ImporteMensualException("El importe del servicio no puede ser negativo");
			}
			else {
				this.importeServicio = importeServicio;
			}
			}
			catch (ImporteMensualException e2) {
				System.out.println(e2.getMessage());
			}
		
	}
	
	

	@Override
	public String toString() {
		return "\nServicio: " + nombre + "\n Tipo de Servicio: " + tipoServicio + "\n Importe Servicio: " + importeServicio
				+ "\n Núnmero de Cuent: " + numeroCuenta;
		
			}

	@Override
	public void realizarIngreso(double cantidad) {
		
		System.out.println("Ingreso en cuenta a nombre de "+this.nombre+" de la cantidad de "+cantidad+"€ en concepto de "+this.tipoServicio+" . A fecha de "+LocalDate.now());
		
	}
	
	
	
}
