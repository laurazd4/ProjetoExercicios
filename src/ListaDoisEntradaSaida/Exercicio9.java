package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio9 { // churrascao
	public static void main(String[] args) {

		double carne, cerveja, valor;
		int pessoas;

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantidade de pessoas: ");
		pessoas = (int) ler.nextDouble();

		carne = (double) 18;
		cerveja = 1.70;

		valor = carne * 0.5 * pessoas + cerveja * 6.0 * pessoas;

		System.out.println("o valor para " + pessoas + " pessoas será: " + valor + " reais");
		
		ler.close();

	}
}