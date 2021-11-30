package Progra;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Escribe una cadena");
		String cadena = keyboard.nextLine();
		int caracter = random.nextInt(cadena.length());
		System.out.println("El carácter es (" + cadena.charAt(caracter) + ") se encuentra en la posicion " + caracter);

	}

}
