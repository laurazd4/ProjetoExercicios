package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		int idade, dias;

		System.out.println("Qual o nome da pessoa: ");
		nome = ler.next();

		System.out.println("Qual a idade da pessoa: ");
		idade = ler.nextInt();

		dias = idade * 365;

		System.out.println(nome + " terá vivido " + dias + " dias");
		
		ler.close();

	}
}
