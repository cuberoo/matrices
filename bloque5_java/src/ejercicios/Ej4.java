package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?: ");
		int filas = entrada.nextInt();

		System.out.println("¿Cuantas columnas quieres?: ");
		int columnas = entrada.nextInt();
		
		int matriz[][]=new int [filas][columnas];

		matrices.pedir_matriz(matriz);
		matrices.mostrar_matriz(matriz);
		matrices.trianguloSuperior(matriz);
		boolean comprobar=matrices.trianguloSuperior(matriz);
		if (comprobar) {
			System.out.println("la matriz es triangular superior");
		}else {
			System.out.println("no es triangular superior");
		}


	}

}
