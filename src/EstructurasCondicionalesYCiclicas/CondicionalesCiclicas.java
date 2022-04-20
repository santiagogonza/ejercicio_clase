package EstructurasCondicionalesYCiclicas;
import java.util.*;
public class CondicionalesCiclicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean activo = true;

		if (!activo) {
			System.out.println("el alumno no esta activo");

		} else if (activo) {
			System.out.println("el alumno esta activo");

		} else {
			System.out.println("el alumno esta activo");

		}

		// if ternario : para asignaciones
		String votar = " ";

		int edad = 20;
		if (edad >= 18) {
			votar = "si puede votar";

		} else {
			votar = "no puede votar";
		}
		System.out.println(votar);
		// if ternario
		votar = edad >= 18 ? " si puede votar" : "no puede votar";
		System.out.println(votar);

		// condicional con switch

		String accion = "Mostrar";

		switch (accion) {
		case "Eliminar":
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			System.out.println("eliminara al usuario");
			break;
		case "Crear":
			System.out.println("Agregar al usuario");
			break;
		case "Actualizar":
			System.out.println("actualizar al usuario");
			break;
		case "Mostrar":
			System.out.println("muestra al usuario");
			break;
		default:
			break;
		}
			// ciclos for, while, do while
			
			/*for(int i = 0 ; i < 5; i++){
				System.out.println(i);
			}*/
		
		
		/*
			for ( int i=4; i>=0; i--) {
				System.out.println(i);
			}
			*/
			
			//factorial de un número
			int  n= 5;
			long factorial =1;
			
			/*
			for(int i = 1; i <= n; i++) {
				factorial *=i; //factorial = factorial *i
				
			}
			System.out.println("el factorial de 5 es : "+factorial);
		
	}
	
	//for Each --> list link

	int i = 1;
	while (i<=n) {
		int factorial = 1;
		i++;
	}
	System.out.println("el factorial de 5 es : "+factorial);
	*/
			
			
	//for each
	 List<String>  nombres  = new ArrayList<>();
	 nombres.add("juan");
	 nombres.add("Maria");
	 nombres.add("Pedro");
	 nombres.add("Marcos");
	 
	 for(String n1 : nombres) {
		 System.out.println(n1);
	 }
	
	
	
	}	
}


