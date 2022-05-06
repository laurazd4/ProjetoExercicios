package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		double cobranca, consumo, valor, temp;

		Scanner ler = new Scanner(System.in);

		System.out.println("Minutos que foi utilizado: ");
		consumo = ler.nextDouble();

		cobranca = 2.3;
		temp = 1.0 / 60.0;
		valor = consumo * temp * cobranca;

		System.out.println("O valor será igual: " + valor + " reais");
		
		ler.close();

	}
}
