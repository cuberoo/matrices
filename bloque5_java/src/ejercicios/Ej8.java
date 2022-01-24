package ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int filas;
		int columnas;
		do{
			System.out.println("¿Cuantas filas quieres?: ");
			filas = entrada.nextInt();

			System.out.println("¿Cuantas columnas quieres?: ");
			columnas = entrada.nextInt();
		}while( filas!=3 && columnas!=3);
		
		
		int matriz[][]=new int [filas][columnas];

		matrices.pedir_matriz(matriz);
		matrices.mostrar_matriz(matriz);
		int determinante=matrices.determinante(matriz);
		
			System.out.println("el numero menor de la matriz es: "+ determinante);
		

	}

}
