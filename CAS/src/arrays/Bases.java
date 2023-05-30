package arrays;

import java.util.Scanner;

public class Bases {
	public static void main(String[] args) {

			//Llamada al metodo que rellena un array
		 int [] array = rellenarScanner();
		 //Impresión del método que rellena un array
		 imprimirArray(array);
		 
		 
	}
	//Declaracion de un metodo que rellena un array mediante scanner los valores uno a uno
	public static int[] rellenarScanner() {
		//Declaración del scanner
		Scanner sc = new Scanner(System.in);
		//Mensaje de asignación del tamaño de valores por ejemplo 5 valores [5, 5 , 4 , 5, 6]
		System.out.println("Dime el tamaño del array");
		//Asigna la cantidad de valores por teclado con scanner
		int cant = sc.nextInt();
		//instancia tu array
		int [] array;
		//Utiliza cant para asignarle la cantidad de valores ingresados
		array = new int[cant];
		//Recorre el array
		for (int i = 0; i < cant; i++) {
			//Lista los valores 1 a 1 con su respectiva posición en el bucle y array
			System.out.println("Valor " + (i));
			//Ingresa los valores de cada posición del array
			array[i] = sc.nextInt();
			
		}
		//Cierre del scanner
		sc.close();
		//Retorno del metodo de nuestro array procesado
		return array;
		
	}
	//Metodo para imprimir nuestro array
	public static void imprimirArray(int [] array) {
		//Recorre el array 
		for(int i = 0; i<array.length;i++) {
			//Imprime el array
			System.out.print("[ "+array[i]+" ]");
		}
	}
}