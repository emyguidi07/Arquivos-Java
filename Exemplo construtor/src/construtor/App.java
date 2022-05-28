package construtor;

public class App {

	public static void main(String[] args) {
	/*  tipo   nome  objeto  construtor
		Pessoa p1 = new Pessoa();
		System.out.println(p1.nome);
	 exemplo para retornar null */
		
		//construtor que exige os 3 parâmetros
		Pessoa p1 = new Pessoa("João", 12, 45.5);
		// construtor que exige um parâmetro
		Pessoa p2= new Pessoa("João");
	}

}
