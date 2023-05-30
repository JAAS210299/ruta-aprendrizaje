package arrays;

import java.util.Scanner;

public class SumaArrays {
	public static void main(String[] args) {

	
		 int [] array = rellenarScanner();
		 imprimirArray(array);
		 
		 
	}

	public static int[] rellenarScanner() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el tamaño del array");
		int cant = sc.nextInt();
		int [] array;
		array = new int[cant];

		for (int i = 0; i < cant; i++) {
			System.out.println("Valor " + (i));

			array[i] = sc.nextInt();
			
		}
		return array;
	}
	public static void imprimirArray(int [] array) {
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
	}

	/*
	 * public static int imprimeArray(int[] a1, int[] a2) {
	 * System.out.println(rellenarScanner()); return imprimeArray(a2, a2); }
	 */

	public static int[] sumaArrays(int[] a, int[] b) {
		int[] resultado = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			resultado[i] = a[i] + b[i];
		}
		return resultado;
	}

}