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
public class Wlkr7Supervisor extends Wlkr7Employee implements Supervisor{
    
    private Boolean supervisorTraining;
    private Boolean crisisManagementTraining;
    
    public Wlkr7Supervisor(String firstName, String lastName, SimpleDateFormat birthdate, String address, String phoneNumber, SimpleDateFormat dateJoined, String employeeID) {
        super(firstName, lastName, birthdate, address, phoneNumber, dateJoined, employeeID);
    }

    @Override
    public void setSupervisorTraining(Boolean response) {
        supervisorTraining = response;
    }

    @Override
    public Boolean getSupervisorTraining() {
        return supervisorTraining;
    }

    @Override
    public void setCrisisManagementTraining(Boolean response) {
        crisisManagementTraining = response;
    }

    @Override
    public Boolean getCrisisManagementTraining(Boolean response) {
        return crisisManagementTraining;
    }
    
}
