/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeerecord;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author weixianlow
 */
public class EditEmployeeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField firstName = new TextField();
    
    @FXML
    private TextField lastName = new TextField();
    
    @FXML
    private DatePicker birthDate = new DatePicker();
    
    @FXML
    private TextField employeeID = new TextField();
    
    @FXML
    private TextArea address = new TextArea();
    
    @FXML
    private TextField phoneNumber = new TextField();
    
    @FXML
    private DatePicker dateStarted = new DatePicker();
    
    @FXML
    private CheckBox foodSafetyTraining = new CheckBox();
    
    @FXML
    private CheckBox cashManagementTraining = new CheckBox();
    
    @FXML
    private CheckBox healthCodeTraining = new CheckBox();
    
    @FXML
    private Button cancel = new Button();
    
    @FXML
    private Button done = new Button();
    
    @FXML
    private CheckBox supervisorTraining = new CheckBox();
    
    @FXML
    private CheckBox crisisManagement = new CheckBox();
    
    @FXML
    private CheckBox managerTraining = new CheckBox();
    
    @FXML
    private CheckBox crisisManagement2 = new CheckBox();
    
    @FXML
    private CheckBox safeDepositTraining = new CheckBox();
    
    @FXML
    private CheckBox schedulingTraining = new CheckBox();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
}
