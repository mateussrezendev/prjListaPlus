package pctExercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vel, velmax, dif, multa, resposta;
		velmax = 50;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Qual a velocidade em que você estava dirigindo? (Em KM por hora)");
			vel = entrada.nextInt();

			dif = vel - velmax;
			multa = dif * 5;

			if (vel > velmax) {
				System.out.println(
						"Sua velocidade é maior que 50km por hora (A velocidade máxima permitida), então você vai receber uma multa no valor de R$"
								+ multa + ".");
			} else {
				System.out.println("Sua velocidade está dentro do limite.");
			}
			System.out.println("Deseja continuar? 1-Sim / 2-Não");
			resposta = entrada.nextInt();
		} while (resposta != 2);
		System.out.println("Programa Finalizado.");
		entrada.close();

	}
}
