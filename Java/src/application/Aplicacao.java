package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Aplicacao extends Application {

	public void start(Stage stage) throws Exception{
		
		Group root = new Group();
		Scene scn = new Scene(root,500,200);
		
		
		Label label_id = new Label("ID");
		label_id.setLayoutX(10);
		label_id.setLayoutY(15);
		
		TextField txt_id = new TextField();
		txt_id.setLayoutX(100);
		txt_id.setLayoutY(15);
		
		Label label_Nome = new Label("Nome");
		label_Nome.setLayoutX(10);
		label_Nome.setLayoutY(55);
		
		TextField txt_Nome = new TextField();
		txt_Nome.setLayoutX(100);
		txt_Nome.setLayoutY(55);
		
		Label label_telefone = new Label("Telefone");
		label_telefone.setLayoutX(10);
		label_telefone.setLayoutY(95);
		
		TextField txt_tel = new TextField();
		txt_tel.setLayoutX(100);
		txt_tel.setLayoutY(95);
		
		Button botao_salvar = new Button("Salvar");
		botao_salvar.setLayoutY(130);
		
		Button botao_pesquisar = new Button("Pesquisar");
		botao_pesquisar.setLayoutX(50);
		
		botao_pesquisar.setLayoutY(130);
		
		root.getChildren().addAll(label_id, label_Nome, label_telefone,txt_tel, txt_Nome, txt_id, botao_pesquisar,botao_salvar);
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
