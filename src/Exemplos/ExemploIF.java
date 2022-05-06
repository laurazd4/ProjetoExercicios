package Exemplos;

import java.util.Scanner;

public class ExemploIF {
	public static void main(String[] args) {

		int a;

		Scanner ler = new Scanner(System.in);

		System.out.println("Valor para a: ");
		a = ler.nextInt();

		String b;

		b = (a > 14) ? "atrasado" : (a < 14) ? "adiantado" : "No horario";
		System.out.println("Resultado: " + b);
		
		ler.close();
	}
}
