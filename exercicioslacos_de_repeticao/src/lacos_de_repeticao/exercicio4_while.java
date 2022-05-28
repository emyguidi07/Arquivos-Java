package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio4_while {

	public static void main(String[] args) {
	int num = 1;
	int cont = 0;
	int soma= 0;
	
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Digite um valor: ");
		num = sc.nextInt();
		if(num>=0) {
		soma += num;
		cont++;
		}
	}while(num>=0);
	System.out.println("A média dos números é: "+ soma/cont);
}
}
