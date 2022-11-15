package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
			//Introducimos las variables
			int horas, minutos, segundos;
			
			//Abrimos el scanner
			Scanner sc = new Scanner(System.in);
			
			//Pedimos al usuario las horas
			System.out.print("Dime un número de horas (No mayor de 24): ");
			horas = sc.nextInt();
			
			//Pedimos al usuario los minutos
			System.out.print("Dime un número de minutos (No mayor de 60): ");
			minutos = sc.nextInt();
			
			//Pedimos al usaurio un número de segundos
			System.out.print("Dime un número de segundos (No mayor de 60): ");
			segundos = sc.nextInt();
			
			//Le sumariamos 1 a los segundos
			segundos++;
			
			//Introducimos las condiciones 
			if (horas > 24 || minutos >= 61 || segundos >= 61) {
				
			System.out.println("Los valores introducidos no son válidos"); //Mostramos lo que pasaria si no se introduce los valores correctos
			
			} else {
				
				if (segundos == 60) {
					minutos++;
					segundos = 0;
				}
				
				if (minutos == 60) {
					horas++;
					minutos = 0;
				}
				
				if (horas == 24) {
					horas = 0;
				}
				
				System.out.print("Si añadiesemos un segundo a tus valores introducido, sería la hora " + horas + ":" + minutos + ":" + segundos);
			}
			
			sc.close();
			
	}

}
