package application;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import classes.Requerimento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Scene2Controller extends MenuBarController implements Initializable{    

	@FXML
	private ChoiceBox <String> cbReq;
	private final String[] requerimentos = {"Aproveitamento de Disciplina","Comprovante de Matrícula","Diploma de Conclusão de Curso",
			"Histórico Acadêmico","Matrícula em Estágio","Revisão de Avaliação","Segunda Chamada de Avaliação",
			"Trancamento de Curso","Trancamento de Disciplina"};
	@FXML
	private TextArea taObservacao;
	@FXML
	private TextField  tfNumeroMatricula;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		cbReq.getItems().addAll(requerimentos);	
		
		
	}
	

	
	public void getReq(ActionEvent event) {
		String numeroProtocolo = Requerimento.geraNumeroProtocolo();
		int numeroMatricula = Integer.parseInt(tfNumeroMatricula.getText());
		Date data = new Date();
		String tipoSolicitacao = cbReq.getValue();
		String observacao = taObservacao.getText();
		String status = "Em aberto";
		
		Requerimento requerimento = new Requerimento(numeroProtocolo,numeroMatricula,data,tipoSolicitacao , observacao,status);
		
		
		
		
	
		Main.repositorio.adicionar(requerimento);
		for (Requerimento a : Main.repositorio.getRequerimentos())
			System.out.println(a.toString());
		
		Alert alertInserido = new Alert(Alert.AlertType.INFORMATION);
		alertInserido.setTitle("Cadastro concluído com sucesso !");
		alertInserido.setContentText("Requerimento de protocolo: " + requerimento.getNumeroProtocolo() +" foi cadastrado "+
		"Status: "+ status);
		alertInserido.showAndWait();
		
		//Limpando os campos
		 tfNumeroMatricula.setText("");
		 taObservacao.setText("");

		System.out.println("clicou botao adicionar requerimento");
		System.out.println(numeroProtocolo+" "+numeroMatricula+data+" "+tipoSolicitacao+" "+observacao+" "+status);
		
		
	}
	
}