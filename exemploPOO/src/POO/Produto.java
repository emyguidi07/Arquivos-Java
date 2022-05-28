package POO;

import java.util.Scanner;

public class Produto {
	public int codigo;
	public String nome;
	public double valor;
	public int qtd;
	
//metodo ler dados
	public void lerDadosProduto(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto: ");
		codigo= sc.nextInt();
		System.out.println("Digite o nome do produto: ");
		nome = sc.next();
		System.out.println("Digite o valor do produto: ");
		valor = sc.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		qtd = sc.nextInt();
	}
//metodo exibir dados
	public void exibirDadosProduto() {
		System.out.println("Código: " + codigo + "\n Nome: " + nome + "\n Valor: " + valor + "\n Qtd: " + qtd);
	}
		
}

