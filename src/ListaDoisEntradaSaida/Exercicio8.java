package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		double distancia, tempoP, valor;
		String nomePiloto;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o nome do piloto: ");
		nomePiloto = ler.next();

		System.out.println("Qual o tempo (horas) percorrido: ");
		tempoP = ler.nextDouble();

		System.out.println("Qual a dist�ncia: ");
		distancia = ler.nextDouble();

		valor = distancia / tempoP;

		System.out.println(" A velocidade m�dia de " + nomePiloto + " foi " + valor + "km/h");
		
		ler.close();

	}
}
