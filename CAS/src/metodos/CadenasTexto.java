package metodos;

import java.util.*;

public class CadenasTexto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una cadena de texto");

		String cadena = sc.next();

		System.out.println(invertirCadena(cadena) + " cadena invertida " + " y cadena sin invertir " + cadena);
		sc.close();

		System.out.println(esPalindromo(cadena));

	}

	public static String invertirCadena(String cadena) {

		String cadenaInvertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}

		return cadenaInvertida;
	}

	public static boolean palindromo(String cadena) {

		{

			return cadena.equals(invertirCadena(cadena));
		}

	}

	public static boolean esPalindromo(String cadena) {
		//String inv  ="";
		boolean valor=false;
		for (int i = 0, j = cadena.length() - 1; i < cadena.length(); ++i, --j) {
			if (cadena.charAt(i) == cadena.charAt(j)) {
				System.out.println("Son iguales");
				valor = true;
			} else {
				System.out.println("Son distintas");
				valor = false;
			}
			
		}
		return valor;

	}

}
