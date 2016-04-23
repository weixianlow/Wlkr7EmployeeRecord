/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeerecord;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;

import java.util.ResourceBundle;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.FileChooser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
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
    private Label address = new Label();
    
    @FXML
    private Label phoneNumber = new Label();
    
    @FXML
    private Label employeeID = new Label();
    
    
    
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
    
    @FXML
    private MenuItem toEmployee;
    
    @FXML
    private MenuItem toSupervisor;
    
    @FXML
    private MenuItem toManager;
    
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
            
            address.setText("-");
            phoneNumber.setText("-");
            employeeID.setText("-");
            
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
        
        address.setText(employee.getAddress());
        phoneNumber.setText(employee.getPhonenumber());
        employeeID.setText(employee.getEmployeeID());
        
        
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
            toEmployee.setDisable(true);
            toSupervisor.setDisable(false);
            toManager.setDisable(false);
        }else if(employee.getSupervisorStatus().equals(true))
        {
            employeeStatus.setText("Supervisor");
            toSupervisor.setDisable(true);
            toEmployee.setDisable(false);
            toManager.setDisable(false);
        }else if(employee.getManagerStatus().equals(true))
        {
            employeeStatus.setText("Manager");
            toManager.setDisable(true);
            toEmployee.setDisable(false);
            toSupervisor.setDisable(false);
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
        
        @FXML
        private void handleToSupervisor(){
            Wlkr7Employee employee = list.getSelectionModel().getSelectedItem();
            if(employee == null){
                Alert alert = new Alert(AlertType.ERROR);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("No Employee Selected");
                alert.setHeaderText("No Employee has been selected.");
                alert.setContentText("You have not selected an employee at the list on the left, please select and employee to promote/demote. ");
                
                alert.showAndWait();
            }else{
                employee.changeToSupervisorStatus();
                updateView(employee);
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("Employee has been Promoted/Demoted");
                alert.setHeaderText("Your request to promote/demote has been executed");
                alert.setContentText("Employee " + employee.getFirstName() + " has been promoted/demoted to Supervisor Status");
                
                alert.showAndWait();
            }
        }
        
        @FXML
        private void handleToManager(){
            Wlkr7Employee employee = list.getSelectionModel().getSelectedItem();
            if(employee == null){
                Alert alert = new Alert(AlertType.ERROR);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("No Employee Selected");
                alert.setHeaderText("No Employee has been selected.");
                alert.setContentText("You have not selected an employee at the list on the left, please select and employee to promote/demote. ");
                
                alert.showAndWait();
            }else{
                employee.changeToManagerStatus();
                updateView(employee);
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("Employee has been Promoted");
                alert.setHeaderText("Your request to promote has been executed");
                alert.setContentText("Employee " + employee.getFirstName() + " has been promoted to Manager status");
                
                alert.showAndWait();
            }
        }
        
        @FXML
        private void handleToEmployee(){
            Wlkr7Employee employee = list.getSelectionModel().getSelectedItem();
            if(employee == null){
                Alert alert = new Alert(AlertType.ERROR);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("No Employee Selected");
                alert.setHeaderText("No Employee has been selected.");
                alert.setContentText("You have not selected an employee at the list on the left, please select and employee to promote/demote. ");
                
                alert.showAndWait();
            }else{
                
                
                employee.changeToEmployeeStatus();
                updateView(employee);
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("Employee has been Demoted");
                alert.setHeaderText("Your request to demote has been executed");
                alert.setContentText("Employee " + employee.getFirstName() + " has been demoted to Employee Status");
                
                alert.showAndWait();
            }
        }
        
        @FXML
        private void handleAboutPage(){
            Alert alert = new Alert(AlertType.INFORMATION);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("About");
                alert.setHeaderText("Information about the program");
                alert.setContentText("This application is created by Wei Xian Low (WLKR7), a student at the University of Missouri - Columbia for CS3330 Object Oriented Programing Class' final project");
                
                alert.showAndWait();
        }
        
        @FXML
        private void handleDeleteEmployee(){
            int employee = list.getSelectionModel().getSelectedIndex();
            
            if(employee >= 0)
            {
                list.getItems().remove(employee);
                updateView(null);
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("Deletion Complete");
                alert.setHeaderText("Deletion has been executed");
                alert.setContentText("The employee's record has been deleted from the application.");
                
                alert.showAndWait();
                
            }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.initOwner(mainApp.getPrimaryStage());
                alert.setTitle("No Employee Selected");
                alert.setHeaderText("No Employee Selected Has Been Selected");
                alert.setContentText("You have not selected an employee's record to be deleted, please select an employee and try again.");

                alert.showAndWait();
            }
        }
        
        @FXML
        public void handleSave(){
            
            
            ObservableList<Wlkr7Employee> listToSave = mainApp.getPersonData();
            
            if(listToSave == null){
                System.out.println("error at reading listToSave");
                return;
            }
            
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showSaveDialog(mainApp.getPrimaryStage());
            
            JSONArray array = new JSONArray();
            JSONObject jsonObj;
            for(Wlkr7Employee e: listToSave){
                jsonObj = e.toJsonString();
                
                array.add(jsonObj);
            }
            
            
            
            
            
            if(file != null){
                try{
                    String jsonString = array.toJSONString();
                    System.out.println(jsonString);
                    PrintWriter out = new PrintWriter(file.getPath());
                    out.print(jsonString);
                    out.close();
                }catch(IOException ioex){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Exception Dialog");
                    alert.setHeaderText("Exception!");
                    alert.setContentText("Error writting to: "+ "file.getPath()");

                    // Create expandable Exception.
                    StringWriter sw = new StringWriter();
                    PrintWriter pw = new PrintWriter(sw);
                    ioex.printStackTrace(pw);
                    String exceptionText = sw.toString();

                    Label label = new Label("The exception stacktrace was:");

                    TextArea textArea = new TextArea(exceptionText);
                    textArea.setEditable(false);
                    textArea.setWrapText(true);

                    textArea.setMaxWidth(Double.MAX_VALUE);
                    textArea.setMaxHeight(Double.MAX_VALUE);
                    GridPane.setVgrow(textArea, Priority.ALWAYS);
                    GridPane.setHgrow(textArea, Priority.ALWAYS);

                    GridPane expContent = new GridPane();
                    expContent.setMaxWidth(Double.MAX_VALUE);
                    expContent.add(label, 0, 0);
                    expContent.add(textArea, 0, 1);

                    // Set expandable Exception into the dialog pane.
                    alert.getDialogPane().setExpandableContent(expContent);

                    alert.showAndWait();
                }
            }
        }
        
        
        @FXML
        public void handleOpen() throws IOException, Exception{
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());
            
            String jsonString = new String();
            if(file != null){
                try{
                    FileReader fileReader = new FileReader(file.getPath());
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    
                    
                    String inputLine;
                    while((inputLine = bufferedReader.readLine())!= null){
                        jsonString += inputLine;
                    }
                    bufferedReader.close();
                }catch(IOException ioex){
                    throw ioex;
                }
                
                System.out.println(jsonString);
                
                JSONArray array;
                try{
                    array = parseJsonArray(jsonString);
                }catch(Exception ex){
                    throw ex;
                }
                
                for(Object e: array){
                    try{
                        JSONObject employeeParsed = (JSONObject)e;
                        Wlkr7Employee employee = new Wlkr7Employee();
                        employee.initFromJsonString(employeeParsed.toJSONString());
                        mainApp.getPersonData().add(employee);
                    }catch(Exception ex){
                        throw ex;
                    }
                }
            }
        }
        
        public JSONArray parseJsonArray(String jsonString) throws Exception{
            JSONArray array;
            JSONParser parser = new JSONParser();
            try{
                array = (JSONArray)parser.parse(jsonString);
            }catch(Exception ex){
                throw ex;
            }
            
            if(array == null){
                return null;
            }else{
                return array;
            }
            
            
        }
                
        
        
        
        
}


