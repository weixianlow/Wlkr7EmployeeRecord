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
public class Wlkr7Manager extends Wlkr7Employee implements Manager {
    
    private Boolean managerTraining;
    private Boolean crisisManagementTraining;
    private Boolean safeDepositTraining;
    private Boolean schedulingTraining;

    public Wlkr7Manager(String firstName, String lastName, SimpleDateFormat birthdate, String address, String phoneNumber, SimpleDateFormat dateJoined, String employeeID) {
        super(firstName, lastName, birthdate, address, phoneNumber, dateJoined, employeeID);
    }

    @Override
    public void setManagerTraining(Boolean response) {
        managerTraining = response;
    }

    @Override
    public Boolean getManagerTraining() {
        return managerTraining;
    }

    @Override
    public void setCrisisManagementTraining(Boolean response) {
        crisisManagementTraining = response;
    }

    @Override
    public Boolean getCrisisManagementTraining() {
        return crisisManagementTraining;
    }

    @Override
    public void setSafeDepositTraining(Boolean response) {
        safeDepositTraining = response;
    }

    @Override
    public Boolean getSafeDepositTraining() {
        return safeDepositTraining;
    }

    @Override
    public void setSchedulingTraining(Boolean response) {
        schedulingTraining = response;
    }

    @Override
    public Boolean getSchedulingTraining() {
        return schedulingTraining;
    }

    
    
}
