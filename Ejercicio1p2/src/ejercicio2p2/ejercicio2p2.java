package ejercicio2p2;
import java.util.Scanner;

public class ejercicio2p2 {

	public static void main(String[] args) {
		//Variables
		int edad;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Introduzca la edad que tiene y le diremos si tiene mayoria de edad o no: ");
		edad = sc.nextInt();
		
		String mensajes = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.print(mensajes);		
		
		//cierre
		sc.close();

	}

}
