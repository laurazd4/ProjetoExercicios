package Exemplos;

public class TesteIF {
	public static void main(String[] args) {

		double salario, salarioMil, salarioMenor;

		salario = 1500;

		if (salario >= 1000) {

			salarioMil = salario + (salario * 0.10);

			System.out.println(" O colaborador ganhará :" + salarioMil + " reais. ");
		}

		else if (salario < 1000) {

			salarioMenor = salario + (salario * 0.15);

			System.out.println(" O colaborador ganhará: " + salarioMenor + " reais. ");

		}

	}

}
