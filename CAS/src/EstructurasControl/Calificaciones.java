package EstructurasControl;

import java.util.*;

public class Calificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("INGRESA TU NUMERO");
		int num = sc.nextInt();
		System.out.println("INGRESA UN VALOR VÁLIDO");
		int leido = sc.nextInt();
		int mayor = 0;
		int menor = 0;
		
		if (num > leido)
		{
			System.out.println("Num es mayor " + num + "  que leido: " + leido);
			mayor = num;
		}
		else
		{	
			System.out.println("Num es menor " + num + " que leido " + leido);
			menor = num;
	
		sc.close();
		}
		System.out.println(menor + " " + mayor);
	}
	
}
