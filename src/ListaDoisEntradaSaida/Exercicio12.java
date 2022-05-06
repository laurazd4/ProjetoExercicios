package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		double valorPacote, valorAvulsa, quantidadePacote, quantidadeAvulsa, totalPacote, totalAvulsa, totalFotos;

		Scanner ler = new Scanner(System.in);

		quantidadePacote = 100;

		System.out.println("Quantidade de pacotes (100 fotos): ");
		quantidadePacote = ler.nextDouble();

		System.out.println("Quantidade de fotos avulsa: ");
		quantidadeAvulsa = ler.nextDouble();

		valorPacote = 44.0f;
		valorAvulsa = 0.70f;

		totalPacote = valorPacote * quantidadePacote;
		totalAvulsa = valorAvulsa * quantidadeAvulsa;
		totalFotos = totalAvulsa + totalPacote;

		System.out.println("Valor total para pacote: " + String.format("%.2f", totalPacote) + " reais.");

		System.out.println("Valor total para fotos avulsas: " + String.format("%.2f", totalAvulsa) + " reais.");

		System.out.println("Valor total para o mural: " + String.format("%.2f", totalFotos) + " reais.");

		ler.close();
	}
}
