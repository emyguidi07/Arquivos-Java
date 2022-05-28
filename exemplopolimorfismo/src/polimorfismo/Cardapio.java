package polimorfismo;

public class Cardapio {
	private String Cardapio = " ";
	public void registrar(Cozinheiro cozinheiro) {
		this.Cardapio += cozinheiro.tipodePrato() + "  ";
	}
	public String getTotalPratos(){
		return this.Cardapio;
	}
}
