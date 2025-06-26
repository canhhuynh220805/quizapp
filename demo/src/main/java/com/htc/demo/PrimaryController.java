package com.htc.demo;

import com.htc.utils.MyAlert;
import com.htc.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {

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
}
