package EstructurasCondicionales;

public class EstructuracCondicional {

	public static void main(String[] args) {
		// si = if
		int a = 2;
		int b = 5;

		// Tipos de operadores relacionales (<, >, ==, !=)
		// Tipos de operacionales lógico (|| , &&, !)

		if (a < b) {
			System.out.println("a es menor que b: ");
		} else if (a > b) {
			System.out.println("a es mayor que b");
		} else {
			System.out.println("a es igual que b");
		}
		if ((a > b )&& (a > 0) && (a < 10) || (a % 2 ==0 )){
			System.out.println("ingresando....");

		}
		
		if (a > 0) {
			b=1;
			
		} else {
			b=1;
		}
		
		// if ternario
		b = a > 0 ? -1 : 1;  
			
		// Switch case
		
		char letra = 65;
		switch (letra) {
		case 'A':
			System.out.println("letra A");
			break;
			
		case 'C':
			System.out.println(" Letra A");
			break;
			
			boolean activo =true;
			
			if(!activo) {
				
			}
			
			
		} 
		
	

	}

}

