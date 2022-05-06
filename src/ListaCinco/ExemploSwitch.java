package ListaCinco;

import java.util.Scanner;

public class ExemploSwitch {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o dia da semana?");
		int diaSemana = ler.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("O dia é domingo!");
			break;

		case 2:
			System.out.println("O dia é segunda-feira!");
			break;

		case 3:
			System.out.println("O dia é terça-feira!");
			break;

		case 4:
			System.out.println("O dia é quarta-feira!");
			break;

		case 5:
			System.out.println("O dia é quinta-feira!");
			break;

		case 6:
			System.out.println("O dia é sexta-feira!");
			break;

		case 7:
			System.out.println("O dia é sábado!");
			break;

		default:
			System.out.println("Favor inserir um número de 1 a 7.");

			ler.close();
		}
	}
}
