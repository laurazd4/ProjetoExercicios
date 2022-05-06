package ListaDoisEntradaSaida;

import java.io.Console;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {

		Double valorRosa, valorTulipa, total; 
		int quantidadeRosa, quantidadeTulipa;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("quantidade de rosas: ");
		quantidadeRosa = ler.nextInt();

		System.out.println("Quantidade de tulipas: ");
		quantidadeTulipa = ler.nextInt();

		valorRosa = 2.8;
		valorTulipa = 4.2;

		total = (valorRosa * quantidadeRosa + valorTulipa * quantidadeTulipa);

		System.out.println("Valor total: " +total+ " reais.");
		ler.close();

	}
}
