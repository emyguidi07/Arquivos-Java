package cadastrojogo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Formjogo extends JDialog {
	JLabel titulo;
	JLabel Nome ;
	JLabel Desc;
	JLabel Valor;
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JTextField Nome1;
	JTextField Desc1;
	JTextField Valor1;
	JButton verificar;
	
public Formjogo() {
	setTitle("Dados principais do jogo");
    setSize(500,400);  
    setResizable(false);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.cyan);
	
	Container c = getContentPane();
	c.setLayout(null);
	
	titulo = new JLabel();
	titulo.setText("Preencha:");
	titulo.setBounds(50,35, 100, 30);
	add(titulo);
	
	Nome = new JLabel();
	Nome.setText("Produto:");
	Nome.setBounds(50, 75, 100, 30);
	add(Nome);
	
	Nome1 = new JTextField();
	Nome1.setBounds(110, 75, 200, 30);
	c.add(Nome1);
	
	Desc = new JLabel();
	Desc.setText("Descrição:");
	Desc.setBounds(50, 120, 100, 30);
	add(Desc);

	Desc1 = new JTextField();
	Desc1.setBounds(110, 120, 200, 30);
	c.add(Desc1);
	
	Valor = new JLabel();
	Valor.setText("Valor(R$):");
	Valor.setBounds(50, 165, 100, 30);
	add(Valor);
	
	Valor1 = new JTextField();
	Valor1.setBounds(110, 165, 200, 30);
	c.add(Valor1);
	
	  verificar= new JButton();
	  verificar.setBounds(50,200, 180, 30);
	  verificar.setBackground(Color.BLUE);
	  verificar.setForeground(Color.white);
	  verificar.setText("Visualizar dados");
		c.add(verificar);
		
		
		c.add(l1);
		l1.setBounds(50, 230, 200, 30);
		c.add(l2);
		l2.setBounds(50, 250, 300, 30);
		c.add(l3);
		l3.setBounds(50, 270, 200, 30);
		
		verificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Jogo j1 = new Jogo();
				j1.setNome(Nome1.getText()); 
				j1.setDesc(Desc1.getText());
				j1.setValor(Float.parseFloat(Valor1.getText()));
				
				 l1.setText("Nome do jogo: "+j1.getNome());
				 l2.setText("Descrição do jogo: "+j1.getDesc());
				 l3.setText("Valor: "+ j1.getValor());
				  
			}
		});

}
}
