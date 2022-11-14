package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
			//Introducimos las variables
			int num, milesimas, centesimas, decimas, unidades;
			
			//Abrimos el scanner
			Scanner sc = new Scanner(System.in);
			
			//Pedimos al usuario un número comprendido entre 0 y 9999
			System.out.print("Dime un número entre 0-9999 y diré si es capicúa: ");
			num = sc.nextInt();
			
			//Introducimos las condiciones
			if (num < 1 || num > 9999) { //Si el número es menor que 1 o mayor de 9999, no sería válido
				System.out.println("El numero no es valido");//Mostrariamos que el número introducido no es válido
				
			} else if (num >= 1 && num < 10) { //Si el número es de una sola cifra, es capicua
				System.out.println("El numero es capicua"); //Mostramos que es capicua
				
			} else if (num >= 10 && num < 100) { //Comprobamos si el número tiene dos cifras
				
				decimas = (int) (num / 10); //Dividimos el número entre 10 para ver la primera cifra
				unidades = num % 10; //Sacamos el resto del número, que sería la segunda cifra
				
				if (decimas == unidades) { //Si las dos cifras son iguales, el número seria capicía
					System.out.println("El numero es capicua"); //Mostramos que es capicúa
					
				} else { //Si las dos cifras no son iguales, el número no nes capicúa
					System.out.println("El numero no es capicua"); //Mostramos que no es capicúa
					
				}
			} else if (num >= 100 && num < 1000) { //Comprobamos en caso de que el número tengo tres cifras
				
				centesimas = (int) (num / 100); //Dividimos el número entre 100 para ver la primera cifra
				unidades = num % 10;  //Sacamos el resto del número, que sería la tercera cifra
				
				if (centesimas == unidades) { //Si la primera y última cifra son iguales, el número es capicúa
					System.out.println("El numero es capicua"); //Mostramos que es capicúa
					
				} else { //Si no son iguales, el número no es capicúa			
					System.out.println("El numero no es capicua"); //Mostramos que no es capicúa
				}
			} else { //Comprobamos en caso de que el número tengo cuatro cifras
				
				milesimas = (int) (num / 1000); //Dividimos el número entre 1000 para ver la primera cifra
				centesimas = (int) (num / 100) % 10; //Dividimos el número entre 100 y le hacemos el módulo de 10 para obtener la segunda cifra
				decimas = (int) (num / 10) % 10; //Dividimos el número entre 10 y le hacemos el módulo de 10 para obtener la tercera cifra
				unidades = num % 10; //Hacemso el módulo de 10 y así tendremos la cuarta cifra
				
				if (milesimas == unidades && centesimas == decimas) { //Si la primera y última cifra son iguales y la segunda y la tercera también
					System.out.println("El numero es capicúa"); //Si se cumple el número es capicúa
					
				} else { 
					System.out.println("El numero no es capicúa"); //Si no se cumple el número no es capicúa
				}
			}

			//Cerramos el escaner
			sc.close();

			

	}

}
