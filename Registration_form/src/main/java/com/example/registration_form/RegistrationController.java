package com.example.registration_form;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

import java.io.IOException;
import java.util.Objects;

public class RegistrationController {
    @FXML
    private TextField fullNameInput;
    @FXML
    private TextField EmailInput;
    @FXML
    private PasswordField PasswordInput;
    @FXML
    private Label messageLabel;
    private Parent root;
    private Stage stage;
    private Scene scene;

    public void onSubmitButtonClick() {
        if ((fullNameInput.getLength()==0)||(EmailInput.getLength()==0)||(PasswordInput.getLength()==0)){
            messageLabel.setText("Fields cannot be empty!");
            messageLabel.setTextFill(Paint.valueOf("red"));
        }else{
            messageLabel.setText("Success");
            messageLabel.setTextFill(Paint.valueOf("black"));
        }
    }
    public void onLoginButtonClickedFromsginupScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}