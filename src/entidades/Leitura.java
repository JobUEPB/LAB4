package entidades;

import java.util.Scanner;

public class Leitura {

	private Scanner scan = new Scanner(System.in);

	public void zeroUm(Jogador jogador) {
		jogador.setEscolhaZeroUm(scan.nextInt());
		if (jogador.getEscolha_zero_um() != 0 && jogador.getEscolha_zero_um() != 1) {
			System.out.println("Escolha incorreta! "
								+ System.lineSeparator()
								+ "Apenas zero ou um"
								+ System.lineSeparator()
								+ "Digite novamente: ");
			zeroUm(jogador);
		}
	}
	
	public int imparPar(Jogador jogador){
		int num = (scan.nextInt());
		if(num>10 || num <0){
			System.out.println("Escolha invalida! "
								+ System.lineSeparator() + "Apenas numeros de 0 a 10"
								+ System.lineSeparator() + "Digite novamente: ");
		}	
		return num;
	}
	
	public String lerNome(){
		String nome = null;
		while(scan.hasNext()){
			if(scan.hasNextLine()){
				nome = scan.nextLine();
				return nome;
			}else{
				nome = scan.next();
			}
		}
		return nome;
	}
	
	public String lerEscolhaParImpar(){
		String nome = null;
		while(scan.hasNext()){
			if(scan.hasNextLine()){
				nome = scan.nextLine();
				if(nome.toUpperCase().equals("PAR") || nome.toUpperCase().equals("IMPAR"))
					return nome;
			}else{
				nome = scan.next();
			}
		}
		return nome;
	}

}
