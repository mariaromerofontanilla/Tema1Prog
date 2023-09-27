package ejercicio5p2;
import java.util.Scanner;
public class ejercicio5p2 {

	public static void main(String[] args) {
		//variables
		int nota1, nota2, nota3;
		double notaMediaEx;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Introduzca la nota del primer trimestre: ");
		nota1 = sc.nextInt();
		
		System.out.println("Introduzca la nota del segundo trimestre: ");
		nota2 = sc.nextInt();
		
		System.out.println("Introduzca la nota del tercer trimestre: ");
		nota3 = sc.nextInt();
		
		//Calculo
		notaMediaEx = (double) (nota1 + nota2 + nota3) /3;
		int notaMediaAl = (int) notaMediaEx; 
		
		System.out.println("Su nota media del expediente es: " + notaMediaEx);
		System.out.println("Su nota media academica es: " + notaMediaAl);
		
		sc.close();

	}

}
