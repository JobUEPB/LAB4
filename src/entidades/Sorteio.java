package entidades;

public class Sorteio {

	private Jogador jogadorA;
	private Jogador jogadorB;
	private Jogador jogadorC;
	private boolean capitao = true;
	
	public void zeroOuUm(Jogador jogA,Jogador jogB, Jogador jogC){
		int numJogA = jogA.getEscolha_zero_um();
		int numJogB = jogB.getEscolha_zero_um();
		int numJogC = jogC.getEscolha_zero_um();
		boolean jogo = true;
		
		while(jogo){
			if(numJogA == numJogB && numJogA == numJogC){
				System.out.println("Empate!! Joguem novamente");
				jogo =  true;					
			}else if(numJogA == numJogB){
				jogadorC.setCapitao(true);
				jogo = false;
			}else if(numJogC == numJogB){
				jogadorB.setCapitao(true);
				jogo = false;
			}
		}
	}
	
	public void escolhePar(Jogador jogA,Jogador jogB){
		jogA.setPar(true);
		jogB.setImpar(true);
	}
	
	public void parOuImpar(Jogador jogA,Jogador jogB){
		int numA = jogA.getEscolha_par_impar();
		int numB = jogB.getEscolha_par_impar();
		
		if(numA + numB % 2 == 0 ){
			
		}else{
			
		}
		
		
		
	}
}
