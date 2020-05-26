package examen_ejercicio03;

import java.util.ArrayList;

public class Sociedad {
	
	private String nombre;
	private ArrayList<String> trabajos;
	
	public Sociedad(String nombre, ArrayList<String> trabajos) {
		super();
		this.nombre = nombre;
		this.trabajos = trabajos;
	}

	public ArrayList<String> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<String> trabajos) {
		this.trabajos = trabajos;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Sociedad [nombre=" + nombre + ", trabajos=" + trabajos + "]";
	}
	
	
	

}
