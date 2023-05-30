package EstructurasControl;

import java.util.*;

public class Cuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime la dimensión de tu cuadrado:");
		int tamanio = sc.nextInt();
		
		for(int i = 1;  i<=tamanio; i++)
		{
			for(int j = 1; j<=tamanio; j++)
			{
				System.out.print("*-");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
