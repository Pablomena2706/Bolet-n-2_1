package Progra;

import java.util.Scanner;

public class Exercise4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double numero;

		System.out.println("Introduce un número: ");
		numero = keyboard.nextDouble();

		if (numero > 0) {
			System.out.println("El número es positivo");
		} else if (numero == 0) {
			System.out.println("El número es cero");
		} else if (numero < 0) {
			System.out.println("El número es negativo");

		}

	}
}
