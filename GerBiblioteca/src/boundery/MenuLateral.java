package boundery;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuLateral extends Application {

    Stage window;
    Scene sceneMenu;
    Label menuIdentificacao;
    Button btnEmprestimo;
    Button btnCliente;
    Button btnExemplar;
    Button btnLivro;
    Button btnFuncionario;
    Button btnGenero;
    Button btnEditora;
    Button btnAutor;
    Button btnConfiguracao;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
      //  window = primaryStage;
        window.setTitle("Gerenciador Biblioteca 2.0");

        menuIdentificacao = new Label("MENU");
        btnEmprestimo = new Button("Emprestimos");
        btnEmprestimo.setMinWidth(150);

        btnCliente = new Button("Clientes");
        btnCliente.setMinWidth(150);

        btnExemplar = new Button("Exemplares");
        btnExemplar.setMinWidth(150);

        btnLivro = new Button("Livros");
        btnLivro.setMinWidth(150);

        btnFuncionario = new Button("Funcionarios");
        btnFuncionario.setMinWidth(150);

        btnGenero = new Button("Generos");
        btnGenero.setMinWidth(150);

        btnEditora = new Button("Editoras");
        btnEditora.setMinWidth(150);

        btnAutor = new Button("Autores");
        btnAutor.setMinWidth(150);

        btnConfiguracao = new Button("Configurações");
        btnConfiguracao.setMinWidth(150);


        VBox layoutMenuLateral = new VBox(15);
        layoutMenuLateral.getChildren().addAll(menuIdentificacao, btnEmprestimo, btnCliente, btnExemplar,
                btnLivro, btnFuncionario, btnGenero, btnEditora, btnAutor, btnConfiguracao);
        layoutMenuLateral.setPadding(new Insets(20));

        sceneMenu = new Scene(layoutMenuLateral, 200, 500);
        window.setScene(sceneMenu);
        window.show();

    }
}
