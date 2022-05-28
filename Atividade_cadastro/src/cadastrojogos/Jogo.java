package cadastrojogos;

public class Jogo {
	public String nome;
	public String descricao;
	public float valor;
	public String local;
	static String[] itensmarca= {"Ubsoft","Sony","Sega", "Nintendo"};
	
	public static String[] getItensmarca() {
		return itensmarca;
	}
	public static void setItensmarca(String[] itensmarca) {
		Jogo.itensmarca = itensmarca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
}
