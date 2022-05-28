package encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String genero;
	private String cpf;
	private String email;
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setCPF(String cpf) {
		this.cpf=cpf;
	}
	public String getCPF() {
		return cpf;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
}
