package excalculadora;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame{
	private JLabel lbNome;
	private JLabel lbNum1;
	private JTextField txNum1;
	private JLabel lbNum2;
	private JTextField txNum2;
	private JButton btsoma;
	private JButton btdiv;
	private JButton btmulti;
	private JButton btsub;
	
	public Calculadora() {
		this.setSize(500,350);
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		
		
		Container c = getContentPane();
		c.setLayout(null);
		
		lbNome = new JLabel();
		lbNome.setText("Calculadora");
		lbNome.setBounds(5, 25, 100, 30);
		c.add(lbNome);
		
		lbNum1 = new JLabel();
		lbNum1.setText("Número 1:");
		lbNum1.setBounds(50, 75, 100, 30);
		c.add(lbNum1);
		
		txNum1 = new JTextField();
		txNum1.setBounds(110, 75, 200, 30);
		c.add(txNum1);
		
		lbNum2 = new JLabel();
		lbNum2.setText("Número 2:");
		lbNum2.setBounds(50, 120, 100, 30);
		c.add(lbNum2);
		
		txNum2 = new JTextField();
		txNum2.setBounds(110, 120, 200, 30);
		c.add(txNum2);
		
		btsoma = new JButton();
		btsoma.setBounds(50, 180, 55, 30);
		btsoma.setText("+");
		c.add(btsoma);
		
		btsoma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txNum1.getText());
				int n2 = Integer.parseInt(txNum2.getText());
				int soma = n1 + n2;
				JOptionPane.showMessageDialog(null, "Total da soma: " + soma);
			}
		});
		
		btsub = new JButton();
		btsub.setBounds(130, 180, 50, 27);
		btsub.setText("-");
		c.add(btsub);
		
		btsub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txNum1.getText());
				int n2 = Integer.parseInt(txNum2.getText());
				int sub = n1 - n2;
				JOptionPane.showMessageDialog(null, "Total da subtração: " + sub);
			}
		});
		
		btmulti = new JButton();
		btmulti.setBounds(210, 180, 55, 30);
		btmulti.setText("*");
		c.add(btmulti);
		
		btmulti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txNum1.getText());
				int n2 = Integer.parseInt(txNum2.getText());
				int multi = n1 * n2;
				JOptionPane.showMessageDialog(null, "Total da multiplicação: " + multi);
			}
		});
		
		btdiv = new JButton();
		btdiv.setBounds(290, 180, 50, 27);
		btdiv.setText("/");
		c.add(btdiv);
		
		btdiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txNum1.getText());
				int n2 = Integer.parseInt(txNum2.getText());
				int div = n1 / n2;
				JOptionPane.showMessageDialog(null, "Total da divisão: " + div);
			}
		});
		
		this.setVisible(true); 
	}
}
