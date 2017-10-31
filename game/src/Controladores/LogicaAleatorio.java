package Controladores;

public class LogicaAleatorio {

	public int result(char correta, char resposta, int soma, char ativo) {
	
		if(resposta == correta) {
			if(ativo == 's' || ativo == 'S') {
				soma += 10;
				System.out.println("Resposta Correta! você ganhou + 10 pontos");
			} else {
				System.out.println("Resposta Correta!");
			}
			
		} else {	
			System.err.println("\tVocê errou! A resposta correta era a letra '"+correta+"'");	
		}
		
		return soma;
	}
}
