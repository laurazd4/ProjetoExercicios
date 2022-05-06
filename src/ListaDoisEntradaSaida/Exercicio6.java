package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		double dias, cobranca, valor;

		Scanner ler = new Scanner(System.in);

		System.out.println("Dias de atraso:");
		dias = ler.nextDouble();

		cobranca = 2.5;

		valor = cobranca * dias;

		System.out.println("O valor será igual: " + valor + " reais");
		
		ler.close();

	}
}
