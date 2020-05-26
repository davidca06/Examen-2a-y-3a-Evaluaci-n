package examen_ejercicio03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PruebaEmpresa {

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		
		Empleado asalariado1= new Asalariado("Alberto","Martin",LocalDate.parse("2014-05-21"),4512456,1250.00,"Finanzas");
		
		ArrayList<String> listaTrabajos1= new ArrayList<String>();
		listaTrabajos1.add("administrativo");
		listaTrabajos1.add("informático");		
		Sociedad sociedad1= new Sociedad("Markel",listaTrabajos1);
		ArrayList<Sociedad> listaSociedades1= new ArrayList<Sociedad>();
		listaSociedades1.add(sociedad1);
		
		Empleado contratista1= new Contratista("Juan","García",LocalDate.parse("2018-02-15"),565478979,2250.00,listaSociedades1);
		
		Servicio servicio1=new Servicio("CleanCo","Limpieza",4546487,8500.30);
		
		ArrayList<Empresa> listado1= new ArrayList<Empresa>();
		listado1.add(asalariado1);
		listado1.add(contratista1);
		listado1.add(servicio1);
					
		Iterator<Empresa> it=listado1.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
				
		}
		
		System.out.println("--------------------");
		
		LinkedList<Empleado> listadoEmpleados= new LinkedList<Empleado>();
		Empleado asalariado2= new Asalariado("Antonio","López",LocalDate.parse("2012-12-05"),1247898,1350.20,"Informática");
		Empleado asalariado3= new Asalariado("Valentín","Suárez",LocalDate.parse("2000-03-10"),9561145,1150.26,"Secretaría");
		Empleado contratista2= new Contratista("Guillermo","López",LocalDate.parse("2012-12-05"),8451237,2110.60,listaSociedades1);
		Empleado contratista3= new Contratista("Laude","Alvarez",LocalDate.parse("2011-07-18"),6547812,2680.36,listaSociedades1);
		listadoEmpleados.add(asalariado2);
		listadoEmpleados.add(contratista2);
		listadoEmpleados.add(asalariado3);
		listadoEmpleados.add(contratista3);
		
				
		Collections.sort(listadoEmpleados);
		
		System.out.println(listadoEmpleados);
		
		System.out.println("--------------------");
		
		Collections.sort(listadoEmpleados, new Comparador());
		
		System.out.println(listadoEmpleados);
		
		
		
		guardarEnFichero(listado1);
		
		crearArray();
		
	}
	
	public static void guardarEnFichero (ArrayList<Empresa> listado) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("ListadoDeEmpresa.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(listado);
			
		}
		catch (Exception e) {
			
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public static void crearArray () {
		
		//String ruta= "ListadoDeEmpresa.txt";
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		ArrayList<Object> listado2 = new ArrayList<>();
		
		try {
			fis = new FileInputStream("ListadoDeEmpresa.txt");
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			
			listado2.add(obj);
			
		}
		catch (Exception e) {
			
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	

}

//IngresoEnCuenta objeto = it.next();

		/*if (objeto instanceof Asalariado ) {
			Asalariado a=(Asalariado) objeto;
			System.out.println("Asalariado: "+a.getApellidos());
			System.out.println("Introduce salario: ");
			double salario=in.nextDouble();
			objeto.realizarIngreso(salario);
		}
		else if (objeto instanceof Contratista) {
			Contratista c = (Contratista) objeto;
			System.out.println("Contratista: "+c.getApellidos());
			System.out.println("Introduce salario: ");
			double salario=in.nextDouble();
			objeto.realizarIngreso(salario);
		}
		else {
			Servicio s = (Servicio) objeto;
			System.out.println("Contratista: "+s.getNombre());
			System.out.println("Introduce salario: ");
			double salario=in.nextDouble();
			objeto.realizarIngreso(salario);
		}
		((Asalariado) it.next()).realizarIngreso(1200.3);
		((Contratista) it.next()).realizarIngreso(1150.52);
		((Servicio) it.next()).realizarIngreso(5230.15);*/