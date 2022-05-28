package cadastrojogo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrmDetalhes extends JFrame{
	JLabel escolha;
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JComboBox combomarca;
	JCheckBox rj,sp;
	private JLabel perguntaCB, perguntaRB;
	JRadioButton ano1, ano2, ano3;
	JButton verificar;
	ButtonGroup bgr1,bgr2;
	
public FrmDetalhes() {
	
	setTitle("Detalhes da compra do jogo");
    setSize(500,500);  
    setResizable(false);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.cyan);
	
	Container c = getContentPane();
	c.setLayout(null);
	
	escolha = new JLabel();
	escolha.setText("Marca do jogo:");
	escolha.setBounds(50, 50, 100, 30);
	add(escolha);
	
	combomarca= new JComboBox(Jogo.itensmarca);
	combomarca.setBounds(50, 100,100,25);
	c.add(combomarca);
	
	perguntaCB = new JLabel();
	perguntaCB.setText("Local da compra:");
	perguntaCB.setBounds(50, 130, 100, 30);
	add(perguntaCB);
	bgr1 = new ButtonGroup();
	  rj = new JCheckBox("Rio de Janeiro");
	  rj.setBounds(50, 160, 200, 30);
	  bgr1.add(rj);
	  c.add(rj);
	  sp = new JCheckBox("São Paulo");
	  sp.setBounds(50, 180, 200, 30);
	  bgr1.add(sp);
	  c.add(sp);
	
	perguntaRB = new JLabel("Ano do jogo:");
	perguntaRB.setBounds(50, 230, 100, 30);
	add(perguntaRB);
	
	bgr2 = new ButtonGroup();
	  ano1 = new JRadioButton("2021");
	  ano1.setBounds(50, 260, 100, 30);
	  bgr2.add(ano1);
	  c.add(ano1);
	  ano2 = new JRadioButton("2020");
	  ano2.setBounds(50, 280, 100, 30);
	  bgr2.add(ano2);
	  c.add(ano2);
	  ano3 = new JRadioButton("2019");
	  ano3.setBounds(50, 300, 100, 30);
	  bgr2.add(ano3);
	  c.add(ano3);
	 
	 
	 // tratamento para exibir 
	  verificar= new JButton();
	  verificar.setBounds(50,350, 180, 30);
	  verificar.setBackground(Color.BLUE);
	  verificar.setForeground(Color.white);
	  verificar.setText("Visualizar dados");
		c.add(verificar);
		
		c.add(l1);
		l1.setBounds(50, 390, 200, 30);
		c.add(l2);
		l2.setBounds(50, 410, 200, 30);
		c.add(l3);
		l3.setBounds(50, 430, 200, 30);
		
		verificar.addActionListener(new ActionListener(){
			String texto = ""; 
			String texto1 = ""; 
			@Override
			public void actionPerformed(ActionEvent e) {
				   if(ano1.isSelected())
					 texto = "Jogo de 2021" + "\n";
				   
				   if(ano2.isSelected())
					 texto = "Jogo de 2020" + "\n"; 

				   if(ano3.isSelected())
					 texto = "Jogo de 2019" + "\n";
				   
				   if(rj.isSelected())
					   texto1 = "Comprado no Rio de Janeiro" + "\n";
				   
				   if(sp.isSelected())
					   texto1 = "Comprado em São Paulo" + "\n";
				   
				   Jogo j1 = new Jogo();
				   j1.setAno(texto);
				   j1.setLocal(texto1);
				   
				   l1.setText("Marca: " + combomarca.getSelectedItem());
				   l2.setText(j1.getAno());
				   l3.setText(j1.getLocal());
			}
		});
	 }
}
