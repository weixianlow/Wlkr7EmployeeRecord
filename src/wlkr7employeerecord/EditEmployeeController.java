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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import wlkr7employeetype.newpackage.Wlkr7Employee;

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
    private TextField employeeID = new TextField();
    
    @FXML
    private TextArea address = new TextArea();
    
    @FXML
    private TextField phoneNumber = new TextField();
    
    
    
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
    private CheckBox morts = new CheckBox();
    
    @FXML
    private CheckBox pomodoros = new CheckBox();
    
    @FXML
    private CheckBox doMundos = new CheckBox();
    
    @FXML
    private CheckBox kateAndEmmas = new CheckBox();
    
    @FXML
    private CheckBox infusion = new CheckBox();
    
    
    
    private Stage dialogStage;
    private Wlkr7Employee employee;
    private boolean okBtnStatus = false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }   
    
    public void setStage(Stage dialogStage){
            this.dialogStage = dialogStage;
    }
    
    public void editEmployee(Wlkr7Employee employee){
        this.employee = employee;
        
        if(employee.getFirstName() != null){
        firstName.setText(employee.getFirstName());
        }
        lastName.setText(employee.getLastName());
        
        employeeID.setText(employee.getEmployeeID());
        address.setText(employee.getAddress());
        phoneNumber.setText(employee.getPhonenumber());
        
        foodSafetyTraining.setSelected(employee.getFoodTraining());
        cashManagementTraining.setSelected(employee.getCashManagementTraining());
        healthCodeTraining.setSelected(employee.getFoodTraining());
        morts.setSelected(employee.getMorts());
        pomodoros.setSelected(employee.getPomodoros());
        infusion.setSelected(employee.getInfusion());
        kateAndEmmas.setSelected(employee.getKateAndEmmas());
        doMundos.setSelected(employee.getDoMundos());
        
    }
    
    public boolean isOkClicked(){
        return okBtnStatus;
    }
    
    @FXML
    private void handleOK(){
        if(checkDataValid()){
            employee.setFirstName(firstName.getText());
            employee.setLastName(lastName.getText());
            
            employee.setEmployeeID(employeeID.getText());
            employee.setAddress(address.getText());
            employee.setPhonenumber(phoneNumber.getText());
            
            employee.setFoodTraining(foodSafetyTraining.isSelected());
            employee.setCashManagementTraining(cashManagementTraining.isSelected());
            employee.setHealthCode(healthCodeTraining.isSelected());
            employee.setMorts(morts.isSelected());
            employee.setPomodoros(pomodoros.isSelected());
            employee.setInfusion(infusion.isSelected());
            employee.setKateAndEmmas(kateAndEmmas.isSelected());
            employee.setDoMundos(doMundos.isSelected());
            
            okBtnStatus = true;
            dialogStage.close();
        }
    }
    
    @FXML
    private void handleClose(){
        dialogStage.close();
    }
    
    private boolean checkDataValid(){
        String errorMessage = "";
        
        if(firstName.getText() == null || firstName.getText().length() == 0){
            errorMessage += "Missing First Name!\n";
        }
        
        if(lastName.getText() == null || lastName.getText().length() == 0){
            errorMessage += "Missing Last Name!\n";
        }
        
        
        
        if(employeeID.getText() == null || employeeID.getText().length() == 0){
            errorMessage += "Missing Employee ID! \n";
        }
        
        if(address.getText() == null || address.getText().length() == 0){
            errorMessage += "Missing Address!\n";
        }
        
        if(phoneNumber.getText() == null || phoneNumber.getText().length() == 0)
        {
            errorMessage += "Missing Phone Number!\n";
        }
        
        
        
        if(errorMessage.length() == 0)
        {
            return true;
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields Detected");
            alert.setHeaderText("Please correct the following issues:");
            alert.setContentText(errorMessage);
            
            alert.showAndWait();
            
            return false;
        }
    }
}
