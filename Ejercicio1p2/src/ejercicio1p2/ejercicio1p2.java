package ejercicio1p2;
import java.util.Scanner;

public class ejercicio1p2 {

	public static void main(String[] args) {
		// variables
		
		final double MANZANAS = 2.35;
		final double PERAS = 1.95;
		double kilosman;
		double kilospera;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.print("Introduzca los kilos de manzanas que deseas comprar: ");
		kilosman = sc.nextDouble();
		
		System.out.print("Introduzca los kilos de peras que deseas comprar: ");
		kilospera = sc.nextDouble();
		
		kilosman *= MANZANAS;
		kilospera *= PERAS;
		
		System.out.println("En total las manzanas te salen por " + kilosman + "€");
		System.out.println("En total las peras te salen por " + kilospera + "€");
		
		//cierre
		sc.close();
	}

}
