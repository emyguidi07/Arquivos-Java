package lacos_de_repeticao;

public class exercicio3_while {

	public static void main(String[] args) {
		double chico = 1.50;
		double ze = 1.10;
		int a =0;
		while (chico>=ze) {
			chico= chico + 0.02;
			ze = ze + 0.03;
			a++;
		}
		System.out.println("A quantidade de anos para Zé ficar maior que Chico é de "+a+" anos");
	}

}
