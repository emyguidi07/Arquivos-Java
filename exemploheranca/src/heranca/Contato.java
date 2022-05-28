package heranca;

import java.util.Scanner;

public class Contato {
	private String nome;
	private String email;
	private int telefone;
	private int estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void cadastrar() {
		this.setNome(nome);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setEstado(estado);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();

		System.out.println("Digite seu email: " );
		email = sc.next();
		
		System.out.println("Digite seu telefone: " );
		telefone = sc.nextInt();
		
		System.out.println("Digite seu DDD: ");
		estado = sc.nextInt();
		
	}
	public void exibir() {
		System.out.println("Nome: " + getNome() + "\n Email: " + getEmail() + "\n Telefone: " + getTelefone() + "\n DDD Estado: " + getEstado());
	}
}
