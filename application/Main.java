package application;
import java.util.ArrayList;

import classes.Discente;
import classes.RepositorioArrays;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	static RepositorioArrays repositorio;
	
	private static Scene sceneScene1, sceneScene2,sceneScene3, sceneScene4;
	private static Stage primaryStage;

	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader Scene1 = new FXMLLoader(getClass().getResource("Scene1.fxml"));
			FXMLLoader Scene2 = new FXMLLoader(getClass().getResource("Scene2.fxml"));
			FXMLLoader Scene3 = new FXMLLoader(getClass().getResource("Scene3.fxml"));
			FXMLLoader Scene4 = new FXMLLoader(getClass().getResource("Scene4.fxml"));

			primaryStage = stage;
			stage.setTitle("Requerimentos");

			//Image icone = new Image("arq.jpg");
			//stage.getIcons().add(icone);

			Parent parentScene1 = Scene1.load();
			Parent parentScene2 = Scene2.load();
			Parent parentScene3 = Scene3.load();
			Parent parentScene4 = Scene4.load();

			sceneScene1 = new Scene(parentScene1);
			sceneScene2 = new Scene(parentScene2);
			sceneScene3 = new Scene(parentScene3);
			sceneScene4 = new Scene(parentScene4);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(sceneScene1);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		repositorio = new RepositorioArrays();
		launch(args);
	}

	public static void switchMudaTelas(int opcao) {
		switch (opcao) {
		case 1:
			primaryStage.setScene(sceneScene1);
			break;
		case 2:
			primaryStage.setScene(sceneScene2);
			break;
		case 3:
			primaryStage.setScene(sceneScene3);
			break;
		case 4:
			primaryStage.setScene(sceneScene4);
			break;
		}
	}
}