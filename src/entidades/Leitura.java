package entidades;

import java.util.Scanner;

public class Leitura {

	private Scanner scan = new Scanner(System.in);

	public int zeroUm(Jogador jogador) {

		jogador.setEscolha_zero_um(scan.nextInt());

		if (jogador.getEscolha_zero_um() != 0 && jogador.getEscolha_zero_um() != 1) {
			System.out.println("Escolha numero incorreto! " + System.lineSeparator() + "Apenas zero ou um"
					+ System.lineSeparator() + "Digite novamente: ");
			zeroUm(jogador);
		}
		return 0;
	}
	
	public int imparPar(Jogador jogador){
		
		jogador.setEscolha_par_impar(scan.nextInt());
		
		if(jogador.getEscolha_par_impar()>10 || jogador.getEscolha_par_impar() <0){
			System.out.println("Escolha invalida! " + System.lineSeparator() + "Apenas numeros de 0 a 10"
					+ System.lineSeparator() + "Digite novamente: ");
			
			imparPar(jogador);
		}
		
		
		return 0;
		
	}

}
