package entidades;

public class Menu {
	
	public void escolhendoCapitao(String letra){
		
		System.out.println(System.lineSeparator()
							+"Escolhendo capitão"
							+ letra
							+ System.lineSeparator());
	}
	
	public void perguntaNome(int n){
		System.out.println("Qual o nome do jogador" + n + " : ");
	}
	
	public void zeroUm(Jogador jogador){
		
		System.out.print(jogador.getNome() + " escolha zero ou um: ");
	}
	
	public void parImpar(Jogador jogador){
		
		System.out.print(jogador.getNome() + " escolha par ou impar: ");
	}
	
	public void numeroParImpar(Jogador jogador){
		
		System.out.print(jogador.getNome() + " Digite um numero: ");
	}
	
	public void erroZeroUm(){
		
		System.out.println("Escolha numero incorreto! " + System.lineSeparator() + "Apenas zero ou um"
				+ System.lineSeparator() + "Digite novamente: ");
	}
	
	public void erroEscolhaParImpar(){
		
		System.out.println("Escolha par ou impar incorreta! " + System.lineSeparator() + "Apenas par ou impar"
				+ System.lineSeparator() + "Digite novamente: ");
		
	}
	
	public void erroNumeroParImpar(){
		
		System.out.println("Escolha invalida! " + System.lineSeparator() + "Apenas numeros de 0 a 10"
				+ System.lineSeparator() + "Digite novamente: ");
		
	}
	
	
}
