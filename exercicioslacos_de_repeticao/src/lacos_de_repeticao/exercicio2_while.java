package lacos_de_repeticao;

import java.util.Scanner;

public class exercicio2_while {

	public static void main(String[] args) {
		int pop =1;
		int f = 0;
		int tot_f = 0;
		int i = 1;
		int x = 1;
		float sal = 0;
		float tot_sal = 0;
		float maior_sal = 0;
		float perc_fi = 0;
		float perc_sal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de habitantes da cidade: ");
		pop = sc.nextInt();
		
		do {
			System.out.println("Digite o valor do seu sal�rio: ");
			sal = sc.nextInt();
			System.out.println("Digite a quantidade de filhos que voc� tem: ");
			f = sc.nextInt();
			//tot salario da pop
			 tot_sal += sal ;
			 // tot filhos da pop
		     tot_f += f;
		     i++;
		   //maior salario
				if(maior_sal <= sal){
		            maior_sal = sal;
		            }
		   //salario at� 100 reais
		        if(sal <= 100){
		          	perc_sal = (x * 100) / pop;
		          	x++;
		            }
			} while(i<=pop);
         
         System.out.println ("A media do salario da populacao � R$ "+ tot_sal/pop);
         System.out.println ("A media do numero dos filhos � "+ tot_f/pop);
         System.out.println ("O maior salario � R$ "+ maior_sal);
         System.out.println ("A porcentagem das pessoas com salarios ate R$ 100,00 � "+perc_sal);
	}
}
