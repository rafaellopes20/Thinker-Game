package Controladores;

import java.util.Scanner;

public class LogicaTudoouNada {

	public double result(char ativo, char respostaUser, char correta, double money, double valor, int elim, int pista, int chance) {
		Scanner scan = new Scanner(System.in);	
		
			if(respostaUser == '1' && elim <= 0 || respostaUser == '2' && pista <= 0 || respostaUser <= '3' && chance == 0) {	   
				while(respostaUser == '1' && elim <= 0 || respostaUser == '2' && pista <= 0|| respostaUser == '3' && chance == 0) {
					System.err.println("\t+---------------------------------------+");
					System.err.println("\t|Voc� n�o pode mais utilizar essa ajuda!|");
					System.err.println("\t+---------------------------------------+");
					respostaUser = scan.next().charAt(0);
				}
		   }
		   
		   if(respostaUser == correta) {
			   if(ativo == 's' || ativo == 'S') {
				   money += valor;
				   System.out.println("Resposta correta, voc� ganhou $"+money+"!\n");
			   } else {
				   System.out.println("Resposta correta!\n");
			   }			   
		   } else if(respostaUser == '1'  && elim >= 0) {
			   System.out.println("\t+-------------------+");
			   System.out.println("\t|PERGUNTA ELIMINADA!|");
			   System.out.println("\t+-------------------+\n");
		   } else if(respostaUser == '2' && pista >= 0) {
			//		System.out.println("   # PISTA: Qual a pron�ncia correta da palavra?"); // PREENCHER
			//		System.out.println("\ta) \tb) \tc) \td) "); // PREENCHER
			   respostaUser = scan.next().charAt(0);
			   if(respostaUser == correta) {
				   if(ativo == 's' || ativo == 'S') {
					   money += valor/2;
					   System.out.println("Resposta correta, voc� acumulou $"+money+"!\n");
				   } else {
					   System.out.println("Resposta correta!");
				   }	
			   } else {
				   System.err.println("Voc� errou! A resposta correta era a letra '"+correta+"'\n");
			   }
		   } else if(respostaUser == '3' && chance >= 0) {
			//   System.out.println("\t# CHANCE: a) \tc) "); // PREENCHER
			   respostaUser = scan.next().charAt(0);
			   if(respostaUser == correta) {
				   if(ativo == 's' || ativo == 'S') {
					   money += valor/2;
					   System.out.println("Resposta correta, voc� acumulou $"+money+"!\n");
				   } else {
					   System.out.println("Resposta correta!\n");
				   }	
			   } else {
				   System.err.println("Voc� errou! A resposta correta era a letra '"+correta+"'\n");
			   }
		   } else {
			   System.err.println("Voc� errou! A resposta correta era a letra '"+correta+"'\n");
		   }	   
	   	
		return money;
		
	}
	
}
