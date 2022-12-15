package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.Discente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Scene1Controller extends MenuBarController implements Initializable{
	
	@FXML
	private TextField tfNumeroMatricula, tfNomeDiscente;
	@FXML
	private ChoiceBox <String> cbCursos;
	private String[] cursos = {"Engenharia Ambiental","Engenharia Civil","Engenharia Elétrica","Química","Sistemas de Informação"};
	@FXML
	private Button addButton;

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		cbCursos.getItems().addAll(cursos);

	
	
	}
	
	public void ClicouAdicionar(ActionEvent event) {
		
		
		int numeroMatriucla = Integer.parseInt(tfNumeroMatricula.getText());
		String nomeDiscente = tfNomeDiscente.getText(); 
		String cursoDiscente = cbCursos.getAccessibleText();
		
		
		Discente discente = new Discente(numeroMatriucla, nomeDiscente, cursoDiscente);
	
		Main.repositorio.adicionar(discente);
		
		for (Discente a : Main.repositorio.getDiscentes())
			System.out.println(a.toString());
		
		Alert alertInserido = new Alert(Alert.AlertType.INFORMATION);
		alertInserido.setTitle("Cadastro concluído com sucesso !");
		alertInserido.setContentText("Discente de matrícula " + discente.getNumeroMatricula() +" foi cadastrado.");
		alertInserido.showAndWait();
		
		//Limpando os campos
		tfNumeroMatricula.setText("");
		tfNomeDiscente.setText("");

		System.out.println("clicou botao adicionar discente");
	}
	
}