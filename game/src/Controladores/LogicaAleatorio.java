package Controladores;

public class LogicaAleatorio {

	public int result(char correta, char resposta, int soma, char ativo) {
	
		if(resposta == correta) {
			if(ativo == 's' || ativo == 'S') {
				soma += 10;
				System.out.println("\t\tResposta Correta! você ganhou + 10 pontos");
			} else {
				System.out.println("\t\tResposta Correta!");
			}
			
		} else {	
			System.err.println("\t\tVocê errou! A resposta correta era a letra '"+correta+"'");		
		}
		
		return soma;
	}
}
