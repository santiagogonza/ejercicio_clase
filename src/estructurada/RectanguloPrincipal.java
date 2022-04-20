
package estructurada;

import java.util.Scanner;

public class RectanguloPrincipal {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("ingresa la base:");
		double base = scanner.nextDouble();
		System.out.println("ingresa el area:");
		double altura = scanner.nextDouble();
		System.out.println("el área del rectangulo es:"+ base *altura);
		

	}

}
