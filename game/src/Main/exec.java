package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Controladores.LogicaAleatorio;
import Controladores.LogicaTudoouNada;
import Controladores.Loja;
import Controladores.RankingGame;

public class exec {

	public static void main(String[] args) {
		
		Loading();
		//Menu(" - ",0);
		//tudoOunada(" - ",'s');
	}

	// Telinha de Loading...
	private static void Loading() {
		System.out.println("  //  Bem-Vindo ao Thinker Game \\\\");
		try {
			System.out.print("\n\tCarregando Aguarde...\n");
			Thread.sleep(5000);
			System.out.print("\t:");
			Thread.sleep(500);
			System.out.print(":::");
			Thread.sleep(500);
			System.out.print(":");
			Thread.sleep(1200);
			System.out.print("::::");
			Thread.sleep(1000);
			System.out.print(":::");
			Thread.sleep(2000);
			System.out.print("::::::");
			Thread.sleep(300);
			System.out.print("\n\t    Concluído!\n\n\n\n\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Menu(" - ", 0);

	}

	// Menu do jogo
	private static void Menu(String player, int pontos) {
		String nome = player;
		int pontuacao = pontos;
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		System.out.println("\t+------------------------+");
		System.out.println("\t|###| MENU PRINCIPAL |###|");
		System.out.println("\t|       1- Jogar         |");
		System.out.println("\t|       2- Ranking       | ");
		System.out.println("\t|       3- Sobre         |");
		System.out.println("\t|       9- Sair          |");
		System.out.println("\t+------------------------+");

		escolha = scan.nextInt();

		switch (escolha) {
		case 1:
			JogoPrincipal();
		case 2:
			Ranking(nome, pontuacao);
		case 3:
			Sobre(nome, pontuacao);
		case 9:
			FimDeJogo();
		}

	}

	// JogoPrincipal (jogo.exe)
	private static void JogoPrincipal() {
		Player player = new Player();
		RankingGame rankingGame = new RankingGame();
		Scanner scan = new Scanner(System.in);
		int escolha1 = 0;
		
		System.out.println("     |   Jogar   |");
		System.out.print("Escolha o Nickname: ");
		player.nome = scan.nextLine();
		rankingGame.setPlayer(player.getNome());
		char ativo;
		System.out.println("Deseja ativar as pontuações? (S- SIM/ N- NÃO):");
		ativo =  scan.next().charAt(0);
		System.out.println("\nBem-Vindo "+player.getNome().toUpperCase()+"! Escolha a categoria desejada:\n");
		System.out.println("       | 1. Aleatório         |");
		System.out.println("       | 2. Tudo ou Nada      |");
		System.out.println("       | 9. Sair              |");
		escolha1 = scan.nextInt();
		
		switch(escolha1) {
		case 1:
			aleatorio(rankingGame.getPlayer(), ativo);
		case 2:
			tudoOunada(rankingGame.getPlayer(), ativo);
		case 9:
			Menu(rankingGame.getPlayer(), 0);
		}

	}

	//Modo de jogo                             1- aleatorio
	private static void aleatorio(String player, char ativo) {

		int questão = 0;
		int soma=0;
		Scanner scan = new Scanner(System.in);	
		LogicaAleatorio logica = new LogicaAleatorio();
		int q = 0;
		char resposta; 
		char correta;       
		
		List<Integer> numeros = new ArrayList<Integer>();
		//Sequencia de numeros
		for (int i = 1; i < 31; i++) { 
		    numeros.add(i);
		}
		//Embaralhamos os números:
		Collections.shuffle(numeros);
		//Mostramos 6 aleatórios
		for (int i = 0; i < 30; i++) {
		//   numeros.get(i);
		   q = numeros.get(i);
		   
             if(q == 1) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Na escala 1:100, 1 centímetro no desenho representa quanto da medida real?");
     			System.out.println("a) 1 metro\nb) 10 metros");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q== 2) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Quantas estrelas existem no nosso Sistema Solar?");
     			System.out.println("a) Uma\nb) Mais de um bilhão");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}	
     			
     		if(q == 3) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é a capital do Brasil?");
     			System.out.println("a) São Paulo\nb) Brasília\nc) Espírito Santo");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 4) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Fator climático que varia conforme aproxima-se ou distancia-se da Linha do Equador?");
     			System.out.println("a) Altitude\nb) Latitude");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 5) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual personagem de série de TV que grita: Gentalha, gentalha, gentalha?");
     			System.out.println("a) Chaves\nb) Kiko\nc) Chiquinha\nd) Dona Florinda");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}

     		if(q == 6) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual o continente de origem dos escravos trazidos para o Brasil no período colonial?");
     			System.out.println("a) África\nb) Ásia\nc) Inglês");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		if(q == 7) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Das opções abaixo, qual não é um elemento climático?");
     			System.out.println("a) Pressão Atmosférica\nb) Maritimidade\nc) Sol\nd) Chuva");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 8) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual feriado foi comemorado ontem (7/setembro)?");
     			System.out.println("a) Independência do Brasil\nb) Proclamação da República\nc) Dia das Crianças\nd) Finados");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 9) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Em qual país fica a Torre Eiffel?");
     			System.out.println("a) Paris\nb) Brasil\nc) França\nd) Estados Unidos");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 10) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual o nome dos sete anões na História da Cinderela?");
     			System.out.println("a) Um\nb) Sete\nc) Pequem\nd) Nenhuma das Alternativas");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}

     		if(q == 11) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é o terceiro planeta do nosso Sistema Solar a partir do Sol?");
     			System.out.println("a) Terra\nb) Júpiter\nc) Saturno\nd) Marte");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 12) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é o maior planeta do nosso Sistema Solar?");
     			System.out.println("a) Saturno\nb) Plutão\nc) Júpiter\nd) Netuno");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 13) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Clima que não encontramos em nosso país?");
     			System.out.println("a) Equatorial\nb) Cerrado\nc) Polar");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 14) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Quem é o grande vilão na história de Peter Pan?");
     			System.out.println("a) Dougras Plack\nb) Jack Sparrow\nc) Capitão Gancho\nd) Venom");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 15) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". No filme 'Os Vingadores', quem Hulk chama de deus fracote?");
     			System.out.println("a) Thor\nb) Odin\nc) Floki\nd) Loki");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 16) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é o maior ser vivo da Terra?");
     			System.out.println("a) Um mamífero\nb) Um fungo\nc) Elefante\nd) Baleia");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 17) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é o maior animal da Terra?");
     			System.out.println("a) Elefante\nb) Rinoceronte\nc) Baleia Azul\nd) Lula");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 18) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual o desenho animado que tem as esferas do dragão?");
     			System.out.println("a) Dragon ball\nb) Digimon\nc) Super Ball");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 19) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é a moeda oficial do México?");
     			System.out.println("a)Peso Mexicano\nb) Dólar Mexicano");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 20) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual a capital do México?");
     			System.out.println("a) Londres\nb) Cuiaba\nc) Cidade Del Rey\nd) Cidade do México");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 21) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual o verdadeiro nome do Super Homem aqui na Terra?");
     			System.out.println("a) Peter Parker\nb) Bruce Wayne\nc) Clark Kent");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 22) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Um ano bissexto tem quantos dias?");
     			System.out.println("a) 365\nb) 366\nc) 367");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 23) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual personagem é autor da frase “Não contavam com minha astúcia!”?");
     			System.out.println("a) Chaves\nb) Chapolim Colorado\nc) Doutor Raimundo");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 24) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual é o jogo online mais jogado no mundo atualmente?");
     			System.out.println("a) League of Legends\nb) Battlefield\nc) Minecraft\nd) Candy Crush");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 25) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual mês do ano tem 28 dias?");
     			System.out.println("a) Todos \nb) Fevereiro \nc) Outubro");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 26) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual o valor de PI?");
     			System.out.println("a) 3,14\nb) 13,14\nc) 2,14\nd) 12,14");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 27) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Qual a cor do cavalo Branco de Napoleão?");
     			System.out.println("a) Verde\nb) Marrom\nc) Branco\nd) Preto");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 28) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Segundo a Bíblia, quem foi o personagem mais forte?");
     			System.out.println("a) Sansão\nb) Davi\nc) Moisés");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 29) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". No Brasil, a cada quantos anos um presidente pode ficar no poder?");
     			System.out.println("a) 5 anos\nb) 4 anos\nc) 3 anos\nd) Nenhuma das Alternativas");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 30) {
     			questão++;
     			System.out.println("=========================================================================================| PONTUAÇÃO: "+soma+" |=========");
     			System.out.println(questão+". Quem foi o personagem responsável por abrir o mar vermelho segundo a bíblia?");
     			System.out.println("a) Abraão\nb) Davi\nc) Jacó\nd) Moisés");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);
     		} 		
        }
	
		if(ativo == 's' || ativo == 'S') {
			System.out.println("\n\n\t ----------------| PONTUAÇÃO FINAL DE "+ player.toUpperCase()+" FOI DE "+soma+" PONTOS |----------------");
		} else {
			System.out.println("\n\n\t ----------------| "+player.toUpperCase()+", OS PONTOS HAVIAM SIDO DESATIVADOS! |----------------");
		}
		
		try {
			if(ativo == 's' || ativo == 'S') {
				System.out.println("                             SALVANDO INFORMAÇÕES NO RANKING...");
				Thread.sleep(3000);
			}
			Thread.sleep(3000);
			System.out.print("\nRetornando ao menu principal");
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(900);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print("..");
			Thread.sleep(700);
			System.out.print("...");
			Thread.sleep(900);
			System.out.print("....");
			Thread.sleep(400);
			System.out.print(" Concluído!\n\n\n\n\n\n");
			Thread.sleep(400);
			RankingGame rankingGame = new RankingGame();
			rankingGame.setPlayer(player);
			rankingGame.setPontuacao(soma);
			
			Menu(rankingGame.getPlayer(), rankingGame.getPontuacao());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	//Modo de jogo                             2- Tudo ou Nada
	private static void tudoOunada(String player, char ativo) {
	
		Scanner scan = new Scanner(System.in);	
		LogicaTudoouNada logica = new LogicaTudoouNada();
		Loja shop = new Loja();
		
		int questão = 0, x = 0, q = 0;
		double money= 0.00, valor = 0.00;
		int elim = 1; // Elimina a questão (nao ganha pontos)
		int pista = 3; // oferece uma pista das alternativas
		int chance = 2; // tira 2 itens das alternativas
		char respostaUser, correta;
		List<Integer> numeros = new ArrayList<Integer>();
		//Sequencia de numeros

		for (int i = 1; i < 31; i++) { 
		    numeros.add(i);
		}
		//Embaralhamos os números:
		Collections.shuffle(numeros);
		//Mostramos 6 aleatórios
		for (int i = 1; i < 30; i++) {
		//   numeros.get(i);
			q = numeros.get(i);	
			
			//Questões
			if(q == 1) {//------------------------------------------------------------------------------------------------------------------
				questão++;
				System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
				System.out.println(questão+". Qual a pronúncia correta da palavra?"); // PREENCHER
				System.out.println("a)Iorgute\tb)Iogute\tc)Iorgurte\td)Iogurte"); // PREENCHER
				valor = 5.00; //ALTERAR SE NECESSÁRIO
				respostaUser = scan.next().charAt(0);
				correta = 'd'; // PREENCHER		
				if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
				   					//condições de resposta   
				if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Definitivamente Iogute está errado?"); // PREENCHER
				    System.out.println("\ta)Iorgute\tx)xxxxxx\tc)Iorgurte\td)Iogurte"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: a) Iorgute\td) Iogurte"); // PREENCHER
				}
				money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);	
				if(respostaUser == '1') {
					if(elim > 0) {
						elim--;	
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}
			}	   
			
			if(q == 2) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Qual o número de estados da Região Sudeste do Brasil?"); // PREENCHER
			   System.out.println("a) 2\tb) 3\tc) 4\td) 5"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'c'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta	
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: SP/ES/RJ/MG..."); // PREENCHER
				    System.out.println("\ta) 2\tb) 3\tc) 4\td) 5"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: b)3 \tc) 4"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}
		   }
		   
			if(q == 3) { //------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Qual é o maior continente do mundo?"); // PREENCHER
			   System.out.println("a) Africano\tb) Ásia\tc) Europeu\td) Nenhuma das Alternativas"); // PREENCHER
			   valor = 10.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'b'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta	
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Seria talvez o Continente que comece com 'A'"); // PREENCHER
				    System.out.println("\ta) Africano\tb) Ásia\tc) Europeu\td) Nenhuma das Alternativas"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: b) Ásia\td) Nenhuma das Alternativas"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}	   
		   }
		   
			if(q == 3) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Quantos ossos tem o corpo humano?"); // PREENCHER
			   System.out.println("a) 106\tb) 206\tc) 306\td) 406"); // PREENCHER
			   valor = 10.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'b'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta 
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: 406 ossos é um exagero para a humanidade..."); // PREENCHER
				    System.out.println("\ta) 106\tb) 206\tc) 306\tx) xxx"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: b) 206\tc) 306"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}	   
		   }
		   
			if(q == 4) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Quantas letras há no alfabeto?"); // PREENCHER
			   System.out.println("a) 26\tb) 27\tc) 28\td) 30"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'a'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta 
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: As vezes... Contar pode ajudar!"); // PREENCHER
				    System.out.println("\ta) 26\tb) 27\tc) 28\td) 30"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: a)26 \tc) 27"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}	   
		   }
		 
		   
			if(q == 5) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Quem inventou a lâmpada?"); // PREENCHER
			   System.out.println("a) Albert Eistein\tb) Thomas Edison\tc) Tom Cruise\td) Willian Shakespare"); // PREENCHER
			   valor = 10.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'b'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta	s
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Eistein foi inteligente, porém Edison foi brilhante..."); // PREENCHER
					System.out.println("\ta) Albert Eistein\tb) Thomas Edison\tc) Tom Cruise\td) Willian Shakespare"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: a) Albert Eistein\tb) Thomas Edison"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}	   
		   }
		   
			if(q == 6) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Quantas cores há no arco-íris?"); // PREENCHER
			   System.out.println("a) 10\tb) 3\tc) 5\td) 7"); // PREENCHER
			   valor = 3.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'd'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta	
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Pense... quantos dias tem 1 semana?"); // PREENCHER
				    System.out.println("\ta) 10\tb) 3\tc) 5\td) 7"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: c) 5\td) 7"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}
		   }
		   
			if(q == 7) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Quantos séculos, há um milénio?"); // PREENCHER
			   System.out.println("a)1000 \tb) 1\tc) 10\td) 100"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'c'; // PREENCHER			
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta	  
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: 1000 anos equivalem a 10 séculos e 10000, são o mesmo que 100"); // PREENCHER
				    System.out.println("\ta) 1000\tb) 1\tc) 10\td) 100"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: a) 1000\tc) 10"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}	   
		   }
		   
			if(q == 8) {//------------------------------------------------------------------------------------------------------------------
			   questão++;
			   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(questão+". Qual a matéria que estuda clima e tempo?"); // PREENCHER
			   System.out.println("a) Geografia\tb) Biologia\tc) Topologia\td) Matemática"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESSÁRIO
			   respostaUser = scan.next().charAt(0);
			   correta = 'a'; // PREENCHER
			   if(respostaUser == 'l' || respostaUser == 'L') {
					shop.menuLoja();
					x = scan.nextInt();
					if(x == 1) {
						elim = shop.lojaE(money, elim);
						money = money -50.00;
					}
					if(x == 2) {
						pista = shop.lojaP(money, pista);
						money = money -40.00;
					}
					if(x == 3) {
						chance = shop.lojaC(money, chance);
						money =  money -35.00;
					}	
					respostaUser = scan.next().charAt(0);
				}
			   					//condições de resposta   
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Topologia, estuda os mapas... Será mesmo?"); // PREENCHER
				    System.out.println("\ta) Geografia\tb) Biologia\tc) Topologia\td) Matemática"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: a) Geografia\tc) Topologia"); // PREENCHER
				}
			   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
			   if(respostaUser == '1') {
					if(elim > 0) {
						elim--;
					}
				}
				if(respostaUser == '2') {  
					if(pista > 0) {
						pista--;
					}
				}
				if(respostaUser == '3') {
					if(chance > 0) {
						chance--;
					}
				}
		   } 
			
			if(q == 9) {//------------------------------------------------------------------------------------------------------------------
				   questão++;
				   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
				   System.out.println(questão+". Como é chamado o espaço ou região que foi alterado pelo ser humano?"); // PREENCHER
				   System.out.println("a) Espaço geográfico\tb) Paisagem geográfica\tc) Espaço Atimosférico\td) Todas as Alternativas"); // PREENCHER
				   valor = 7.00; //ALTERAR SE NECESSÁRIO
				   respostaUser = scan.next().charAt(0);
				   correta = 'a'; // PREENCHER
				   if(respostaUser == 'l' || respostaUser == 'L') {
						shop.menuLoja();
						x = scan.nextInt();
						if(x == 1) {
							elim = shop.lojaE(money, elim);
							money = money -50.00;
						}
						if(x == 2) {
							pista = shop.lojaP(money, pista);
							money = money -40.00;
						}
						if(x == 3) {
							chance = shop.lojaC(money, chance);
							money =  money -35.00;
						}	
						respostaUser = scan.next().charAt(0);
					}
				   					//condições de resposta   
				   if(respostaUser == '2' && pista > 0) {
						System.out.println("   # PISTA: O meio em que vivemos, possue latitude e longitude, portanto isso são fatores do..."); // PREENCHER
					    System.out.println("\ta) Espaço geográfico\tb) Paisagem geográfica\tc) Espaço Atimosférico\td) Todas as Alternativas"); // PREENCHER
					}
					if(respostaUser == '3' && chance > 0) {
						System.out.println("\t# CHANCE: a) Espaço geográfico\tc) Espaço Atimosférico"); // PREENCHER
					}
				   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
				   if(respostaUser == '1') {
						if(elim > 0) {
							elim--;
						}
					}
					if(respostaUser == '2') {  
						if(pista > 0) {
							pista--;
						}
					}
					if(respostaUser == '3') {
						if(chance > 0) {
							chance--;
						}
					}
			   } 
		
		        if(q == 10) {//------------------------------------------------------------------------------------------------------------------
				   questão++;
				   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
				   System.out.println(questão+". Quem foi o primeiro presidente do Brasil?"); // PREENCHER
				   System.out.println("a) Campos Sales\tb) Floriano Peixoto\tc) Getúlio Vargas\td) Deodoro da Fonseca"); // PREENCHER
				   valor = 10.00; //ALTERAR SE NECESSÁRIO
				   respostaUser = scan.next().charAt(0);
				   correta = 'd'; // PREENCHER
				   if(respostaUser == 'l' || respostaUser == 'L') {
						shop.menuLoja();
						x = scan.nextInt();
						if(x == 1) {
							elim = shop.lojaE(money, elim);
							money = money -50.00;
						}
						if(x == 2) {
							pista = shop.lojaP(money, pista);
							money = money -40.00;
						}
						if(x == 3) {
							chance = shop.lojaC(money, chance);
							money =  money -35.00;
						}	
						respostaUser = scan.next().charAt(0);
					}
				   					//condições de resposta   
				   if(respostaUser == '2' && pista > 0) {
						System.out.println("   # PISTA: O primeiro presidente assumiu o poder em 15 de novembro de 1889"); // PREENCHER
					    System.out.println("\ta) Campos Sales\tb) Floriano Peixoto\tc) Getúlio Vargas\td) Deodoro da Fonseca"); // PREENCHER
					}
					if(respostaUser == '3' && chance > 0) {
						System.out.println("\t# CHANCE: a) Campos Sales\td) Deodoro da Fonseca"); // PREENCHER
					}
				   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
				   if(respostaUser == '1') {
						if(elim > 0) {
							elim--;
						}
					}
					if(respostaUser == '2') {  
						if(pista > 0) {
							pista--;
						}
					}
					if(respostaUser == '3') {
						if(chance > 0) {
							chance--;
						}
					}
			   } 
		        
		        if(q == 11) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Qual o maior Livro da Bíblia?"); // PREENCHER
					   System.out.println("a) Gênesis\tb) Rute\tc) Salmos\td) Coríntios"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: O Maior livro possui 150 Capítulos, e possue o capítulo mais famoso da bíblia..."); // PREENCHER
						    System.out.println("\ta) Gênesis\tb) Rute\tc) Salmos\td) Coríntios"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Rute\tc) Salmos"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 12) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Como morreu Judas Iscariotes?"); // PREENCHER
					   System.out.println("a) Suicídio\tb) Em combate\tc) Doença\td) Morte Natural"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'a'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Judas, foi aquele quem traiu Jesus."); // PREENCHER
						    System.out.println("\ta) Suicídio\tb) Em combate\tc) Doença\td) Morte Natural"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Suicídio\tb) Em combate"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		 
		        if(q == 13) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". O pai do padre é filho do meu pai. O que eu sou do Padre?"); // PREENCHER
					   System.out.println("a) Primo\tb) Avô\tc) Irmão\td) Tio"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'd'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Pai --> Eu (filho) < -- PAI -- > Filho (Padre)"); // PREENCHER
						    System.out.println("\ta) Primo\tb) Avô\tc) Irmão\td) Tio"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: c) Irmão\td) Tio"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 14) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". De quem é a famosa frase “Penso, logo existo”?"); // PREENCHER
					   System.out.println("a) Platão\tb) Galileu Galilei\tc) Descartes\td) Sócrates"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A única certeza é que duvido, e se duvido eu penso, e se penso logo existo - de: René"); // PREENCHER
						    System.out.println("\ta) Platão\tb) Galileu Galilei\tc) Descartes\td) Sócrates"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Galileu Galilei\tc) Descartes"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 15) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". De onde é a invenção do chuveiro elétrico?"); // PREENCHER
					   System.out.println("a) França\tb) Brasil\tc) Inglaterra\td) Estado Unidos"); // PREENCHER
					   valor = 8.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'b'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Lorenzetti, desenvolveu o chuveiro em 1955"); // PREENCHER
						    System.out.println("\ta) França\tb) Brasil\tc) Inglaterra\td) Estado Unidos"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Brasil\td) Estado Unidos"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
			
		        if(q == 16) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". O que a palavra legend significa em português?"); // PREENCHER
					   System.out.println("a) Legenda\tb) Conto\tc) Lenda\td) Legendário"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Terá que ler a Legenda para se tornar uma Lenda? Ou sabes a resposta para se tornar Legendário?"); // PREENCHER
						    System.out.println("\ta) Legenda\tb) Conto\tc) Lenda\td) Legendário"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Legenda\tc) Lenda"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 17) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Quanto tempo a luz do Sol demora para chegar à Terra?"); // PREENCHER
					   System.out.println("a) 12 minutos\tb) 1 dia\tc) 8 minutos\td) Segundos"); // PREENCHER
					   valor = 6.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A velocidade da luz no vácuo, simbolizada pela letra c, é, por definição, igual a 299 792 458 metros por segundo."); // PREENCHER
						    System.out.println("\ta) 12 minutos\tb) 1 dia\tc) 8 minutos\td) Segundos"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: c) 8 minutos\td) Segundos"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 18) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Qual a altura da rede de vôlei nos jogos masculino e feminino?"); // PREENCHER
					   System.out.println("a) 2,43 m e 2,24 m\tb) 2,5 m e 2,0 m\tc) 1,8 m e 1,5 m\td) 2,4 para ambos"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'a'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A altura média dos jogadores de vôlei é: 2,10 cm, 2,09 cm, 2,07 cm, portanto a rede deve ter aproximadamente..."); // PREENCHER
						    System.out.println("\ta) 2,43 m e 2,24 m\tb) 2,5 m e 2,0 m\tc) 1,8 m e 1,5 m\td) 2,4 para ambos"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) \tc) "); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 19) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Quem é o personagem folclórico que possui um gorro vermelho?"); // PREENCHER
					   System.out.println("a) Caipora\tb) Saci\tc) Lobisomem\td) Boitatá"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'b'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Ele tem uma perna só"); // PREENCHER
						    System.out.println("\ta) Caipora\tb) Saci\tc) Lobisomem\td) Boitatá"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Caipora\tb) Saci"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 20) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". ?"); // PREENCHER
					   System.out.println("a) Pico Paraná\tb) Pico da Bandeira\tc) Monte Roraima\td) Pico da Neblina"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'd'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Localizado no norte do Estado do Amazonas, na serra do Imeri, é o ponto mais alto do Brasil com 2995,30 metros de altitude."); // PREENCHER
						    System.out.println("\ta) Pico Paraná\tb) Pico da Bandeira\tc) Monte Roraima\td) Pico da Neblina"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Pico da Bandeira\td) Pico da Neblina"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 21) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". “It is six twenty ou twenty past six”. Que horas são em inglês?"); // PREENCHER
					   System.out.println("a) 12:06\tb) 6:20\tc) 2:20\td) 6:02"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'b'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: 'Twenty' em inglês significa vinte, portanto, qual a hora?"); // PREENCHER
						    System.out.println("\ta) 12:06\tb) 6:20\tc) 2:20\td) 6:02"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) 6:20\tc) 6:02"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 22) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Quem escreveu o livro O Principe?"); // PREENCHER
					   System.out.println("a) Maquiavel\tb) Montesquieu\tc) Rousseau\td) Thomas Hobbes"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'a'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: O Príncipe (em italiano, Il Principe) é um livro escrito por Nicolau em 1573"); // PREENCHER
						    System.out.println("\ta) Maquiavel\tb) Montesquieu\tc) Rousseau\td) Thomas Hobbes"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Maquiavel\tc) Rousseau"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 23) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Qual destes países é transcontinental?"); // PREENCHER
					   System.out.println("a) Japão\tb) Istambul\tc) Rússia\td) Filipinas"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Para um país ser considerado transcontinental, seu território deve estar localizado em mais de um continente"); // PREENCHER
						    System.out.println("\ta) Japão\tb) Istambul\tc) Rússia\td) Filipinas"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Istambul\tc) Rússia"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 24) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Na matemática, qual o correto a se fazer na operação 2 + 3 x 2?"); // PREENCHER
					   System.out.println("a) Somar primeiro\tb) Dividir primeiro\tc) Cortar o 2\td) Multiplicar primeiro"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'd'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Na operação matemática, o correto é multiplicar primeiro"); // PREENCHER
						    System.out.println("\ta) Somar primeiro\tb) Dividir primeiro\tc) Cortar o 2\td) Multiplicar primeiro"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Somar primeiro\td) Multiplicar primeiro"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 25) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Quantos lados possui um Cubo?"); // PREENCHER
					   System.out.println("a) 3\tb) 4\tc) 6\td) 8"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: um cubo possui lados, frente-verso e bases (cima-baixo)"); // PREENCHER
						    System.out.println("\ta) 3\tb) 4\tc) 6\td) 8"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) 3\tc) 6"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 26) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Quem dubla as vozes do Goku, Cake Boss e Bear Grylls?"); // PREENCHER
					   System.out.println("a) Wendel Bezerra\tb) Guilherme Briggs\tc) Afonso Solano\td) Garcia Junior"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'a'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: O dublador, também faz as vozes do Bob Esponja..."); // PREENCHER
						    System.out.println("\ta) Wendel Bezerra\tb) Guilherme Briggs\tc) Afonso Solano\td) Garcia Junior"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) \tc) "); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 27) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". A metade do dobro de uma dúzia é igual a:"); // PREENCHER
					   System.out.println("a) 6\tb) 24\tc) 8\td) 12"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'd'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: a metade do dobro é o mesmo que dizer 12x2"); // PREENCHER
						    System.out.println("\ta) 6\tb) 24\tc) 8\td) 12"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) 6\td) 12"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 28) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". O avião que ultrapassa a velocidade do som é?"); // PREENCHER
					   System.out.println("a) Ultrasônico\tb) Hipersônico\tc) Supersônico\td) Teco teco"); // PREENCHER
					   valor = 8.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'c'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Definitivamente não é um avião teco-teco"); // PREENCHER
						    System.out.println("\ta) Ultrasônico\\tb) Hipersônico\\tc) Supersônico\\tx) xxxx xxxx"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Ultrasônico\tc) Supersônico"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 29) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". Qual foi o Réptil pré-histórico mais feroz que existiu?"); // PREENCHER
					   System.out.println("a) Mamute\tb) Dinossauro Rex\tc) Tiranossauro Rex\td) Mastodonte"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'b'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A família REX foi muito temida na pré-história..."); // PREENCHER
						    System.out.println("\ta) Mamute\tb) Dinossauro Rex\tc) Tiranossauro Rex\td) Mastodonte"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Dinossauro Rex\tc) Tiranossauro Rex"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		        
		        if(q == 30) {//------------------------------------------------------------------------------------------------------------------
					   questão++;
					   System.out.println("==[1][ELIMINAÇÃO: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(questão+". As formigas, podem levantar pesos de até quantas vezes, referene a seu corpo?"); // PREENCHER
					   System.out.println("a) 100\tb) 10\tc) 50\td) nenhuma das alternativas"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESSÁRIO
					   respostaUser = scan.next().charAt(0);
					   correta = 'a'; // PREENCHER
					   if(respostaUser == 'l' || respostaUser == 'L') {
							shop.menuLoja();
							x = scan.nextInt();
							if(x == 1) {
								elim = shop.lojaE(money, elim);
								money = money -50.00;
							}
							if(x == 2) {
								pista = shop.lojaP(money, pista);
								money = money -40.00;
							}
							if(x == 3) {
								chance = shop.lojaC(money, chance);
								money =  money -35.00;
							}	
							respostaUser = scan.next().charAt(0);
						}
					   					//condições de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: As formigas, são capazes de levantar pesos muito maiores do que o seu próprio devido serem trabalhadoras"); // PREENCHER
						    System.out.println("\ta) 100\tb) 10\tc) 50\td) nenhuma das alternativas"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) 100\td) nenhuma das alternativas"); // PREENCHER
						}
					   money = logica.result(ativo, respostaUser, correta, money, valor, elim, pista, chance);
					   if(respostaUser == '1') {
							if(elim > 0) {
								elim--;
							}
						}
						if(respostaUser == '2') {  
							if(pista > 0) {
								pista--;
							}
						}
						if(respostaUser == '3') {
							if(chance > 0) {
								chance--;
							}
						}
				   } 
		}
		
		
		
		
		 if(ativo == 's' || ativo == 'S') {
				System.out.println("\n\n\t ----------------| DINHEIRO TOTAL DE "+ player.toUpperCase()+" FOI DE $"+money+"|----------------");
			} else {
				System.out.println("\n\n\t ----------------| "+player.toUpperCase()+", OS PONTOS HAVIAM SIDO DESATIVADOS! |----------------");
			}
		   
		   try {
				if(ativo == 's' || ativo == 'S') {
					System.out.println("                           SALVANDO INFORMAÇÕES NO RANKING...");
					Thread.sleep(3000);
				}
				Thread.sleep(3000);
				System.out.print("\nRetornando ao menu principal");
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(500);
				System.out.print(".");
				Thread.sleep(700);
				System.out.print(".");
				Thread.sleep(900);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(500);
				System.out.print("..");
				Thread.sleep(700);
				System.out.print("...");
				Thread.sleep(900);
				System.out.print("....");
				Thread.sleep(400);
				System.out.print(" Concluído!\n\n\n\n\n\n");
				Thread.sleep(400);
				RankingGame rankingGame = new RankingGame();
				rankingGame.setPlayer(player);
				int soma = (int) money;
				rankingGame.setPontuacao(soma);
				Menu(rankingGame.getPlayer(), rankingGame.getPontuacao());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		 }
	
	//Ranking do jogo
	private static void Ranking(String Player, int pontuacao) {
		
		List<Integer> maquinaPoints = new ArrayList<Integer>();
		List<String> maquinaName = new ArrayList<String>();
		//Sequencia de numeros
		for (int i = 1; i < 300; i++) { 
			maquinaPoints.add(i);			
		}
		
		maquinaName.add("Stringar");
		maquinaName.add("Healen");
		maquinaName.add("Hollywood");
		maquinaName.add("Husk");
		maquinaName.add("Loomen");
		maquinaName.add("Ehard");
		maquinaName.add("Polistation");
		maquinaName.add("Kimmnlanding");
		maquinaName.add("Ultron");
		maquinaName.add("Markus");
		
		//Embaralhamos os números:
		Collections.shuffle(maquinaPoints);
		Collections.shuffle(maquinaName);
		
		List<String> players = new ArrayList<>(20);
		List<Integer> pontos = new ArrayList<>(20);
		
		for (int i = 1; i < 5; i++) {
			maquinaPoints.get(i);
			players.add(maquinaName.get(i));
			pontos.add(maquinaPoints.get(i));		
		}
		
		players.add(Player);
		pontos.add(pontuacao);
		int count = 0;
	
		for (int i = 0; i < players.size(); i++) {
			count ++;	
			System.out.println(count+" --- JOGADOR: "+players.get(i));
			System.out.println("      PONTOS: "+pontos.get(i)+"\n");
			System.out.println("------------------------------------------");	
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n---------------------------------------------------");
		System.out.println("|   Pressione '1' para voltar ao Menu Principal   |");
		System.out.println("---------------------------------------------------");
		int x = scan.nextInt();
		Menu(players.get(0),pontos.get(0));		
		
	}
	
	//Sobre
	private static void Sobre(String Player, int pontuacao) {
		
		System.out.println("|------------------------------|");
		System.out.println("|           COMO JOGAR         |");
		System.out.println("|------------------------------|\n");
		
		System.out.println("### Modo de jogo ALEATÓRIO ###");
		System.out.println("Este basicamente define-se em responder 30 questões que são geradas aleatóriamente\nno sistema, conseguindo"
				+"pontos que somam 10 a cada vez que você acerta uma pergunta (Se você selecionou a opção que habilita os pontos)!");
		
		System.out.println("\n### Modo de jogo TUDO OU NADA ###");
		System.out.println("Este modo de jogo, consiste em levar o máximo de premios possíveis (Dinheiro). Quanto mais perguntas\nacertas"
				+ ", maiores as chances de conseguir mais dinheiro, e obviamente quanto mais você erra, mais dinheiro\nvocê perde!"
				+ " Porém, é possível contar com um número X de ajuda, para facilitar a vitória e comprar vantagens!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		System.out.println("\n|------------------------------------------------------------------------------|");
		System.out.println("| Aperte 1 para voltar ao Menu ou 2 para saber sobre o desenvolvimento do jogo!|");
		System.out.println("|------------------------------------------------------------------------------|");
		x = scan.nextInt();
		if(x == 1) {
			Menu(Player, pontuacao);
		}
		if(x == 2) {
			System.err.println("Atualmente o Jogo está em fase de desenvolvimento - Erros e bugs são comuns até então!\n\n");
			try {
				Thread.sleep(5000);
				Menu(Player, pontuacao);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	// Fim de Jogo
	private static void FimDeJogo() {
		System.out.println("\t   +-----------------+");
		System.err.println("\t---| JOGO ENCERRADO! |---");
		System.out.println("\t   +-----------------+");
		System.exit(0);
	}
}
