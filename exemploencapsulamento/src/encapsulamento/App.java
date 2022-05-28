package encapsulamento;

public class App {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Sueli Heredia Lima");
		p1.setIdade(68);
		p1.setGenero("Feminino");
		p1.setCPF("24882193809");
		p1.setEmail("sueli.lima@gamil.com");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Gênero: " + p1.getGenero());
		System.out.println("CPF: " + p1.getCPF());
		System.out.println("Email: " + p1.getEmail());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Rogério Luiz");
		p2.setIdade(50);
		p2.setGenero("Masculino");
		p2.setCPF("13456790123");
		p2.setEmail("ro.luiz2004@outlook.com");
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Idade: " + p2.getIdade());
		System.out.println("Gênero: " + p2.getGenero());
		System.out.println("CPF: " + p2.getCPF());
		System.out.println("Email: " + p2.getEmail());
	}


}
