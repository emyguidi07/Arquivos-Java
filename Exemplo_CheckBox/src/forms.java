
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class forms extends JFrame {
 JCheckBox PWI = new JCheckBox("Programa��o Web I");
 JCheckBox BE = new JCheckBox("Beleza e est�tica");
 JCheckBox PAM = new JCheckBox("Programa��o de aplicativos m�veis");
 JCheckBox E = new JCheckBox("Edifica��es");
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
  verificar.setText("Visualizar op��es escolhidas");
	c.add(verificar);
	
	
	verificar.addActionListener(new ActionListener(){
		String texto = ""; 
		@Override
		public void actionPerformed(ActionEvent e) {
			   if(PWI.isSelected())
			    texto += "Programa��o Web I" + "\n";
			   
			   if(BE.isSelected())
			    texto += "Beleza e Est�tica" + "\n";
			   
			   if(PAM.isSelected())
			    texto += "Programa��o de Aplicativos M�veis" + "\n";
			   
			   if(E.isSelected())
			    texto += "Edifica��es" + "\n";
			   
			   if(DS.isSelected())
				texto += "Desenvolvimento de sistemas" + "\n";

			   JOptionPane.showMessageDialog(null,"Componentes selecionados:  \n" + texto );
			
		}
	});
	this.setVisible(true); 
 }
 }
 

