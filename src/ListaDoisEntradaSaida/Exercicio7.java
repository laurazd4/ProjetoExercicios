package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		double peso, cobranca, total;

		Scanner ler = new Scanner(System.in);

		cobranca = 0.02; // peso por grama

		System.out.println("Qual a pesagem em gramas:");
		peso = ler.nextDouble();

		total = peso * cobranca;

		System.out.println("o cliente deverá pagar :" + total + "reais");
		
		ler.close();

	}
}
