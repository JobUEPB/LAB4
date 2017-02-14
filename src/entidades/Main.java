package entidades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Jogador jogador1 = new Jogador("Job");
		Jogador jogador2 = new Jogador("Joao");
		Jogador jogador3 = new Jogador("Pedra");
		
		Leitura lerDados = new Leitura();
		Menu menu = new Menu();
		
		menu.escolhendoCapitao("A");
		
		menu.zeroUm(jogador1);
		lerDados.zeroUm(jogador1);
		
		menu.zeroUm(jogador2);
		lerDados.zeroUm(jogador2);
		
		menu.zeroUm(jogador3);
		lerDados.zeroUm(jogador3);
		

		menu.escolhendoCapitao("B");
		
		menu.parImpar(jogador2);
		lerDados.escolhaParImpar(jogador1);	
//		menu.numeroParImpar();

	
		
		
		
	}

}
