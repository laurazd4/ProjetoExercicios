package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		double quantidadeFolha;
		double cobranca;
		double valor;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Quantidade de folhas copiadas:");
		quantidadeFolha = ler.nextInt();

		cobranca = 0.08;
		valor = quantidadeFolha * cobranca;

		System.out.println("O valor será igual: " + valor + " reais");

		ler.close();
	}
}
