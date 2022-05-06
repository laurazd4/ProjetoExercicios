package ListaTres;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {

		double lado, area;

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o comprimento do lado do quadrado: ");
		lado = ler.nextDouble();

		area = lado * lado;

		System.out.println("A área do quadrado será igual a: " + String.format("%.3f", area) + " u.a");

	}
}
