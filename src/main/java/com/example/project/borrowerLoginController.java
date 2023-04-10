package com.example.project;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class borrowerLoginController {


    Database database;

    {
        try {
            database = new Database();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public TextField email;
    @FXML
    public PasswordField password;
    @FXML
    public Button register;
    @FXML
    public Button login;

    @javafx.fxml.FXML
    @FXML
    private Label errorMessage;

    public void login(ActionEvent actionEvent) throws SQLException, IOException {

        String Email = email.getText().toString();
        String Password = password.getText().toString();

        if(Email.isEmpty() || Password.isEmpty()){
            errorMessage.setText("Please fill the empty fields ... ! ");
            return ;
        }
        boolean flag = database.login(Email,Password);
        System.out.println(flag);
        if(flag == false){
            errorMessage.setText("Invalid username or password ... !");
            return ;
        }
        else{
            errorMessage.setText("");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("allbooks.fxml"));
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            AnchorPane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();
        }

    }
}