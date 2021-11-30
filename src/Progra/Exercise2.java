package Progra;

import java.util.Scanner;

public class Exercise2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numero;

		System.out.println("Introduce un número: ");
		numero = keyboard.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El número es par");
		}
		if (numero % 2 != 0) {
			System.out.println("El número es impar");

		}

	}

}
