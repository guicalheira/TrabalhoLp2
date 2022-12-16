package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuBarController {
	@FXML
	protected void ClicouAddDiscente(ActionEvent event) {
		Main.switchMudaTelas(1);
	}

	@FXML
	protected void ClicouNovoReq(ActionEvent event) {
		Main.switchMudaTelas(2);
	}
	@FXML
	protected void ClicouAlterarStatus(ActionEvent event) {
		Main.switchMudaTelas(3);
	}
	@FXML
	protected void ClicouConsulta(ActionEvent event) {
		Main.switchMudaTelas(4);
	}
}
	