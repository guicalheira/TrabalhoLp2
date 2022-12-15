package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.Discente;
import classes.Requerimento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene2Controller extends MenuBarController implements Initializable{    

	@FXML
	private ChoiceBox <String> cbReq;
	private String[] requerimentos = {"Aproveitamento de Disciplina","Comprovante de Matrícula","Diploma de Conclusão de Curso",
			"Histórico Acadêmico","Matrícula em Estágio","Revisão de Avaliação","Segunda Chamada de Avaliação",
			"Trancamento de Curso","Trancamento de Disciplina"};
	@FXML
	private TextField tfObservacao, tfNumeroMatricula, tfData, tfStatus;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		cbReq.getItems().addAll(requerimentos);
		
	}
	public void getReq(ActionEvent event) {
		
		String tipoSolicitacao = cbReq.getAccessibleText();
		Requerimento requerimento = new Requerimento(tfNumeroMatricula,tipoSolicitacao, tfData, tfObservacao);
	
		Main.repositorio.adicionar(requerimento);
		
		for (Discente a : Main.repositorio.getDiscentes())
			System.out.println(a.toString());
		
		Alert alertInserido = new Alert(Alert.AlertType.INFORMATION);
		alertInserido.setTitle("Cadastro concluído com sucesso !");
		alertInserido.setContentText("Requerimento de protocolo: " + requerimento.getNumeroProtocolo() +" foi cadastrado "+
		"Status: " + requerimento.getStatus());
		alertInserido.showAndWait();
		
		//Limpando os campos
		//tfNumeroMatricula.setText("");
		//tfNomeDiscente.setText("");

		System.out.println("clicou botao adicionar discente");
		
		
	}
	
}