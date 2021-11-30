package Progra;

import java.util.Scanner;

public class Exercise8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x, y;
		float costTrip;
		float costKm;

		System.out.println("Introduce la distancia en km de tu viaje");
		x = keyboard.nextInt();
		System.out.println("Introduce los dias de tu viaje");
		y = keyboard.nextInt();

		costKm = x * 0.35f * 2;
		if ((x >= 1000) && (y >= 7)) {
			costTrip = costKm - costKm * 0.30f;
		} else {
			costTrip = costKm;
		}
		System.out.println("El coste será de " + costTrip);
	}
}
