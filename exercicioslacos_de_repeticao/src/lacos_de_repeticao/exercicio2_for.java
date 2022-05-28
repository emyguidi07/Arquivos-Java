package lacos_de_repeticao;

public class exercicio2_for {

	public static void main(String[] args) {
		// soma números ímpares
		int soma = 0;
		
        for(int i = 1; i<= 100; i++) {
        		soma += i;
        		i+=1;
        }
        System.out.print("A soma do números ímpares de 1 a 100 é: "+ soma);
      
	}

}
