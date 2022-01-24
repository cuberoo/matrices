package ejercicios;

import java.util.Scanner;

public class matrices {

	/**
	 * Método que pide una matriz por teclado
	 * 
	 * @param matriz Matriz a ingresar por teclado
	 */
	public static void pedir_matriz(int matriz[][]) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d): ", i, j);
				matriz[i][j] = entrada.nextInt();
			}
		}
	}

	/**
	 * Método que muestra un matriz por la pantalla
	 * 
	 * @param matriz la matriz a mostrar.
	 */
	public static void mostrar_matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
	}

	public static void matrizA(int filas, int cols, int a) {

		int matriz[][] = new int[filas][cols];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = a;
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
	}

	public static void matriz0(int filas, int cols, int a) {
		int matriz[][] = new int[filas][cols];
		boolean es_0 = false;
		mostrar_matriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == 0) {
					es_0 = true;
				}
			}
			System.out.println();
		}
		if (es_0) {
			System.out.println("la matriz es a 0");
		}
	}

	public static int buscarValor(int matriz[][], int a) {

		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == a) {
					contador++;
				}

			}

		}
		return contador;
	}

	public static boolean trianguloSuperior(int matriz[][]) {

		boolean comprobar = true;
		for (int i = 1; i < matriz.length && comprobar; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				if (j < i && matriz[i][j] != 0) {
					comprobar = false;
				}
			}
		}
		return comprobar;
	}

	public static boolean trianguloInferior(int matriz[][]) {

		boolean comprobar = true;
		for (int i = 0; i < matriz.length && comprobar; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				if (i < j && matriz[i][j] != 0) {
					comprobar = false;
				}
			}
		}
		return comprobar;
	}

	public static int numMayor(int matriz[][]) {

		int numMayor = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				if (matriz[i][j] > numMayor) {
					numMayor = matriz[i][j];
				}
			}
		}
		return numMayor;

	}

	public static int numMenor(int matriz[][]) {

		int numMenor = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				if (matriz[i][j] > numMenor) {
					numMenor = matriz[i][j];
				}
			}
		}
		return numMenor;

	}

	public static int determinante(int matriz[][]) {
		int determinante;

		determinante = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) + 
						(matriz[1][0] * matriz[2][1] * matriz[0][2]) + 
						(matriz[0][1] * matriz[1][2] * matriz[2][0]) - 
						(matriz[0][2] * matriz[1][1] * matriz[2][0]) - 
						(matriz[2][1] * matriz[1][2] * matriz[0][0]) - 
						(matriz[1][0] * matriz[0][1] * matriz[2][2]));

		return determinante;
	}

	public static int[][] arrayTranspuesta(int matriz[][]) {
		
		int matriz2[][] = new int [matriz[0].length][matriz.length];
		
		for (int i = 0; i < matriz2[0].length; i++) {
			for (int j = 0; j < matriz2.length; j++) {

				matriz2[j][i] = matriz[i][j];
				
			}
		}
		return matriz2;
	}
	
	
	
	
	
	
	
	
	
	
	
}

