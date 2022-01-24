package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?: ");
		int filas = entrada.nextInt();

		System.out.println("¿Cuantas columnas quieres?: ");
		int columnas = entrada.nextInt();
		
		int matriz[][]=new int [filas][columnas];

		matrices.pedir_matriz(matriz);
		matrices.mostrar_matriz(matriz);
		int numMayor = matrices.numMayor(matriz);
		
			System.out.println("el numero mayor de la matriz es: "+ numMayor);
		

	}

}
