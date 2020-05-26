package examen_ejercicio01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		crearFichero();
		
	}
	
	public static void crearFichero() {
		
		String ruta="CompuestosQuimicos.txt";
		File fichero;
		FileWriter fw = null;
		
		TreeMap<String,ArrayList<String>> listadoCompuestos= new TreeMap <String,ArrayList<String>>();
		//ArrayList<String> elementos = new ArrayList<String>();
		
		boolean fin=false;
		
		try {
			
			do {
				
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String cadena=in.readLine();
			
			String nombreCompuesto= cadena.substring(0,cadena.indexOf(":"));
			String subcadena = cadena.substring(cadena.indexOf(":")+1);
			String[] nombreElementos = subcadena.split(" ");
			
			if (!listadoCompuestos.containsKey(nombreCompuesto)) {
				
				ArrayList<String> elementosComp=listadoCompuestos.get(nombreCompuesto);
				
				for (int i=0; i<nombreElementos.length; i++) {
					elementosComp.add(nombreElementos[i]);
				}
				
			}
			else {
					ArrayList<String> elementosComp= new ArrayList<>();
				
				for (int i=0; i<nombreElementos.length; i++) {
					elementosComp.add(nombreElementos[i]);
				}
				
				listadoCompuestos.put(nombreCompuesto, elementosComp);
			}
			
			
			
			
			
			if (cadena.equalsIgnoreCase("fin")) {
				fin=true;
			}
									
			} while (!fin);
		}
		catch (Exception e) {
			
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
