/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeetype.newpackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author weixianlow
 */
public abstract class Wlkr7BasicInfo {
    
    private StringProperty firstName;
    private StringProperty lastName;
    private ObjectProperty<LocalDate> birthdate;
    private StringProperty address;
    private StringProperty phoneNumber;
    private ObjectProperty<LocalDate> dateJoined;
    private StringProperty employeeID;
    private Boolean morts;
    private Boolean doMundos;
    private Boolean infusion;
    private Boolean kateAndEmmas;
    private Boolean pomodoros;
    private Boolean employee;
    private Boolean supervisor;
    private Boolean manager;
    
    
    public Wlkr7BasicInfo(){
        this.firstName = new SimpleStringProperty(null);
     this.lastName = new SimpleStringProperty(null);
     this.birthdate = new SimpleObjectProperty<LocalDate>(null);
     this.address = new SimpleStringProperty(null);
     this.phoneNumber = new SimpleStringProperty(null);
     this.dateJoined = new SimpleObjectProperty<LocalDate>(null);
     this.employeeID = new SimpleStringProperty(null);
     this.morts = false;
     this.doMundos = false;
     this.infusion = false;
     this.kateAndEmmas = false;
     this.pomodoros = false;
     this.employee = true;
     this.supervisor = false;
     this.manager = false;
        
    }
    public Wlkr7BasicInfo(String firstName, String lastName, LocalDate birthdate, String address,String phoneNumber, LocalDate dateJoined, String employeeID)
    {
     this.firstName = new SimpleStringProperty(firstName);
     this.lastName = new SimpleStringProperty(lastName);
     this.birthdate = new SimpleObjectProperty<LocalDate>(birthdate);
     this.address = new SimpleStringProperty(address);
     this.phoneNumber = new SimpleStringProperty(phoneNumber);
     this.dateJoined = new SimpleObjectProperty<LocalDate>(dateJoined);
     this.employeeID = new SimpleStringProperty(employeeID);
    }
    public StringProperty firstNameProperty(){
        return firstName;
    }
    
    public StringProperty lastNameProperty(){
        return lastName;
    }
    
    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }
    
    public String getFirstName(){
        return firstName.get();
    }
    
    public void setLastName(String lastName){
        this.lastName.set(lastName);
    }
    
    public String getLastName(){
        return lastName.get();
    }
    public ObjectProperty<LocalDate> birthDateProperty(){
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate){
        this.birthdate.set(birthdate);
    }
    
    public LocalDate getBirthdate(){
        return birthdate.get();
    }
    
    public StringProperty addressProperty(){
        return address;
    }
    
    public void setAddress(String address){
        this.address.set(address);
    }
    
    public String getAddress(){
        return address.get();
    }
    public StringProperty phoneNumberProperty(){
        return phoneNumber;
    }
    public void setPhonenumber(String phoneNumber){
        this.phoneNumber.set(phoneNumber);
    }
    
    public String getPhonenumber(){
        return phoneNumber.get();
    }
    public ObjectProperty<LocalDate> dateJoinedProperty(){
        return dateJoined;
    }
    public void setDateJoined(LocalDate dateJoined){
        this.dateJoined.set(dateJoined);
    }
    
    public LocalDate getDateJoined()
    {
        return dateJoined.get();
    }
    
    public StringProperty employeeID(){
        return employeeID;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID.set(employeeID);
    }
    
    public String getEmployeeID()
    {
        return employeeID.get();
    }
    
    public void setMorts(Boolean response)
    {
        morts = response;
    }
   
    
    public Boolean getMorts()
    {
        return morts;
    }
    
    public void setDoMundos(Boolean response)
    {
        doMundos = response;
    }
    
    public Boolean getDoMundos()
    {
        return doMundos;
    }
    
    public void setInfusion(Boolean response)
    {
        infusion = response;
    }
    
    public Boolean getInfusion()
    {
        return infusion;
    }
    
    public void setPomodoros(Boolean response)
    {
        pomodoros = response; 
    }
    
    public Boolean getPomodoros()
    {
        return pomodoros;
    }
    
    public void setKateAndEmmas(Boolean response)
    {
        kateAndEmmas = response;
    }
    
    public Boolean getKateAndEmmas()
    {
        return kateAndEmmas;
    }
    
    public void changeToEmployeeStatus(){
        employee = true;
        supervisor = false;
        manager = false;
    }
    
    public Boolean getEmployeeStatus()
    {
        return employee;
    }
    
    public void changeToSupervisorStatus(){
        employee = false;
        supervisor = true;
        manager = false;
    }
    
    public Boolean getSupervisorStatus(){
        return supervisor;
    }
    
    public void changeToManagerStatus(){
        employee = false;
        supervisor = false;
        manager = true;
    }
    
    public Boolean getManagerStatus(){
        return manager;
    }
    
    

    
    
}
