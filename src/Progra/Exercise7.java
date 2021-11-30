package Progra;

import java.util.Scanner;

public class Exercise7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x;
		int y;
		int z;

		System.out.println("Introduce tres números: ");
		x = keyboard.nextInt();
		y = keyboard.nextInt();
		z = keyboard.nextInt();

		if ((x > y) && (x > z)) {
			if (y > z) {
				System.out.println(z + " " + y + " " + x);
			} else {
				System.out.println(y + " " + z + " " + x);
			}
		} else if ((y > x) && (y > z)) {
			if (x > z) {
				System.out.println(z + " " + x + " " + y);
			} else {
				System.out.println(x + " " + z + " " + y);
			}
		} else { // Entra por aqui cuando Z es mayor
			if (x > y) {
				System.out.println(y + " " + x + " " + z);
			} else {
				System.out.println(x + " " + y + " " + z);
			}
		}
	}

}
