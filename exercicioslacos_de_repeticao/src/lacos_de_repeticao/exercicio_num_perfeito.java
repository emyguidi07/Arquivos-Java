package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio_num_perfeito {

	public static void main(String[] args) {
		// cálculo de número perfeito
				int num;
				int soma=0;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite um número: ");
				num = sc.nextInt();
				
		        for (int div= 1; div < num; div++) {
		        	if (num % div == 0) {
		        		soma += div;
		        		}
		        	}
		        	if (soma == num) {
		        		System.out.println(num + " eh perfeito");
		        	}
		        	else System.out.println(num + " nao eh perfeito");{
		        	}
				}

	}


