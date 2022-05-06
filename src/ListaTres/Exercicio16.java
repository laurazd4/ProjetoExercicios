package ListaTres;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {

		double receita, despesas, lucro, percentualP, percentualTotal;

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		System.out.println("Qual a receita da empresa: ");
		receita = ler.nextDouble();

		System.out.println("Qual as despesas da empresa: ");
		despesas = ler.nextDouble();

		lucro = receita - despesas;
		percentualP = despesas * 100;
		percentualTotal = percentualP / receita;

		System.out.println("O lucro será igual a: " + lucro);
		System.out.println("O percentual será igual a: " + percentualTotal + "%");

	}
}
