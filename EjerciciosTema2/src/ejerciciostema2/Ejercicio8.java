package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
				//Introducimos las variables
				int distancia, estancia;
				double precio = 2.5, descuento, total;

				//Abrimos el escaner
				Scanner sc = new Scanner(System.in);

				//Preguntamos al usuario cuantos km va a recorrer
				System.out.print("¿Cuantos km vas a recorrer durante el viaje?: ");
				distancia = sc.nextInt();
				
				//Pedimos cuanto tiempo se va a quedar
				System.out.print("¿Cuantos dias vas a instanciarte?: ");
				estancia = sc.nextInt();

				//Calculamos el precio total 
				total = distancia * precio;

				if (distancia > 800 && estancia > 7) { 
					
					descuento = total * 0.3; 
					
					total -= descuento;
					
					System.out.println("Ya que la distancia del viaje es mayor a 800km y la estancia mayor a 7 dias, se le ha hecho un 30% de descuento.El total de su viaje es: " + total+"€");
				
				} else { 
					
					System.out.print("El total del viaje es: " + total);
				}

				// Cerramos el escaner
				sc.close();


	}

	

}
