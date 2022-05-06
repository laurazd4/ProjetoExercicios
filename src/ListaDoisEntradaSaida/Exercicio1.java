package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		int anoAtual, anoNasc, idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o ano atual:");
		anoAtual = ler.nextInt();

		System.out.println("Qual o ano de seu nascimento:");
		anoNasc = ler.nextInt();

		idade = anoAtual - anoNasc;

		System.out.println("Sua idade é: " + idade + " anos.");
		
		ler.close();

	}
}
