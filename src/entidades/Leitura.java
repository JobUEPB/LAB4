package entidades;

import java.util.Scanner;

public class Leitura {

	private Scanner scan = new Scanner(System.in);
	
	Menu texto = new Menu();

	public int zeroUm(Jogador jogador) {

		jogador.setEscolha_zero_um(scan.nextInt());

		if (jogador.getEscolha_zero_um() != 0 && jogador.getEscolha_zero_um() != 1) {

			texto.erroZeroUm();
			
			zeroUm(jogador);
		}
		return 0;
	}
	
	
	public String escolhaParImpar(Jogador jogador){
		
		String parImpar = scan.next();
		
		if(parImpar.toLowerCase().equals("par"))
			jogador.setPar(true);
		else
			if(parImpar.toLowerCase().equals("impar"))
				jogador.setImpar(true);
			else
			{
				texto.erroEscolhaParImpar();
				this.escolhaParImpar(jogador);
			}
		return parImpar.toLowerCase();
	}
	
	public int numeroImparPar(Jogador jogador){
		jogador.setEscolha_par_impar(scan.nextInt());
		
		if(jogador.getEscolha_par_impar()>10 || jogador.getEscolha_par_impar() <0){
			texto.erroNumeroParImpar();
			numeroImparPar(jogador);
		}
		return jogador.getEscolha_par_impar();
	}
	public String lerNome(){
		return scan.nextLine();
	}

}
