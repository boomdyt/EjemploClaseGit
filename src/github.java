import java.util.Scanner;

public class github {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado;
		System.out.print("Introduce primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo número: ");
		numero2 = sc.nextInt();
		resultado = suma(numero1, numero2);
		System.out.println("Suma: " + resultado);
		}
	
	public static int suma(int a, int b) {
		int c;
		c = a + b;
		return c; 
		}

}
