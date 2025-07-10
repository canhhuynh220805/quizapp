/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htc.utils;

import com.htc.demo.App;
import com.htc.utils.themes.ThemeManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {

    private static MyStage instance;
    private final Stage stage;
    private Scene scene = null;

    private MyStage() {
        stage = new Stage();
        stage.setTitle("quiz app");
    }
    
    public static MyStage getInstance() {
        if (instance == null) {
            instance = new MyStage();
        }
        return instance;
    }
    
    public void showScreen(String fxml) throws IOException {
        if (!stage.isShowing()) {
            if (scene == null) {
                scene = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
            } else {
                scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
            }
            ThemeManager.applyTheme(scene);
            stage.setScene(scene);
            stage.show();
        }
    }
}
