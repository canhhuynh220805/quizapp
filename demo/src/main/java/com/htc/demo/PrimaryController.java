package com.htc.demo;

import com.htc.utils.MyAlert;
import com.htc.utils.MyStage;
import com.htc.utils.themes.Theme;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<Theme> cbthemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbthemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    
    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInstance().showScreen("questions.fxml");
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Practice coming soon....");
    }
    
    public void handleTest(ActionEvent event){
        MyAlert.getInstance().showMsg("Test is coming soon....");
    }
    public void handleSignUp(ActionEvent event){
        MyAlert.getInstance().showMsg("Sign up is coming soon....");
    }
    public void handleSignIn(ActionEvent event){
        MyAlert.getInstance().showMsg("Sign in is coming soon....");
    }
    
    public void handleChangeThemes(){
        this.cbthemes.getSelectionModel().getSelectedItem().updateTheme(this.cbthemes.getScene());
    }
}
