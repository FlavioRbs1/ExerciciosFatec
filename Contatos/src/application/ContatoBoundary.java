package application;
	
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Entity.Contatos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ContatoBoundary extends Application implements EventHandler<ActionEvent>{
	
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtTelefone = new TextField();
	private TextField txtEmail = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	private ArrayList<Contatos> lista = new ArrayList<Contatos>();
		
	@Override
	public void start(Stage stage) {
		
			BorderPane principal = new BorderPane();
			Scene scn = new Scene(principal,600,300);
			
			GridPane grid = new GridPane();
			grid.setStyle("-fx-padding: 20px"); //margem no pane
			grid.setHgap(30);//distância entre as duas Grids
			ColumnConstraints colLabels = new ColumnConstraints();
			colLabels.setPercentWidth(30); 
			colLabels.setHalignment(HPos.RIGHT);
			
			ColumnConstraints colTexto= new ColumnConstraints();
		    colTexto.setPercentWidth(70);
			
		    grid.getColumnConstraints().addAll(colLabels,colTexto);
		    principal.setCenter(grid);
		

			grid.add(new Label("Id"),0,0);
			grid.add(txtId,1,0);
			
			grid.add(new Label("Nome"),0,1);
			grid.add(txtNome,1,1);
			
			grid.add(new Label("telefone"),0,2);
			grid.add(txtTelefone,1,2);
			
			grid.add(new Label("Email"),0,3);
			grid.add(txtEmail,1,3);
			
			grid.add(new Label("Nascimento"),0,4);
			grid.add(txtNascimento,1,4);
			
			grid.add(btnAdicionar, 0,5);
			grid.add(btnPesquisar, 1,5);
			
			btnAdicionar.addEventHandler(ActionEvent.ACTION, this);
			btnPesquisar.addEventHandler(ActionEvent.ACTION, this);
			
		   
			stage.setScene(scn);
			stage.setTitle("Agenda de contatos");
			stage.show();
		
	}
	
	 
	public static void main(String[] args) {
		Application.launch(ContatoBoundary.class,args);
	}

	@Override
	public void handle(ActionEvent e) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if(e.getTarget() == btnAdicionar) {
			Contatos c = new Contatos();
			c.setId(Long.parseLong(txtId.getText()));
			c.setNome(txtNome.getText());
			c.setTelefone(txtTelefone.getText());
			c.setEmail(txtTelefone.getText());
			LocalDate date = LocalDate.parse(txtNascimento.getText(),fmt);
			c.setNascimento(date);
			lista.add(c);
		} else if (e.getTarget().equals(btnPesquisar))
		System.out.println("Botão pesquisar apertado");
	}
}
