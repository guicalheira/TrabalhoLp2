package application;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import classes.RepositorioArrays;
import classes.Requerimento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Scene3Controller extends MenuBarController implements Initializable{
	@FXML
	private ChoiceBox <String> cbStatus;
	private final String[] status = {"Atendido","Não Atendido"};

	@FXML
	private TextField  tfNumeroProtocolo;
	@FXML
	private Text novoProtocolo;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cbStatus.getItems().addAll(status);	
	}
	public void txtProtocolo(ActionEvent event) {
		String protocolo = tfNumeroProtocolo.getText();
		novoProtocolo.setText(protocolo);
		
	}
	
	 public void altStatus(ActionEvent  event) {
		String numeroProtocolo = tfNumeroProtocolo.getText();
		Date data = new Date();
		String status = cbStatus.getValue();
		Requerimento requerimento = new Requerimento(numeroProtocolo,0,data,null ,null,status);
	
	RepositorioArrays repositorio = new RepositorioArrays() ;
	
   repositorio.getRequerimentos();
	


	
	
	Alert alertInserido = new Alert(Alert.AlertType.INFORMATION);
	alertInserido.setTitle("Cadastro concluído com sucesso !");
	alertInserido.setContentText("Status do protocolo '"+requerimento.getNumeroProtocolo()+ "' alterado para: '" +requerimento.getStatus()+ "' com sucesso");
	alertInserido.showAndWait();
	

	
	}
	
	
}   