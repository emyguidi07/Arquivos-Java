
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class forms extends JFrame {
 JCheckBox PWI = new JCheckBox("Programação Web I");
 JCheckBox BE = new JCheckBox("Beleza e estética");
 JCheckBox PAM = new JCheckBox("Programação de aplicativos móveis");
 JCheckBox E = new JCheckBox("Edificações");
 JCheckBox DS = new JCheckBox("Desenvolvimento de sistemas");
 private JLabel pergunta;
 private JButton verificar;
 
 public forms(){

	 	this.setSize(700,200);
		this.setTitle("	Exemplo Check Box");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		pergunta = new JLabel();
		pergunta.setText("Quais componentes curriculares a seguir pertencem ao curso de desenvolvimento de sistemas?");
		pergunta.setBounds(50, 150, 100, 30);
		c.add(pergunta);
		
		 c.add(PWI);
	 	 c.add(BE);
	 	 c.add(PAM);
	 	 c.add(E);
	 	 c.add(DS);

  //botao
   verificar= new JButton();
  verificar.setBounds(50,200, 180, 30);
  verificar.setBackground(Color.BLUE);
  verificar.setForeground(Color.white);
  verificar.setText("Visualizar opções escolhidas");
	c.add(verificar);
	
	
	verificar.addActionListener(new ActionListener(){
		String texto = ""; 
		@Override
		public void actionPerformed(ActionEvent e) {
			   if(PWI.isSelected())
			    texto += "Programação Web I" + "\n";
			   
			   if(BE.isSelected())
			    texto += "Beleza e Estética" + "\n";
			   
			   if(PAM.isSelected())
			    texto += "Programação de Aplicativos Móveis" + "\n";
			   
			   if(E.isSelected())
			    texto += "Edificações" + "\n";
			   
			   if(DS.isSelected())
				texto += "Desenvolvimento de sistemas" + "\n";

			   JOptionPane.showMessageDialog(null,"Componentes selecionados:  \n" + texto );
			
		}
	});
	this.setVisible(true); 
 }
 }
 

