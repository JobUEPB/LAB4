package entidades;

public class Jogador {
	
	private String nome;
	private int escolhaZeroUm;
	private String escolhaParImpar;
	private boolean capitao = false;
	private int time;

	public Jogador(String nome){
		
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEscolha_zero_um() {
		return escolhaZeroUm;
	}
	public void setEscolhaZeroUm(int escolha_zero_um) {
		this.escolhaZeroUm = escolha_zero_um;
	}
	public String getEscolhaParImpar() {
		return escolhaParImpar;
	}
	public void setEscolhaParImpar(String escolhaParImpar) {
		this.escolhaParImpar = escolhaParImpar;
	}
	public boolean isCapitao() {
		return capitao;
	}
	public void setCapitao(boolean capitao) {
		this.capitao = capitao;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

}
