package ar.edu.unju.fi.main;

import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;
public class Main {
	public static void main(String[] args) {
		Alumno alumno = GenerarAlumno();
		RegistrarNotas(alumno,1);
		
	}
	public static Alumno GenerarAlumno() {
			Alumno alumno = new Alumno();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese el legajo:");
			Integer legajo = scanner.nextInt();
			System.out.println("Ingrese el apellido:");
			String apellido = scanner.next();
			System.out.println("Ingrese el nombre:");
			String nombre = scanner.next();
			alumno.setLegajo(legajo);
			alumno.setApellido(apellido);
			alumno.setNombre(nombre);		
			return alumno;
	}
	public static void RegistrarNotas(Alumno alumno, int numMaterias) {
			Scanner scanner = new Scanner(System.in);
			while(numMaterias<=2) {
				//cargarMateria
				System.out.println("Codigo de la materia:");
				String codigoMateria = scanner.next();
				System.out.println("Nombre de la materia:");
				String nombreMateria = scanner.next();
				
				Materia materia = new Materia(codigoMateria, nombreMateria);
				//Cargar RegistroNota
				System.out.println("Codigo del registo de nota:");
				String codigoNota = scanner.next();
				System.out.println("NOTA:");
				Float nota = scanner.nextFloat();
				RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
				System.out.println(registroNota.toString());
				numMaterias++;
				
			}
	}
		
}

