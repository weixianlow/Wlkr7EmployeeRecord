/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeetype.newpackage;

/**
 *
 * @author weixianlow
 */
public interface Manager {
    public void setManagerTraining(Boolean response);
    public Boolean getManagerTraining();
    public void setCrisisManagementTraining(Boolean response);
    public Boolean getCrisisManagementTraining();
    public void setSafeDepositTraining(Boolean response);
    public Boolean getSafeDepositTraining();
    public void setSchedulingTraining(Boolean response);
    public Boolean getSchedulingTraining();
}
