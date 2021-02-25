import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class helloWordGraf {

	public static void main (String []args) {
		
		//instanciando janela
		JFrame janela = new JFrame("Hello");
		
		//instanciando painel
		JPanel painel = new JPanel();
		
		//instanciando label
		JLabel label = new JLabel("Hello Word");
		
		//conectando painel no label
		painel.add(label);
		
		//conectando janela no painel
		janela.setContentPane(painel);
		
		//determinando o tamanho
		janela.setSize(400, 200);
		
		//tornando visivel
		janela.setVisible(true);
	}
	
}
