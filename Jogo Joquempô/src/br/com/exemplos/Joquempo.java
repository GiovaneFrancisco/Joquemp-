package br.com.exemplos;

import java.util.Random;
import java.util.Scanner;

public class Joquempo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random resp = new Random();
		String escolhaj, escolhac;
		int jog = 0, comp = 0;
		do {
			System.out.println("[1] Pedra");
			System.out.println("[2] Papel");
			System.out.println("[3] Tesoura");
			int jogador = teclado.nextInt();
			if (jogador == 1) {
				escolhaj = "Pedra";
			} else if (jogador == 2) {
				escolhaj = "Papel";
			} else {
				escolhaj = "Tesoura";
			}
			int computador = (1 + (resp.nextInt(3)));

			if (computador == 1) {
				escolhac = "Pedra";
			} else if (computador == 2) {
				escolhac = "Papel";
			} else {
				escolhac = "Tesoura";
			}
			System.out.println();

			if (jogador > computador) {
				System.out.println("    " + escolhaj + " x " + escolhac);
				System.out.println("===Jogador Ganho====");
				jog++;
			} else if (jogador < computador) {
				System.out.println("    " + escolhaj + " x " + escolhac);
				System.out.println("===Computador Ganhou===");
				comp++;
			} else if (jogador == computador) {
				System.out.println("    " + escolhaj + " x " + escolhac);
				System.out.println("===Empate===");
			}
			System.out.println("          " + jog + "x" + comp);
			System.out.println();
			if (jog == 3) {
				System.out.println("Jogador Ganhou!!!!!!");
				System.exit(0);
			} else if (comp == 3) {
				System.out.println("Computador ganhou!!!!!");
				System.exit(0);
			}
		} while (jog < 4 || comp < 4);
	}

}
