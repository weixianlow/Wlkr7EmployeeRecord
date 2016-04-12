/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeetype.newpackage;

import java.text.SimpleDateFormat;

/**
 *
 * @author weixianlow
 */
public abstract class Wlkr7Employee implements BasicTraining{
    
    private String firstName;
    private String lastName;
    private SimpleDateFormat birthdate;
    private String address;
    private String phoneNumber;
    private SimpleDateFormat dateJoined;
    private String employeeID;
    
    
    public Wlkr7Employee(String firstName, String lastName, SimpleDateFormat birthdate, String address,String phoneNumber, SimpleDateFormat dateJoined, String employeeID)
    {
     this.firstName = firstName;
     this.lastName = lastName;
     this.birthdate = birthdate;
     this.address = address;
     this.phoneNumber = phoneNumber;
     this.dateJoined = dateJoined;
     this.employeeID = employeeID;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setBirthdate(SimpleDateFormat birthdate){
        this.birthdate = birthdate;
    }
    
    public SimpleDateFormat getBirthdate(){
        return birthdate;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setPhonenumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhonenumber(){
        return phoneNumber;
    }
    
    public void setDateJoined(SimpleDateFormat dateJoined){
        this.dateJoined = dateJoined;
    }
    
    public SimpleDateFormat getDateJoined()
    {
        return dateJoined;
    }
    
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    
    public String getEmployeeID()
    {
        return employeeID;
    }

    
    
}
