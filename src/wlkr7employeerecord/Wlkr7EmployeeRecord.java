/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeerecord;

import java.io.IOException;
import java.util.Optional;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import wlkr7employeetype.newpackage.Wlkr7Employee;

/**
 *
 * @author weixianlow
 */



public class Wlkr7EmployeeRecord extends Application {
    
    
    
    private Stage primaryStage;
    private AnchorPane rootLayout;
    
    private ObservableList<Wlkr7Employee> employeeData = FXCollections.observableArrayList();
    
    public Wlkr7EmployeeRecord(){
    
    
    
    }
    
    public ObservableList<Wlkr7Employee> getPersonData(){
        return employeeData;
    }
    
    
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Employee Record Manager");
        
        
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Wlkr7EmployeeRecord.class.getResource("MainPage.fxml"));
            rootLayout = (AnchorPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            
            MainPageController controller = loader.getController();
            controller.setMainApplication(this);
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            throw ex;
        }
        
        
        
        primaryStage.setOnCloseRequest((WindowEvent we) -> {
            
                
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Unsaved Data");
                    alert.setHeaderText("Changes have not been saved.");
                    alert.setContentText("Are you sure you want to continue?");

                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK){
                        // ... user chose OK
                        primaryStage.close();
                    } else {
                        // ... user chose CANCEL or closed the dialog
                        we.consume();
                    }
                
            
        });
        
        
        
    }
    
    public Stage getPrimaryStage(){
        return primaryStage;
    }
    
    public boolean showEditDialog(Wlkr7Employee employee) throws Exception{
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Wlkr7EmployeeRecord.class.getResource("EditEmployee.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Employee");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            
            EditEmployeeController controller = loader.getController();
            controller.setStage(dialogStage);
            controller.editEmployee(employee);
            
            dialogStage.showAndWait();
            
            return controller.isOkClicked();
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
    

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
