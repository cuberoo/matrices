package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?: ");
		int filas = entrada.nextInt();

		System.out.println("¿Cuantas columnas quieres?: ");
		int columnas = entrada.nextInt();
		
		System.out.println("¿que valor quieres buscar en la matriz?");
		int a = entrada.nextInt();
		
		int matriz[][]=new int [filas][columnas];

		matrices.pedir_matriz(matriz);
		matrices.mostrar_matriz(matriz);
		matrices.buscarValor(matriz,a );
		
		int contador = matrices.buscarValor(matriz, a);
		
		System.out.println("el numero "+ a + " se repite " +contador + " veces");

	}

}
