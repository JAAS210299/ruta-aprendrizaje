package metodos;

public class TestMetodo {
	
	public static int mayor (int n1, int n2)
	{
		return n1 > n2 ? n1 : n2;
	}
	
	public static int pow (int base, int exp) {
		int pot = 1;
		
		for(int i = 1; i <= exp; i++) {
			pot *= base;
		}
		return pot;
	}
	
	public static int mayor (int n1, int n2, int n3)
	{
		return mayor(mayor(n1, n2), n3);
	}
	
	public static void main (String[] args) {
		
		System.out.println(mayor(15, 21));
		
		System.out.println(mayor(45,21));
		
		System.out.println(pow(5,3));
		
		System.out.println(mayor(mayor(4, 5), 10));
		
		//System.out.println(mayor(mayor(n1, n2), n3);
	}
}
