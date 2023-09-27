package Ejerciciosp3;

import java.util.Scanner;

public class Ejercicio1p3 {

	public static void main(String[] args) {
		//variables
		//variable del numero decimal que utilizaremos
		double numeroDeci = 0;
		//variable numero que mostrara al usuario
		double numeroTotal = numeroDeci;
		//Llamamos al Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		//Pregunta al usuario el numero que desea utilizar
		System.out.println("Introduzca el numero que desea redondear: ");
		//Lee por pantalla el numero que desea ver
		numeroDeci = sc.nextDouble();
		String resultado = ((numeroTotal - numeroDeci) >= .5 ) ? "El resultado es: " + (int) numeroDeci :  "El resultado es: " + (int) numeroDeci;
		System.out.println(resultado);
		
		sc.close();
	}

}
