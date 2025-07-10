/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.htc.demo;
import com.htc.pojo.Level;
import com.htc.pojo.Category;
import com.htc.services.BaseServices;
import com.htc.services.CategoryServices;
import com.htc.services.LevelServices;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    @FXML private ComboBox<Level> cbLevels;
    @FXML private VBox vboxChoice;
    
    
    private final static BaseServices cateService = new CategoryServices();
    private final static BaseServices levelService = new LevelServices();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.cbCates.setItems(FXCollections.observableList(cateService.list()));
            this.cbLevels.setItems(FXCollections.observableList(levelService.list()));
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }
    
    public void addChoice(ActionEvent event){
        HBox h = new HBox();
        h.getStyleClass().add("Main");
        
        RadioButton rdo = new RadioButton();
        TextField txt = new TextField();
        
        h.getChildren().addAll(rdo, txt);
        this.vboxChoice.getChildren().add(h);
        
   }
}
