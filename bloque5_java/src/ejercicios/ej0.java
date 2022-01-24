package ejercicios;

import java.util.Scanner;

public class ej0 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?: ");
		int filas = entrada.nextInt();

		System.out.println("¿Cuantas columnas quieres?: ");
		int columnas = entrada.nextInt();
		
		int matriz [][] = new int[filas][columnas];
		System.out.println("Introduce la matriz");
		matrices.pedir_matriz(matriz);
		
		System.out.println("tu matriz es:");
		matrices.mostrar_matriz(matriz);
		

	}

}
