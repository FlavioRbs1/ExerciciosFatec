package ObjetosGraficos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conteiner {

	private JFrame janela;
	private JPanel painel;
	private JLabel label;
	private JTextField texto;
	private JLabel label2;
	private JTextField texto2;
	private JButton botao;	
	private JButton botao2;	
	
	public Conteiner() {

		janela = new JFrame();
		painel = new JPanel();
		
		label = new JLabel("Enter your phone number:");
		painel.add(label);
				
		texto = new JTextField(25);
		painel.add(texto);
		
		label2 = new JLabel("Enter your name");
		painel.add(label2);
		
		texto2 = new JTextField(30);
		painel.add(texto2);
		
		botao = new JButton("ok");
		painel.add(botao);
		
		botao2 = new JButton("Cancel");
		painel.add(botao2);
				
		janela.setSize(500,200);
		janela.setContentPane(painel);	
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


}
