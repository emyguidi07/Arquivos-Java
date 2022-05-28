package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio1_while {

	public static void main(String[] args) {
		int i =0;
		int neg=0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		while(i<5) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			i++;
			if (num < 0) {
				neg += 1;
			}
		}
		System.out.println("A quantidade de números negativos é de: " + neg);
	}

}
