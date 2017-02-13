package entidades;

public class Menu {
	
	private String zeroOuUm = " Escolha zero ou um: "; 
	private String parImpar = " Escolha par ou impar: ";
	public String getParImpar() {
		return parImpar;
	}

	public void setParImpar(String parImpar) {
		this.parImpar = parImpar;
	}

	private String msgNome = "digite o nome do Jogador ";

	public String escolhaZeroOuUm(Jogador jog){
		return jog.getNome() + this.zeroOuUm;
	}
	
	public String pedeNomeJogador(int num){
		return msgNome + num + ": ";
	}

	
}
