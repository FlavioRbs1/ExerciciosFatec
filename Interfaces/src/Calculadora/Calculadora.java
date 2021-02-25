package Calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculadora {

	private JFrame janela;
	private JPanel painel;
	private JTextField texto;
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JButton botao4;
	private JButton botao5;
	private JButton botao6;
	private JButton botao7;
	private JButton botao8;
	private JButton botao9;
	private JButton botao10;
	private JButton botao11;
	private JButton botao12;
	private JButton botao13;
	private JButton botao14;
	private JButton botao15;
	private JButton botao16;
	private JButton botao17;
	
	
	public Calculadora() {
	
		janela = new JFrame("Calculadora");
		painel = new JPanel();
		
		texto  = new JTextField(10);
		painel.add(texto);
		
		botao1  = new JButton("CE");
		painel.add(botao1);
		
		botao2  = new JButton("1");
		painel.add(botao2);
		
		botao3  = new JButton("2");
		painel.add(botao3);
		
		botao4  = new JButton("3");
		painel.add(botao4);
		
		botao5  = new JButton("+");
		painel.add(botao5);
		
		botao6  = new JButton("4");
		painel.add(botao6);
		
		botao7  = new JButton("5");
		painel.add(botao7);
		
		botao8  = new JButton("6");
		painel.add(botao8);
		
		botao9  = new JButton("-");
		painel.add(botao9);
		
		botao10  = new JButton("7");
		painel.add(botao10);
		
		botao11  = new JButton("8");
		painel.add(botao11);
		
		botao12  = new JButton("9");
		painel.add(botao12);
		
		botao13  = new JButton("*");
		painel.add(botao13);
		
		botao14  = new JButton(",");
		painel.add(botao14);
		
		botao15  = new JButton("0");
		painel.add(botao15);
		
		botao16  = new JButton("=");
		painel.add(botao16);
		
		botao17  = new JButton("/");
		painel.add(botao17);
		
		janela.setSize(200, 200);
		janela.setContentPane(painel);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
