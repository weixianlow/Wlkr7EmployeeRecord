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
import javafx.scene.control.Label;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import wlkr7employeetype.newpackage.Wlkr7Employee;



/**
 * FXML Controller class
 *
 * @author weixianlow
 */
public class MainPageController implements Initializable {

    
    @FXML
    private TableView<Wlkr7Employee> list = new TableView();
    
    @FXML
    private TableColumn<Wlkr7Employee, String> firstNameColumn;
    
    @FXML
    private TableColumn<Wlkr7Employee, String> lastNameColumn;
    
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
    private Label employeeStatus = new Label();
    
    private Wlkr7EmployeeRecord mainApp;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        
        updateView(null);
        
        list.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> updateView(newValue));
        
    }   
    
    public void setMainApplication(Wlkr7EmployeeRecord mainApp){
        this.mainApp = mainApp;
        
        list.setItems(mainApp.getPersonData());
    }
    

    
    
    
    
    public void updateView(Wlkr7Employee employee){
        
        if(employee == null){
            firstName.setText("-");
            lastName.setText("-");
            birthDate.setText("-");
            address.setText("-");
            phoneNumber.setText("-");
            employeeID.setText("-");
            dateJoined.setText("-");
            infusions.setText("-");
            morts.setText("-");
            doMundos.setText("-");
            pomodoro.setText("-");
            kateAndEmmas.setText("-");
            cashManagement.setText("-");
            healthCode.setText("-");
            foodTraining.setText("-");
            employeeStatus.setText("-");
        }else{
        
        firstName.setText(employee.getFirstName());
        lastName.setText(employee.getLastName());
        birthDate.setText(DateHandleParsing.format(employee.getBirthdate()));
        address.setText(employee.getAddress());
        phoneNumber.setText(employee.getPhonenumber());
        employeeID.setText(employee.getEmployeeID());
        dateJoined.setText(DateHandleParsing.format(employee.getDateJoined()));
        
        if(employee.getInfusion() != null){
        switch (employee.getInfusion().toString()) {
            case "true":
                infusions.setText("Yes");
                break;
            case "false":
                infusions.setText("No");
                break;
            default:
                infusions.setText("Not Defined");
                break;
        }
        }else{
            infusions.setText("Not Defined");
        }
        if(employee.getMorts() != null){
            switch (employee.getMorts().toString()) {
                case "true":
                    morts.setText("Yes");
                    break;
                case "false":
                    morts.setText("No");
                    break;
                default:
                    morts.setText("Not Defined");
                    break;
            }
        }else{
            morts.setText("Not Defined");
        }
        
        if(employee.getKateAndEmmas() != null){
        switch (employee.getKateAndEmmas().toString()) {
            case "true":
                kateAndEmmas.setText("Yes");
                break;
            case "false":
                kateAndEmmas.setText("No");
                break;
            default:
                kateAndEmmas.setText("Not Defined");
                break;
        }
        }else{
            kateAndEmmas.setText("Not Defined");
        }
        
        if(employee.getDoMundos() != null){
            switch (employee.getDoMundos().toString()) {
            case "true":
                doMundos.setText("Yes");
                break;
            case "false":
                doMundos.setText("No");
                break;
            default:
                doMundos.setText("Not Defined");
                break;
            }
        }else{
            doMundos.setText("Not Defined");
        }
        
        if(employee.getPomodoros() != null){
        switch (employee.getPomodoros().toString()) {
            case "true":
                pomodoro.setText("Yes");
                break;
            case "false":
                pomodoro.setText("No");
                break;
            default:
                pomodoro.setText("Not Defined");
                break;
        }
        }
        else{
            pomodoro.setText("Not Defined");
        }
        
        if(employee.getFoodTraining() != null){

        switch (employee.getFoodTraining().toString()) {
            case "true":
                foodTraining.setText("Yes");
                break;
            case "false":
                foodTraining.setText("No");
                break;
            default:
                foodTraining.setText("Not Defined");
                break;
        }
        }else{
            foodTraining.setText("Not Defined");
        }
        
        if(employee.getHealthCode() != null){
        switch (employee.getHealthCode().toString()) {
            case "true":
                healthCode.setText("Yes");
                break;
            case "false":
                healthCode.setText("No");
                break;
            default:
                healthCode.setText("Not Defined");
                break;
        }
        }else{
             healthCode.setText("Not Defined");
        }
        
        if(employee.getCashManagementTraining() != null){
        switch (employee.getCashManagementTraining().toString()) {
            case "true":
                cashManagement.setText("Yes");
                break;
            case "false":
                cashManagement.setText("No");
                break;
            default:
                cashManagement.setText("Not Defined");
                break;
        }
        }else{
             cashManagement.setText("Not Defined");
        }
        
        if(employee.getEmployeeStatus().equals(true))
        {
            employeeStatus.setText("Employee");
        }else if(employee.getSupervisorStatus().equals(true))
        {
            employeeStatus.setText("Supervisor");
        }else if(employee.getManagerStatus().equals(true))
        {
            employeeStatus.setText("Manager");
        }else{
            employeeStatus.setText("Not Defined");
        }
        
        
        } 
        }
    
        @FXML
        private void handleEditPerson() throws Exception{
            Wlkr7Employee selectedEmployee = list.getSelectionModel().getSelectedItem();
            if(selectedEmployee != null){
                boolean okBtnClick = mainApp.showEditDialog(selectedEmployee);
                if(okBtnClick ){
                    updateView(selectedEmployee);
                }
            }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("No Employee Selected");
                alert.setHeaderText("No Employee has been selected.");
                alert.setContentText("You have not selected an employee at the list on the left, please select and employee to edit. ");
                
                alert.showAndWait();
            }
        }
        
        @FXML
        private void handleNewPerson() throws Exception{
            Wlkr7Employee employeeTemp = new Wlkr7Employee();
            boolean okBtnClick = mainApp.showEditDialog(employeeTemp);
                if(okBtnClick ){
                    mainApp.getPersonData().add(employeeTemp);
                    
                }
        }
        
        
        
}


