package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?: ");
		int filas = entrada.nextInt();

		System.out.println("¿Cuantas columnas quieres?: ");
		int columnas = entrada.nextInt();
		
		System.out.println("¿Que valor quieres en la matriz?");
		int a = entrada.nextInt();

		matrices.matriz0(filas,columnas,a);

	}

}
