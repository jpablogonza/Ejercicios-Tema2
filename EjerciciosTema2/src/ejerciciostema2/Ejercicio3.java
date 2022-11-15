package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
				//Introducimos las variables
				int NumAnimales;
				double KilosComprados, KilosDiarios, CantidadNecesaria;

				//Abrimos el escaner
				Scanner sc = new Scanner(System.in);

				//Le pedimos al usuario cuantos kilos de comida ha comprado
				System.out.print("Dime el número de kilos comprado: ");
				KilosComprados = sc.nextDouble();

				//Le pedimos al usuario cuantos número de animales van a comer
				System.out.print("Dime cuantos animales van a comer: ");
				NumAnimales = sc.nextInt();

				//Le pedimos la media de kilos que comen los animales
				System.out.print("Dime cuantos kilos diarios comen los animales: ");
				KilosDiarios = sc.nextDouble();

				if (NumAnimales <= 0) { //Si el numero de animales es menor o igual que 0 no se puede continuar
					System.out.println("El numero de animales no es válido"); //Mostramos que no es válido
					
				} else { //En caso de que válido continuamos
					
					if (KilosComprados >= KilosDiarios) { //En caso de que los kilos comprado sea superior a los que consumen 
						System.out.println("Tienes suficiente comida para los animales"); //Mostramos que tienen comida 
						
					} else { //En caso de que sea menor
						
						CantidadNecesaria=KilosComprados/(double)NumAnimales; //Calculamos cuantos kilos comprados le corresponden a cada animal
						
						System.out.println("No tienes comida para los animales"); //Mostramos que no hay comida suficiente
						System.out.println("A cada animal le corresponderia: " + CantidadNecesaria); //Lo mostramos
					}
				}

				//Cerramos el escaner
				sc.close();

	}

}
