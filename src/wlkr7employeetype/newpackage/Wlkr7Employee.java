/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeetype.newpackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author weixianlow
 */
public class Wlkr7Employee extends Wlkr7BasicInfo implements Wlkr7Training{

    private Boolean cashManagementTraining;
    private Boolean healthCode;
    private Boolean foodTraining;
    public Wlkr7Employee(String firstName, String lastName, LocalDate birthdate, String address, String phoneNumber, LocalDate dateJoined, String employeeID) {
        super(firstName, lastName, birthdate, address, phoneNumber, dateJoined, employeeID);
        super.setEmployeeStatus(true);
    }
    
    public Wlkr7Employee(){
        super.setEmployeeStatus(true);
        cashManagementTraining = false;
        healthCode = false;
        foodTraining = false;
    }

    @Override
    public void setFoodTraining(Boolean input) {
        foodTraining = input;
    }

    @Override
    public void setCashManagementTraining(Boolean input) {
        cashManagementTraining = input;
    }

    @Override
    public void setHealthCode(Boolean input) {
        healthCode = input;
    }

    @Override
    public Boolean getFoodTraining() {
        return foodTraining;
    }

    @Override
    public Boolean getCashManagementTraining() {
        return cashManagementTraining;
    }

    @Override
    public Boolean getHealthCode() {
        return healthCode;
    }

    
    
}
