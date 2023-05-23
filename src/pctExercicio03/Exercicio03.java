package pctExercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salhora, horaspormes, saltotal, resposta;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Quanto você ganha por hora? ");
			salhora = entrada.nextInt();

			System.out.println("Quantas horas você trabalha no mês? ");
			horaspormes = entrada.nextInt();

			saltotal = salhora * horaspormes;

			System.out.println("Seu salário é de R$" + saltotal + " por mês.");

			System.out.println("Deseja continuar? 1-Sim / 2-Não");
			resposta = entrada.nextInt();
		} while (resposta != 2);
		System.out.println("Programa Finalizado.");
		entrada.close();
	}
}
