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
			System.out.print("\n\t    Conclu�do!\n\n\n\n\n");
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
		System.out.println("Deseja ativar as pontua��es? (S- SIM/ N- N�O):");
		ativo =  scan.next().charAt(0);
		System.out.println("\nBem-Vindo "+player.getNome().toUpperCase()+"! Escolha a categoria desejada:\n");
		System.out.println("       | 1. Aleat�rio         |");
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

		int quest�o = 0;
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
		//Embaralhamos os n�meros:
		Collections.shuffle(numeros);
		//Mostramos 6 aleat�rios
		for (int i = 0; i < 30; i++) {
		//   numeros.get(i);
		   q = numeros.get(i);
		   
             if(q == 1) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Na escala 1:100, 1 cent�metro no desenho representa quanto da medida real?");
     			System.out.println("a) 1 metro\nb) 10 metros");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q== 2) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Quantas estrelas existem no nosso Sistema Solar?");
     			System.out.println("a) Uma\nb) Mais de um bilh�o");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}	
     			
     		if(q == 3) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � a capital do Brasil?");
     			System.out.println("a) S�o Paulo\nb) Bras�lia\nc) Esp�rito Santo");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 4) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Fator clim�tico que varia conforme aproxima-se ou distancia-se da Linha do Equador?");
     			System.out.println("a) Altitude\nb) Latitude");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 5) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual personagem de s�rie de TV que grita: Gentalha, gentalha, gentalha?");
     			System.out.println("a) Chaves\nb) Kiko\nc) Chiquinha\nd) Dona Florinda");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}

     		if(q == 6) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual o continente de origem dos escravos trazidos para o Brasil no per�odo colonial?");
     			System.out.println("a) �frica\nb) �sia\nc) Ingl�s");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		if(q == 7) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Das op��es abaixo, qual n�o � um elemento clim�tico?");
     			System.out.println("a) Press�o Atmosf�rica\nb) Maritimidade\nc) Sol\nd) Chuva");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 8) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual feriado foi comemorado ontem (7/setembro)?");
     			System.out.println("a) Independ�ncia do Brasil\nb) Proclama��o da Rep�blica\nc) Dia das Crian�as\nd) Finados");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 9) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Em qual pa�s fica a Torre Eiffel?");
     			System.out.println("a) Paris\nb) Brasil\nc) Fran�a\nd) Estados Unidos");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 10) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual o nome dos sete an�es na Hist�ria da Cinderela?");
     			System.out.println("a) Um\nb) Sete\nc) Pequem\nd) Nenhuma das Alternativas");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}

     		if(q == 11) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � o terceiro planeta do nosso Sistema Solar a partir do Sol?");
     			System.out.println("a) Terra\nb) J�piter\nc) Saturno\nd) Marte");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 12) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � o maior planeta do nosso Sistema Solar?");
     			System.out.println("a) Saturno\nb) Plut�o\nc) J�piter\nd) Netuno");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 13) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Clima que n�o encontramos em nosso pa�s?");
     			System.out.println("a) Equatorial\nb) Cerrado\nc) Polar");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 14) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Quem � o grande vil�o na hist�ria de Peter Pan?");
     			System.out.println("a) Dougras Plack\nb) Jack Sparrow\nc) Capit�o Gancho\nd) Venom");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 15) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". No filme 'Os Vingadores', quem Hulk chama de deus fracote?");
     			System.out.println("a) Thor\nb) Odin\nc) Floki\nd) Loki");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 16) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � o maior ser vivo da Terra?");
     			System.out.println("a) Um mam�fero\nb) Um fungo\nc) Elefante\nd) Baleia");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 17) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � o maior animal da Terra?");
     			System.out.println("a) Elefante\nb) Rinoceronte\nc) Baleia Azul\nd) Lula");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 18) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual o desenho animado que tem as esferas do drag�o?");
     			System.out.println("a) Dragon ball\nb) Digimon\nc) Super Ball");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 19) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � a moeda oficial do M�xico?");
     			System.out.println("a)Peso Mexicano\nb) D�lar Mexicano");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 20) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual a capital do M�xico?");
     			System.out.println("a) Londres\nb) Cuiaba\nc) Cidade Del Rey\nd) Cidade do M�xico");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 21) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual o verdadeiro nome do Super Homem aqui na Terra?");
     			System.out.println("a) Peter Parker\nb) Bruce Wayne\nc) Clark Kent");
     			resposta = scan.next().charAt(0);
     			correta = 'c';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 22) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Um ano bissexto tem quantos dias?");
     			System.out.println("a) 365\nb) 366\nc) 367");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 23) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual personagem � autor da frase �N�o contavam com minha ast�cia!�?");
     			System.out.println("a) Chaves\nb) Chapolim Colorado\nc) Doutor Raimundo");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 24) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual � o jogo online mais jogado no mundo atualmente?");
     			System.out.println("a) League of Legends\nb) Battlefield\nc) Minecraft\nd) Candy Crush");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 25) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual m�s do ano tem 28 dias?");
     			System.out.println("a) Todos \nb) Fevereiro \nc) Outubro");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 26) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual o valor de PI?");
     			System.out.println("a) 3,14\nb) 13,14\nc) 2,14\nd) 12,14");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 27) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Qual a cor do cavalo Branco de Napole�o?");
     			System.out.println("a) Verde\nb) Marrom\nc) Branco\nd) Preto");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 28) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Segundo a B�blia, quem foi o personagem mais forte?");
     			System.out.println("a) Sans�o\nb) Davi\nc) Mois�s");
     			resposta = scan.next().charAt(0);
     			correta = 'a';
     			soma = logica.result(correta, resposta, soma, ativo);	
     		}
     		
     		if(q == 29) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". No Brasil, a cada quantos anos um presidente pode ficar no poder?");
     			System.out.println("a) 5 anos\nb) 4 anos\nc) 3 anos\nd) Nenhuma das Alternativas");
     			resposta = scan.next().charAt(0);
     			correta = 'b';
     			soma = logica.result(correta, resposta, soma, ativo);
     		}
     		
     		if(q == 30) {
     			quest�o++;
     			System.out.println("=========================================================================================| PONTUA��O: "+soma+" |=========");
     			System.out.println(quest�o+". Quem foi o personagem respons�vel por abrir o mar vermelho segundo a b�blia?");
     			System.out.println("a) Abra�o\nb) Davi\nc) Jac�\nd) Mois�s");
     			resposta = scan.next().charAt(0);
     			correta = 'd';
     			soma = logica.result(correta, resposta, soma, ativo);
     		} 		
        }
	
		if(ativo == 's' || ativo == 'S') {
			System.out.println("\n\n\t ----------------| PONTUA��O FINAL DE "+ player.toUpperCase()+" FOI DE "+soma+" PONTOS |----------------");
		} else {
			System.out.println("\n\n\t ----------------| "+player.toUpperCase()+", OS PONTOS HAVIAM SIDO DESATIVADOS! |----------------");
		}
		
		try {
			if(ativo == 's' || ativo == 'S') {
				System.out.println("                             SALVANDO INFORMA��ES NO RANKING...");
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
			System.out.print(" Conclu�do!\n\n\n\n\n\n");
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
		
		int quest�o = 0, x = 0, q = 0;
		double money= 0.00, valor = 0.00;
		int elim = 1; // Elimina a quest�o (nao ganha pontos)
		int pista = 3; // oferece uma pista das alternativas
		int chance = 2; // tira 2 itens das alternativas
		char respostaUser, correta;
		List<Integer> numeros = new ArrayList<Integer>();
		//Sequencia de numeros

		for (int i = 1; i < 31; i++) { 
		    numeros.add(i);
		}
		//Embaralhamos os n�meros:
		Collections.shuffle(numeros);
		//Mostramos 6 aleat�rios
		for (int i = 1; i < 30; i++) {
		//   numeros.get(i);
			q = numeros.get(i);	
			
			//Quest�es
			if(q == 1) {//------------------------------------------------------------------------------------------------------------------
				quest�o++;
				System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
				System.out.println(quest�o+". Qual a pron�ncia correta da palavra?"); // PREENCHER
				System.out.println("a)Iorgute\tb)Iogute\tc)Iorgurte\td)Iogurte"); // PREENCHER
				valor = 5.00; //ALTERAR SE NECESS�RIO
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
				   					//condi��es de resposta   
				if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Definitivamente Iogute est� errado?"); // PREENCHER
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Qual o n�mero de estados da Regi�o Sudeste do Brasil?"); // PREENCHER
			   System.out.println("a) 2\tb) 3\tc) 4\td) 5"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta	
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Qual � o maior continente do mundo?"); // PREENCHER
			   System.out.println("a) Africano\tb) �sia\tc) Europeu\td) Nenhuma das Alternativas"); // PREENCHER
			   valor = 10.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta	
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Seria talvez o Continente que comece com 'A'"); // PREENCHER
				    System.out.println("\ta) Africano\tb) �sia\tc) Europeu\td) Nenhuma das Alternativas"); // PREENCHER
				}
				if(respostaUser == '3' && chance > 0) {
					System.out.println("\t# CHANCE: b) �sia\td) Nenhuma das Alternativas"); // PREENCHER
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Quantos ossos tem o corpo humano?"); // PREENCHER
			   System.out.println("a) 106\tb) 206\tc) 306\td) 406"); // PREENCHER
			   valor = 10.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta 
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: 406 ossos � um exagero para a humanidade..."); // PREENCHER
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Quantas letras h� no alfabeto?"); // PREENCHER
			   System.out.println("a) 26\tb) 27\tc) 28\td) 30"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta 
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Quem inventou a l�mpada?"); // PREENCHER
			   System.out.println("a) Albert Eistein\tb) Thomas Edison\tc) Tom Cruise\td) Willian Shakespare"); // PREENCHER
			   valor = 10.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta	s
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Eistein foi inteligente, por�m Edison foi brilhante..."); // PREENCHER
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Quantas cores h� no arco-�ris?"); // PREENCHER
			   System.out.println("a) 10\tb) 3\tc) 5\td) 7"); // PREENCHER
			   valor = 3.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta	
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Quantos s�culos, h� um mil�nio?"); // PREENCHER
			   System.out.println("a)1000 \tb) 1\tc) 10\td) 100"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta	  
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: 1000 anos equivalem a 10 s�culos e 10000, s�o o mesmo que 100"); // PREENCHER
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
			   quest�o++;
			   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
			   System.out.println(quest�o+". Qual a mat�ria que estuda clima e tempo?"); // PREENCHER
			   System.out.println("a) Geografia\tb) Biologia\tc) Topologia\td) Matem�tica"); // PREENCHER
			   valor = 5.00; //ALTERAR SE NECESS�RIO
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
			   					//condi��es de resposta   
			   if(respostaUser == '2' && pista > 0) {
					System.out.println("   # PISTA: Topologia, estuda os mapas... Ser� mesmo?"); // PREENCHER
				    System.out.println("\ta) Geografia\tb) Biologia\tc) Topologia\td) Matem�tica"); // PREENCHER
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
				   quest�o++;
				   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
				   System.out.println(quest�o+". Como � chamado o espa�o ou regi�o que foi alterado pelo ser humano?"); // PREENCHER
				   System.out.println("a) Espa�o geogr�fico\tb) Paisagem geogr�fica\tc) Espa�o Atimosf�rico\td) Todas as Alternativas"); // PREENCHER
				   valor = 7.00; //ALTERAR SE NECESS�RIO
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
				   					//condi��es de resposta   
				   if(respostaUser == '2' && pista > 0) {
						System.out.println("   # PISTA: O meio em que vivemos, possue latitude e longitude, portanto isso s�o fatores do..."); // PREENCHER
					    System.out.println("\ta) Espa�o geogr�fico\tb) Paisagem geogr�fica\tc) Espa�o Atimosf�rico\td) Todas as Alternativas"); // PREENCHER
					}
					if(respostaUser == '3' && chance > 0) {
						System.out.println("\t# CHANCE: a) Espa�o geogr�fico\tc) Espa�o Atimosf�rico"); // PREENCHER
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
				   quest�o++;
				   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
				   System.out.println(quest�o+". Quem foi o primeiro presidente do Brasil?"); // PREENCHER
				   System.out.println("a) Campos Sales\tb) Floriano Peixoto\tc) Get�lio Vargas\td) Deodoro da Fonseca"); // PREENCHER
				   valor = 10.00; //ALTERAR SE NECESS�RIO
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
				   					//condi��es de resposta   
				   if(respostaUser == '2' && pista > 0) {
						System.out.println("   # PISTA: O primeiro presidente assumiu o poder em 15 de novembro de 1889"); // PREENCHER
					    System.out.println("\ta) Campos Sales\tb) Floriano Peixoto\tc) Get�lio Vargas\td) Deodoro da Fonseca"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Qual o maior Livro da B�blia?"); // PREENCHER
					   System.out.println("a) G�nesis\tb) Rute\tc) Salmos\td) Cor�ntios"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: O Maior livro possui 150 Cap�tulos, e possue o cap�tulo mais famoso da b�blia..."); // PREENCHER
						    System.out.println("\ta) G�nesis\tb) Rute\tc) Salmos\td) Cor�ntios"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Como morreu Judas Iscariotes?"); // PREENCHER
					   System.out.println("a) Suic�dio\tb) Em combate\tc) Doen�a\td) Morte Natural"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Judas, foi aquele quem traiu Jesus."); // PREENCHER
						    System.out.println("\ta) Suic�dio\tb) Em combate\tc) Doen�a\td) Morte Natural"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Suic�dio\tb) Em combate"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". O pai do padre � filho do meu pai. O que eu sou do Padre?"); // PREENCHER
					   System.out.println("a) Primo\tb) Av�\tc) Irm�o\td) Tio"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Pai --> Eu (filho) < -- PAI -- > Filho (Padre)"); // PREENCHER
						    System.out.println("\ta) Primo\tb) Av�\tc) Irm�o\td) Tio"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: c) Irm�o\td) Tio"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". De quem � a famosa frase �Penso, logo existo�?"); // PREENCHER
					   System.out.println("a) Plat�o\tb) Galileu Galilei\tc) Descartes\td) S�crates"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A �nica certeza � que duvido, e se duvido eu penso, e se penso logo existo - de: Ren�"); // PREENCHER
						    System.out.println("\ta) Plat�o\tb) Galileu Galilei\tc) Descartes\td) S�crates"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". De onde � a inven��o do chuveiro el�trico?"); // PREENCHER
					   System.out.println("a) Fran�a\tb) Brasil\tc) Inglaterra\td) Estado Unidos"); // PREENCHER
					   valor = 8.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Lorenzetti, desenvolveu o chuveiro em 1955"); // PREENCHER
						    System.out.println("\ta) Fran�a\tb) Brasil\tc) Inglaterra\td) Estado Unidos"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". O que a palavra legend significa em portugu�s?"); // PREENCHER
					   System.out.println("a) Legenda\tb) Conto\tc) Lenda\td) Legend�rio"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Ter� que ler a Legenda para se tornar uma Lenda? Ou sabes a resposta para se tornar Legend�rio?"); // PREENCHER
						    System.out.println("\ta) Legenda\tb) Conto\tc) Lenda\td) Legend�rio"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Quanto tempo a luz do Sol demora para chegar � Terra?"); // PREENCHER
					   System.out.println("a) 12 minutos\tb) 1 dia\tc) 8 minutos\td) Segundos"); // PREENCHER
					   valor = 6.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A velocidade da luz no v�cuo, simbolizada pela letra c, �, por defini��o, igual a 299 792 458 metros por segundo."); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Qual a altura da rede de v�lei nos jogos masculino e feminino?"); // PREENCHER
					   System.out.println("a) 2,43 m e 2,24 m\tb) 2,5 m e 2,0 m\tc) 1,8 m e 1,5 m\td) 2,4 para ambos"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A altura m�dia dos jogadores de v�lei �: 2,10 cm, 2,09 cm, 2,07 cm, portanto a rede deve ter aproximadamente..."); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Quem � o personagem folcl�rico que possui um gorro vermelho?"); // PREENCHER
					   System.out.println("a) Caipora\tb) Saci\tc) Lobisomem\td) Boitat�"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Ele tem uma perna s�"); // PREENCHER
						    System.out.println("\ta) Caipora\tb) Saci\tc) Lobisomem\td) Boitat�"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". ?"); // PREENCHER
					   System.out.println("a) Pico Paran�\tb) Pico da Bandeira\tc) Monte Roraima\td) Pico da Neblina"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Localizado no norte do Estado do Amazonas, na serra do Imeri, � o ponto mais alto do Brasil com 2995,30 metros de altitude."); // PREENCHER
						    System.out.println("\ta) Pico Paran�\tb) Pico da Bandeira\tc) Monte Roraima\td) Pico da Neblina"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". �It is six twenty ou twenty past six�. Que horas s�o em ingl�s?"); // PREENCHER
					   System.out.println("a) 12:06\tb) 6:20\tc) 2:20\td) 6:02"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: 'Twenty' em ingl�s significa vinte, portanto, qual a hora?"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Quem escreveu o livro O Principe?"); // PREENCHER
					   System.out.println("a) Maquiavel\tb) Montesquieu\tc) Rousseau\td) Thomas Hobbes"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: O Pr�ncipe (em italiano, Il Principe) � um livro escrito por Nicolau em 1573"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Qual destes pa�ses � transcontinental?"); // PREENCHER
					   System.out.println("a) Jap�o\tb) Istambul\tc) R�ssia\td) Filipinas"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Para um pa�s ser considerado transcontinental, seu territ�rio deve estar localizado em mais de um continente"); // PREENCHER
						    System.out.println("\ta) Jap�o\tb) Istambul\tc) R�ssia\td) Filipinas"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: b) Istambul\tc) R�ssia"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Na matem�tica, qual o correto a se fazer na opera��o 2 + 3 x 2?"); // PREENCHER
					   System.out.println("a) Somar primeiro\tb) Dividir primeiro\tc) Cortar o 2\td) Multiplicar primeiro"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Na opera��o matem�tica, o correto � multiplicar primeiro"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Quantos lados possui um Cubo?"); // PREENCHER
					   System.out.println("a) 3\tb) 4\tc) 6\td) 8"); // PREENCHER
					   valor = 3.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Quem dubla as vozes do Goku, Cake Boss e Bear Grylls?"); // PREENCHER
					   System.out.println("a) Wendel Bezerra\tb) Guilherme Briggs\tc) Afonso Solano\td) Garcia Junior"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: O dublador, tamb�m faz as vozes do Bob Esponja..."); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". A metade do dobro de uma d�zia � igual a:"); // PREENCHER
					   System.out.println("a) 6\tb) 24\tc) 8\td) 12"); // PREENCHER
					   valor = 10.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: a metade do dobro � o mesmo que dizer 12x2"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". O avi�o que ultrapassa a velocidade do som �?"); // PREENCHER
					   System.out.println("a) Ultras�nico\tb) Hipers�nico\tc) Supers�nico\td) Teco teco"); // PREENCHER
					   valor = 8.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: Definitivamente n�o � um avi�o teco-teco"); // PREENCHER
						    System.out.println("\ta) Ultras�nico\\tb) Hipers�nico\\tc) Supers�nico\\tx) xxxx xxxx"); // PREENCHER
						}
						if(respostaUser == '3' && chance > 0) {
							System.out.println("\t# CHANCE: a) Ultras�nico\tc) Supers�nico"); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". Qual foi o R�ptil pr�-hist�rico mais feroz que existiu?"); // PREENCHER
					   System.out.println("a) Mamute\tb) Dinossauro Rex\tc) Tiranossauro Rex\td) Mastodonte"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: A fam�lia REX foi muito temida na pr�-hist�ria..."); // PREENCHER
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
					   quest�o++;
					   System.out.println("==[1][ELIMINA��O: "+elim+"]=[2][PISTAS: "+pista+"]=[3][CHANCE: "+chance+"]===============[LOJA: pressione L]===============[$: "+money+"]===\n");
					   System.out.println(quest�o+". As formigas, podem levantar pesos de at� quantas vezes, referene a seu corpo?"); // PREENCHER
					   System.out.println("a) 100\tb) 10\tc) 50\td) nenhuma das alternativas"); // PREENCHER
					   valor = 5.00; //ALTERAR SE NECESS�RIO
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
					   					//condi��es de resposta   
					   if(respostaUser == '2' && pista > 0) {
							System.out.println("   # PISTA: As formigas, s�o capazes de levantar pesos muito maiores do que o seu pr�prio devido serem trabalhadoras"); // PREENCHER
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
					System.out.println("                           SALVANDO INFORMA��ES NO RANKING...");
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
				System.out.print(" Conclu�do!\n\n\n\n\n\n");
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
		
		//Embaralhamos os n�meros:
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
		
		System.out.println("### Modo de jogo ALEAT�RIO ###");
		System.out.println("Este basicamente define-se em responder 30 quest�es que s�o geradas aleat�riamente\nno sistema, conseguindo"
				+"pontos que somam 10 a cada vez que voc� acerta uma pergunta (Se voc� selecionou a op��o que habilita os pontos)!");
		
		System.out.println("\n### Modo de jogo TUDO OU NADA ###");
		System.out.println("Este modo de jogo, consiste em levar o m�ximo de premios poss�veis (Dinheiro). Quanto mais perguntas\nacertas"
				+ ", maiores as chances de conseguir mais dinheiro, e obviamente quanto mais voc� erra, mais dinheiro\nvoc� perde!"
				+ " Por�m, � poss�vel contar com um n�mero X de ajuda, para facilitar a vit�ria e comprar vantagens!");
		
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
			System.err.println("Atualmente o Jogo est� em fase de desenvolvimento - Erros e bugs s�o comuns at� ent�o!\n\n");
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
