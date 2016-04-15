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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author weixianlow
 */
public class MainPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ListView list = new ListView();
    
    @FXML
    private Label firstName = new Label();
    
    @FXML
    private Label lastName = new Label();
    
    @FXML
    private Label birthDate = new Label();
    
    @FXML
    private Label address = new Label();
    
    @FXML
    private Label phoneNumber = new Label();
    
    @FXML
    private Label employeeID = new Label();
    
    @FXML
    private Label dateJoined = new Label();
    
    @FXML
    private Label infusions = new Label();
    
    @FXML
    private Label morts = new Label();
    
    @FXML
    private Label kateAndEmmas = new Label();
    
    @FXML
    private Label doMundos = new Label();
    
    @FXML
    private Label pomodoro = new Label();
    
    @FXML
    private Label foodTraining = new Label();
    
    @FXML
    private Label cashManagement = new Label();
    
    @FXML
    private Label healthCode = new Label();
    
    @FXML
    private Label supervisorTraining = new Label();
    
    @FXML
    private Label crisisManagement = new Label();
    
    @FXML
    private Label managerTraining = new Label();
    
    @FXML
    private Label crisisMangement2 = new Label();
    
    @FXML
    private Label safeDepositTraining = new Label();
    
    @FXML
    private Label schedulingTraining = new Label();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
