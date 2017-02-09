package entidades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Jogador jogador1 = new Jogador("Job");
		Jogador jogador2 = new Jogador("Joao");
		Jogador jogador3 = new Jogador("Pedra");
		
		Leitura lerDados = new Leitura();

		System.out.println("Escolhendo Capitão A " + System.lineSeparator());
		
		
		System.out.println(jogador1.getNome() + " escolha zero ou um: ");
		lerDados.zeroUm(jogador1);
		
		System.out.println(jogador1.getEscolha_zero_um());
		
		System.out.println(jogador1.getNome() + " par ou impar ");
		
		lerDados.imparPar(jogador1);
		
		System.out.println(jogador1.getEscolha_par_impar());
		
	}

}
