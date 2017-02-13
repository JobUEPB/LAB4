package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Scanner scan = new Scanner(System.in);
		Leitura lerDados = new Leitura();
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		Sorteio sort = new Sorteio();
		
		for (int i = 1; i <= 3; i++) {
			System.out.print(menu.pedeNomeJogador(i));
			String nome = lerDados.lerNome();
			Jogador jogador = new Jogador(nome);
			jogadores.add(jogador);
		}
		for (Jogador jogador : jogadores) {
			System.out.print(menu.escolhaZeroOuUm(jogador));
			lerDados.zeroUm(jogador);
		}
		sort.zeroOuUm(jogadores);
		
		for (Jogador jogador : jogadores) {
			if(!jogador.isCapitao()){
				System.out.print(menu.getParImpar());
				
				jogador.setEscolhaParImpar(lerDados.lerEscolhaParImpar());
				break;
			}
		}
	}

}
