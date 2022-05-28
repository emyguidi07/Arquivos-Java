package polimorfismo;

import java.util.Scanner;

public class Cozinheiro {
	private String nome; 
	protected String prato;
	private String cpf;
	private String sobrenome;
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrato() {
		return prato;
	}
	public void setPrato(String prato) {
		this.prato = prato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void cadastro() {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSobrenome(sobrenome);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Digite seu sobrenome: " );
		sobrenome = sc.next();
		System.out.println("Digite seu cpf: " );
		cpf = sc.next();
	}
	public void exibir() {
		System.out.println("Nome: "+ getNome() + "\n Sobrenome: "+ getSobrenome() + "\n CPF:" + getCpf());
	}
	public String tipodePrato() {
		return prato = "Prato simples: Combos de feijoada, filé mignon e ffilé de frango";
	}
}
