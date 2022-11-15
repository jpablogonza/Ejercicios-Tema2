package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
				//Introducimos las variables
				int NumDni, resto;
				char letraDni = ' ';

				//Abrimos el escaner
				Scanner sc = new Scanner(System.in);

				//Pedimos el numero del DNI al usuario
				System.out.print("Dime tu numero del DNI: ");
				NumDni = sc.nextInt();

				//Si el numero tiene mas o menos de 8 cifras no es valido
				if (NumDni > 100000000 || NumDni < 10000000) {
					System.out.println("Ese DNI no es válido");
				} else {
					//Hacemos el módulo de 23 al número del DNI para conseguir el resto, que nos dira la letra
					resto = NumDni % 23;

					//sabiendo el resto, obtenemos la letra
					switch (resto) {
					case 0:
						letraDni = 'T';
						break;
					case 1:
						letraDni = 'R';
						break;
					case 2:
						letraDni = 'W';
						break;
					case 3:
						letraDni = 'A';
						break;
					case 4:
						letraDni = 'G';
						break;
					case 5:
						letraDni = 'M';
						break;
					case 6:
						letraDni = 'Y';
						break;
					case 7:
						letraDni = 'F';
						break;
					case 8:
						letraDni = 'P';
						break;
					case 9:
						letraDni = 'D';
						break;
					case 10:
						letraDni = 'X';
						break;
					case 11:
						letraDni = 'B';
						break;
					case 12:
						letraDni = 'N';
						break;
					case 13:
						letraDni = 'J';
						break;
					case 14:
						letraDni = 'Z';
						break;
					case 15:
						letraDni = 'S';
						break;
					case 16:
						letraDni = 'Q';
						break;
					case 17:
						letraDni = 'V';
						break;
					case 18:
						letraDni = 'H';
						break;
					case 19:
						letraDni = 'L';
						break;
					case 20:
						letraDni = 'C';
						break;
					case 21:
						letraDni = 'K';
						break;
					case 22:
						letraDni = 'E';
						break;

					}

					//Mostramos el Dni del usuario cin su respectiva letra
					System.out.println("Tu DNI es: "+ NumDni + letraDni);
				}

				//Cerramos el escaner
				sc.close();

	}

}
