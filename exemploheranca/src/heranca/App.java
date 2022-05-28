package heranca;

public class App {

	public static void main(String[] args) {
		Contato_profissional c2 = new Contato_profissional();
		c2.cadastrar();
		c2.insercao();
		c2.exibir();
		c2.exibirprof();
		
		Contato c1 = new Contato();
		c1.cadastrar();
		c1.exibir(); 
	}

}
