package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {

		double hora, minutos, segundos;

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantas horas: ");
		hora = ler.nextDouble();

		minutos = hora * 60;

		segundos = hora * 3600;

		System.out.println(hora + " horas equivale a " + minutos + " minutos e " + segundos + " segundos. ");

		ler.close();
	}
}
