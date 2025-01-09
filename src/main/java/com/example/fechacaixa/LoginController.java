package com.example.fechacaixa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginController {
    public TextField tfUsername;
    public PasswordField pfSenha;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onAcessar(ActionEvent actionEvent) {
        String view = "";
        if(pfSenha.getText().equals("adm")) {
            view = "adm-view.fxml";
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(FechaCaixa.class.getResource(view));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void onNovoUsu(ActionEvent actionEvent) {
        String view = "";
        if(pfSenha.getText().equals("adm")) {
            view = "/cadUsu-view.fxml";
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(FechaCaixa.class.getResource(view));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}