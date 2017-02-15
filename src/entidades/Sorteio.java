package entidades;

import java.util.ArrayList;

public class Sorteio {

	Menu menu = new Menu();
	Leitura ler = new Leitura();
	private Jogador jogadorA;
	private Jogador jogadorB;
	private Jogador jogadorC;
	private boolean capitao = true;
	
	ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastraJogadores(){
		for (int i = 0; i < 3; i++) {
			menu.perguntaNome(i);
			String nome = ler.lerNome();
			Jogador jog = new Jogador(nome);
			jogadores.add(jog);
		}
	}
	
	public String zeroOuUm(Jogador jogA,Jogador jogB, Jogador jogC){
		int numJogA = jogA.getEscolha_zero_um();
		int numJogB = jogB.getEscolha_zero_um();
		int numJogC = jogC.getEscolha_zero_um();
		String capitao = "";
		

		return capitao;
	}

	public void escolhaParOuImpar(){
		for (Jogador jogador : jogadores) {
			if(!jogador.isCapitao()){
				menu.parImpar(jogador);
				ler.escolhaParImpar(jogador);
				break;
			}
		}
		//escolha par
		if(jogadores.get(0).isPar()){
			jogadores.get(1).setImpar(true);
			jogadores.get(2).setImpar(true);
		}else if(jogadores.get(1).isPar()){
			jogadores.get(0).setImpar(true);
			jogadores.get(2).setImpar(true);
		}else if(jogadores.get(0).isPar()){
			jogadores.get(1).setImpar(true);
			jogadores.get(0).setImpar(true);
		}
		//escolha impar
				if(jogadores.get(0).isImpar()){
					jogadores.get(1).setPar(true);
					jogadores.get(2).setPar(true);
				}else if(jogadores.get(1).isImpar()){
					jogadores.get(0).setPar(true);
					jogadores.get(2).setPar(true);
				}else if(jogadores.get(0).isImpar()){
					jogadores.get(1).setPar(true);
					jogadores.get(0).setPar(true);
				}
	}
	public void ParOuImpar(){
		String vencedor = "";
		int soma = 0;
		for (Jogador jogador : jogadores) {
			if(!jogador.isCapitao()){
				menu.numeroParImpar(jogador);
				soma += ler.numeroImparPar(jogador);
			}	
		}
		if(soma %2 == 0){
			vencedor = "par";
		}else{
			vencedor = "impar";
		}
		System.out.println("debug " + "soma = " + soma + " " + vencedor);
		for (Jogador jogador : jogadores) {
				if(vencedor.equals("par") && jogador.isPar()){
					jogador.setCapitao(true);
					System.out.println("par");
				}else if(vencedor.equals("impar") && jogador.isImpar()){
						jogador.setCapitao(true);
					    System.out.println("impar");
			}	
		}
	}
	
	public void zerinhoOuUm(){
		while(true){
			for (Jogador jogador : jogadores) {
				menu.zeroUm(jogador);
				ler.zeroUm(jogador);
			}
			int numJogA = jogadores.get(0).getEscolha_zero_um();
			int numJogB = jogadores.get(1).getEscolha_zero_um();
			int numJogC = jogadores.get(2).getEscolha_zero_um();
			
			if(numJogA == numJogB && numJogA == numJogC){
				System.out.println("Empate! Jogue novamente");				
			}else if(numJogA == numJogB){
				jogadores.get(2).setCapitao(true);
				break;
			}else if(numJogC == numJogA){
				jogadores.get(1).setCapitao(true);
				break;
			}else if(numJogC == numJogB){
				jogadores.get(0).setCapitao(true);
				break;
			}
		}

	}
	public void ehCapitao(){
		System.out.println("os capitães são: ");
		for (Jogador jogador : jogadores) {
			if(jogador.isCapitao()){
				System.out.println(jogador.getNome());
			}
		}
	}
		
}
