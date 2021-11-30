package Progra;

import java.util.Scanner;

public class Exercise3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double numero;
		double numero1;

		System.out.println("Introduce un número: ");
		numero = keyboard.nextDouble();

		System.out.println("Introduce otro número: ");
		numero1 = keyboard.nextDouble();

		if (numero % numero1 == 0) {
			System.out.println("El primer número es múltiplo del otro");
		} else if (numero % numero1 != 0) {
			System.out.println("El primer número no es múltiplo del segundo");
		}

	}

}
