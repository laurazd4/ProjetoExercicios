package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		double salario, quantidadeHoras, valorHora;
		String nomeFunc;
		int quantidadeFilhos;

		Scanner ler = new Scanner(System.in);

		System.out.println("Nome do Funcion�rio: ");
		nomeFunc = ler.next();

		System.out.println("Quantidade de filhos do funcion�rio: ");
		quantidadeFilhos = ler.nextInt();

		System.out.println("Quantidade de horas trabalhadas: ");
		quantidadeHoras = ler.nextDouble();

		System.out.println("Valor recebido por hora pelo funcion�rio: ");
		valorHora = ler.nextDouble();

		salario = quantidadeHoras * valorHora + 0.03f * quantidadeFilhos * valorHora;

		System.out.println("O funcion�rio " + nomeFunc + " ganhar� " + salario + " reais.");
		
		ler.close();
	}
}
