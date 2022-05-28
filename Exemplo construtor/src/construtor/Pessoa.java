package construtor;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	
	//construtor padr�o retorna null
	public Pessoa() {
		
	}
	//construtor com um par�metro (n�o cria consultor padr�o pq n�o foi definido)
	public Pessoa(String nome) {
		this.nome = nome;
		System.out.println("Nome:" + nome);
	}
	//construtor com 3 par�metros (n�o cria consultor padr�o pq n�o foi definido)
	public Pessoa(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso= peso;
		System.out.println("Nome:" + nome+ "\n Idade:"+ idade + "\n Peso: "+ peso);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
