package Progra;

import java.util.Scanner;

public class Exercise5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int nota;

		System.out.println("Introduce una nota; ");
		nota = keyboard.nextInt();

		switch (nota) {
		case 0:
			System.out.println("Muy deficiente, para esto ni me presentaba");
			break;
		case 1:
			System.out.println("Muy deficiente, ¿pero sabes de que iba el examen?");
			break;
		case 2:
			System.out.println("Muy deficiente, has puesto el nombre y poco más");
			break;
		case 3:
			System.out.println("Insuficiente, estudia más a la próxima y llegas");
			break;
		case 4:
			System.out.println("Insuficiente, lástima, te has quedado a las puertas");
			break;
		case 5:
			System.out.println("Suficiente, aprieta que para la próxima a lo mejor no llegas");
			break;
		case 6:
			System.out.println("Bien, se nota que no has estudiado solo el dia de antes");
			break;
		case 7:
			System.out.println("Notable, muy bien trabajado");
			break;
		case 8:
			System.out.println("Notable, genial, casi consigues el sobresaliente");
			break;
		case 9:
			System.out.println("Sobresaliente, excelente trabajo, has rozado la perfección");
			break;
		case 10:
			System.out.println("Sobresaliente, felicidades has hecho el examen perfecto");
			break;

		}

	}

}
