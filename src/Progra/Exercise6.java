package Progra;

import java.util.Scanner;

public class Exercise6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x;
		int y;
		int z;

		System.out.println("Introduce tres números separados: ");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		z = keyboard.nextInt();

		if (x == y || y == z) {

			if (x == y && x == z) {

				System.out.println("Hay tres números iguales a " + x);

			} else {

				System.out.println("Hay dos números iguales a " + x);

			}

		} else if (y == z) {

			System.out.println("Hay dos números iguales a " + y);

		} else {

			System.out.println("No hay números iguales");

		}
		if (x == z) {

			System.out.println("Hay dos números iguales a " + z);

		}

	}

}