package cadastrojogo;

import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame{
	public Menu(){
		   
	       super("Formulário com Menu");

	       JMenu arq = new JMenu("Saída");
	       JMenu prin = new JMenu("Principal"); 
	       JMenu deta = new JMenu("Detalhes"); 
	       
	       JMenuItem prin1 = new JMenuItem("Principal"); 
	       JMenuItem deta1 = new JMenuItem("Detalhes");
	       JMenuItem sair = new JMenuItem("Sair");
	              
	       arq.add(sair);
	       prin.add(prin1);
	       deta.add(deta1);
	       
	       JMenuBar bar = new JMenuBar();
	       setJMenuBar(bar);
	       bar.add(arq);
	       bar.add(prin); 
	       bar.add(deta);
	             
	       sair.addActionListener(
	         new ActionListener(){
	             public void actionPerformed(ActionEvent event){
	            	 int resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?");
	            	 if(resposta == JOptionPane.YES_OPTION) {
	            		 System.exit(0);
	            	 }
	            	 else{
	            		 return;
	            		 }
	             }
	         }
	       );
	       
	       prin1.addActionListener(
	         new ActionListener(){
	             public void actionPerformed(ActionEvent event){
	                Formjogo frmjogo = new Formjogo();                
	                frmjogo.setVisible(true);	               
	             }
	         }
	       );
	       
	       deta1.addActionListener(
	  	         new ActionListener(){
	  	             public void actionPerformed(ActionEvent event){
	  	                FrmDetalhes jogo1 = new FrmDetalhes();                
	  	                jogo1.setVisible(true);	               
	  	             }
	  	         }
	  	       );
}
	}
