package heranca;

import java.util.Scanner;

public class Contato_profissional extends Contato{
	private String empresa;
	private String email_profissional;
	private int telefone_empresa;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getEmail_profissional() {
		return email_profissional;
	}
	public void setEmail_profissional(String email_profissional) {
		this.email_profissional = email_profissional;
	}
	public int getTelefone_empresa() {
		return telefone_empresa;
	}
	public void setTelefone_empresa(int telefone_empresa) {
		this.telefone_empresa = telefone_empresa;
	}
	public void insercao() {
		this.setEmpresa(empresa);
		this.setEmail_profissional(email_profissional);
		this.setTelefone_empresa(telefone_empresa);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua empresa: ");
		empresa = sc.next();

		System.out.println("Digite seu email empresarial: " );
		email_profissional = sc.next();
		
		System.out.println("Digite seu telefone empresarial: " );
		telefone_empresa = sc.nextInt();
	}
	public void exibirprof() {
		System.out.println("Empresa: "+ getEmpresa() + "\n Email empresarial: " + getEmail_profissional() + "\n Telefone empresarial: " + getTelefone_empresa());
	}
	}

