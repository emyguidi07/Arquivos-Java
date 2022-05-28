package lacos_de_repeticao;

public class exercicio1_for {

	public static void main(String[] args) {
		// exibir soma de 100 números
		int soma = 0;
		
        for(int i = 1; i<= 100; i++) {
            soma += i;
        }
        System.out.print("A soma dos 100 números é: "+ soma);
	}
}
