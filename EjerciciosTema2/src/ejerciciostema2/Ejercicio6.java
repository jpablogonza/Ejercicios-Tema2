package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
			//introducimos las variables 
			int num1, num2, resultadoUsuario, resultadoCorrecto;
		
			//Abrimos el scanner
			Scanner sc = new Scanner(System.in);
			
			num1 = (int) (Math.random() * 99); //Sacamos el primer número aleatorio
			
			num2 = (int) (Math.random() * 99); //Sacamos el segundo número aleatorio
			
			//Le pedimos al usuario que resuelva la suma con los números aleatorios
			System.out.println("Resuelve la siguiente suma: " + num1 + " + " + num2);
			resultadoUsuario = sc.nextInt();
			
			//Sumariamos para tener la solución correcta
			resultadoCorrecto = num1 + num2;
			
			if (resultadoCorrecto == resultadoUsuario) { //Si el resultado del usuario es igual al real habrá acertado
				System.out.println("¡Felicidades!, Has acertado."); //Mostramos que ha acertado
				
			} else { // Si el resultado dado por el usuario no es igual al real se mostrará que ha fallado
				System.out.println("Lo siento, pero has fallado."); //Mostramso que ha fallado
			}
			
			sc.close();

	}

}
