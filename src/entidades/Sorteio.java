package entidades;

import java.util.ArrayList;

public class Sorteio {
	
	public void zeroOuUm(ArrayList<Jogador> jogadores){
		int numJogA = jogadores.get(0).getEscolha_zero_um();
		int numJogB = jogadores.get(1).getEscolha_zero_um();
		int numJogC = jogadores.get(2).getEscolha_zero_um();
		
		while(true){
			if(numJogA == numJogB && numJogA == numJogC){
				System.out.println("Empate!! Joguem novamente");
				break;					
			}else if(numJogC == numJogB){
				jogadores.get(0).setCapitao(true);
				break;	
			}else if(numJogC == numJogA){
				jogadores.get(1).setCapitao(true);
				break;	
			}else if(numJogA == numJogB){
				jogadores.get(2).setCapitao(true);
				break;	
			}
		}
	}
	
	public String parOuImpar(int numA, int numB){
		int soma = numA + numB;
		if(soma % 2 == 0 ){
			return "PAR";
		}else{
			return "IMPAR";
		}
		
		
		
	}
}
