package ListaCinco;

import java.util.Scanner;

public class ExemploSwitch {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o dia da semana?");
		int diaSemana = ler.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("O dia � domingo!");
			break;

		case 2:
			System.out.println("O dia � segunda-feira!");
			break;

		case 3:
			System.out.println("O dia � ter�a-feira!");
			break;

		case 4:
			System.out.println("O dia � quarta-feira!");
			break;

		case 5:
			System.out.println("O dia � quinta-feira!");
			break;

		case 6:
			System.out.println("O dia � sexta-feira!");
			break;

		case 7:
			System.out.println("O dia � s�bado!");
			break;

		default:
			System.out.println("Favor inserir um n�mero de 1 a 7.");

			ler.close();
		}
	}
}
