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
public class Wlkr7Employee extends Wlkr7BasicInfo {
    
    public Wlkr7Employee(String firstName, String lastName, SimpleDateFormat birthdate, String address, String phoneNumber, SimpleDateFormat dateJoined, String employeeID) {
        super(firstName, lastName, birthdate, address, phoneNumber, dateJoined, employeeID);
    }
    
}
