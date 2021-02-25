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
		Scene scn = new Scene(root,500,250);
		
		
		Label label_nome = new Label("Nome do Produto");
		label_nome.setLayoutX(10);
		label_nome.setLayoutY(15);
		
		Label label_Quantidade = new Label("Quantidade");
		label_Quantidade.setLayoutX(10);
		label_Quantidade.setLayoutY(55);
		
		Label label_dimensoes = new Label("Dimensões");
		label_dimensoes.setLayoutX(10);
		label_dimensoes.setLayoutY(95);
		
		Label label_Peso = new Label("Peso");
		label_Peso.setLayoutX(10);
		label_Peso.setLayoutY(135);
		
		Label label_Estoque = new Label("Peso");
		label_Estoque.setLayoutX(10);
		label_Estoque.setLayoutY(175);
		
		TextField txt_nome = new TextField();
		txt_nome.setLayoutX(120);
		txt_nome.setLayoutY(15);
		
		TextField txt_Quantidade= new TextField();
		txt_Quantidade.setLayoutX(120);
		txt_Quantidade.setLayoutY(55);
		
		TextField txt_dimensoes1 = new TextField();
		txt_dimensoes1.setLayoutX(120);
		txt_dimensoes1.setLayoutY(95);
		txt_dimensoes1.setPrefWidth(50);
		
		TextField txt_dimensoes2 = new TextField();
		txt_dimensoes2.setLayoutX(175);
		txt_dimensoes2.setLayoutY(95);
		txt_dimensoes2.setPrefWidth(50);
		
		TextField txt_dimensoes3 = new TextField();
		txt_dimensoes3.setLayoutX(230);
		txt_dimensoes3.setLayoutY(95);
		txt_dimensoes3.setPrefWidth(50);
		
		
		Button botao_OK = new Button("OK");
		botao_OK.setLayoutY(250);
		
		Button botao_Cancela = new Button("Cancel");
		botao_Cancela.setLayoutX(50);
		botao_Cancela.setLayoutY(130);
		
		root.getChildren().addAll(label_Estoque,label_Peso,label_nome, label_Quantidade, label_dimensoes,txt_dimensoes1,txt_dimensoes2,txt_dimensoes3, txt_Quantidade, txt_nome, botao_Cancela,botao_OK);
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
