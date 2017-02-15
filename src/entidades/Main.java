package entidades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Sorteio jogo = new Sorteio();
		jogo.cadastraJogadores();
		
		jogo.zerinhoOuUm();
		jogo.escolhaParOuImpar();
		jogo.ParOuImpar();
		jogo.ehCapitao();
		
//		Jogador jogador1 = new Jogador("Job");
//		Jogador jogador2 = new Jogador("Joao");
//		Jogador jogador3 = new Jogador("Pedra");
//		String CapitaoTimeA = "";
//		String CapitaoTimeB = "";
//		
//		Leitura lerDados = new Leitura();
//		Menu menu = new Menu();
//		Sorteio sorteio = new Sorteio();
//		
//		// lendo as escolhas dos jogadores para selecionar o primeiro capitao
//		menu.escolhendoCapitao(" A");
//		menu.zeroUm(jogador1);
//		lerDados.zeroUm(jogador1);
//		
//		menu.zeroUm(jogador2);
//		lerDados.zeroUm(jogador2);
//		
//		menu.zeroUm(jogador3);
//		lerDados.zeroUm(jogador3);
//		
//		CapitaoTimeA = sorteio.zeroOuUm(jogador1, jogador2, jogador3);
//		
//		menu.escolhendoCapitao(" B");
//		
//		menu.parImpar(jogador1);
//		lerDados.escolhaParImpar(jogador1);	
//		menu.numeroParImpar();
//		lerDados.numeroImparPar(jogador1);
//
//	
		
		
		
	}

}
