package construtor;

public class App {

	public static void main(String[] args) {
	/*  tipo   nome  objeto  construtor
		Pessoa p1 = new Pessoa();
		System.out.println(p1.nome);
	 exemplo para retornar null */
		
		//construtor que exige os 3 par�metros
		Pessoa p1 = new Pessoa("Jo�o", 12, 45.5);
		// construtor que exige um par�metro
		Pessoa p2= new Pessoa("Jo�o");
	}

}
