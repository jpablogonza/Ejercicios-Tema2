package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
			//introducimos las variables
			int num;
		
			//Abrimos el scanner
			Scanner sc = new Scanner(System.in);
			
			//Le pedimos al usuario un número
			System.out.print("Dime un número: ");
			num = sc.nextInt();
			
			//Usamos el operador ternario para sacar el valor absoluto del número
			num = num<0 ? -num : num;
			
			//Mostramos el número en valor absoluto
			System.out.print("El número que elegiste ne valor absoluto sería: " + num);
			
			//Cerramos el scanner
			sc.close();
			
	}

}
