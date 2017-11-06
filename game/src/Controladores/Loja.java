package Controladores;

import java.util.Scanner;

public class Loja {

	public void menuLoja() {

		System.out.println("\t\t\t\t+-------------------+");
		System.out.println("\t\t\t\t|    LOJA ABERTA    |");
		System.out.println("\t\t\t\t+-------------------+");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\t\t+-------------------------------------------------+");
		System.out.println("\t\t| Aperte 1. Comprar 1 Eliminação:......... $50.00 |");
		System.out.println("\t\t| Aperte 2. Comprar 1 Chance:............. $40.00 |");
		System.out.println("\t\t| Aperte 3. Comprar 1 Pista:.............. $35.00 |");
		System.out.println("\t\t+-------------------------------------------------+");

	}

	public int lojaE(double money, int elim) {
		if (money >= 50.00) {
			System.out.println("\t\t\t\t Mais 1 Eliminação Adquirida! Agora, responda...");
			elim++;
			return elim;
		} else {
			System.err.println("\t\t\t\t Você não possui dinheiro suficiente: $" + money+". Responda a Pergunta!");
		}
		return 0;
	}

	public int lojaC(double money, int chance) {

		if (money >= 40.00) {
			chance++;
			System.out.println("\t\t\t\t Mais 1 Chance Adquirida! Agora, responda...");
			return chance;
		} else {
			System.err.println("\t\t\t\t Você não possui dinheiro suficiente $" + money);
		}

		return 0;
	}

	public int lojaP(double money, int pista) {
		if (money >= 35.00) {
			pista++;
			System.out.println("\t\t\t\t Mais 1 Pista Adquirida! Agora, responda...");
			return pista;
		} else {
			System.err.println("\t\t\t\t Você não possui dinheiro suficiente $" + money);
		}
		return 0;
	}

}
