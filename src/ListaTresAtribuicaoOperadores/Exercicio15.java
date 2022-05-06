package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {

		double lado, area;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o comprimento do lado do quadrado: ");
		lado = ler.nextDouble();

		area = Math.pow(lado, 2);

		System.out.println("A área do quadrado será igual a: " + String.format("%.2f", area) + " u.a");

		ler.close();
	}
}
