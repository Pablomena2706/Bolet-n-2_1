package Progra;

import java.util.Scanner;

public class Exercise1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double numero;

		System.out.println("Introduce un número: ");
		numero = keyboard.nextDouble();

		if (numero >= 1000) {
			System.out.println((numero * 15) / 100);
		} else {
			System.out.println(numero);
		}
	}

}
