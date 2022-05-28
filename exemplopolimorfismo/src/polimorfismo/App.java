package polimorfismo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Cardapio pratos = new Cardapio();
		ChefeCozinha cozinheiro1 = new ChefeCozinha();
		cozinheiro1.cadastro();
		cozinheiro1.setPrato("Premium");
		pratos.registrar(cozinheiro1);
		cozinheiro1.exibir();
		System.out.println("Pratos: " + cozinheiro1.tipodePrato());
		
		Cozinheiro cozinheiro2 = new Cozinheiro();
		cozinheiro2.cadastro();
		cozinheiro2.setPrato("Simples");
		pratos.registrar(cozinheiro1);
		cozinheiro2.exibir();
		System.out.println("Pratos : " + cozinheiro2.tipodePrato());
		
		System.out.println("Cardápio: " + pratos.getTotalPratos());
	}

}
