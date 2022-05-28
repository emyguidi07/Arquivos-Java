package cadastrojogo;

import java.awt.Color;

public class App_jogo {

	public static void main(String[] args) {
		Menu frm = new Menu();		
		frm.setSize(800,600);
	    frm.setVisible(true);
	    frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	    frm.getContentPane().setBackground(Color.white);
	}

}
