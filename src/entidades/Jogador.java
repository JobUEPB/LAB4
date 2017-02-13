package entidades;

public class Jogador {
	
	private String nome;
	private int escolha_zero_um;
	private int escolha_par_impar;
	private boolean par = false;
	private boolean impar = false;
	private boolean capitao = false;
	private int time;
	
	
	
	public Jogador(String nome){
		
		this.nome = nome;
	}
	
	public boolean isPar() {
		return par;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEscolha_zero_um() {
		return escolha_zero_um;
	}
	public void setEscolha_zero_um(int escolha_zero_um) {
		this.escolha_zero_um = escolha_zero_um;
	}
	public int getEscolha_par_impar() {
		return escolha_par_impar;
	}
	public void setEscolha_par_impar(int escolha_par_impar) {
		this.escolha_par_impar = escolha_par_impar;
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
	public void setPar(boolean par) {
		this.par = par;
	}
	public boolean isImpar() {
		return impar;
	}

	public void setImpar(boolean impar) {
		this.impar = impar;
	}
	
	
	
	

}
