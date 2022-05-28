package ExemploFormulário;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmPrincipal extends JFrame{
	private JLabel lbNome;
	private JTextField txNome;
	private JButton btexibir;
	
	public FrmPrincipal() {
		this.setSize(800,600);
		this.setTitle("Tela principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		
		this.setLayout(null);
		Container c = getContentPane();
		
		lbNome = new JLabel();
		lbNome.setText("Nome do aluno:");
		lbNome.setBounds(50, 100, 100, 30);
		c.add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(150, 100, 200, 30);
		c.add(txNome);
		
		btexibir = new JButton();
		btexibir.setBounds(400, 100, 150, 30);
		btexibir.setText("Exibir");
		c.add(btexibir);
		
		this.setVisible(true); // sempre deixar como última linha do construtor
	}
}
