package objeto;

import java.util.Scanner;

public class Principal {
	private static Scanner scanner = new Scanner(System.in);
	private static Rectangulo rectangulo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.println("ingresa la base:");
		double base = scanner.nextDouble();
		System.out.println("ingresa el area:");
		double altura = scanner.nextDouble();
		 rectangulo = new Rectangulo();
		 
		 rectangulo.setBase(base);
		 rectangulo.setAltura(altura);
		 rectangulo.imprimirArea();
		 
		 
		 
	}

}
