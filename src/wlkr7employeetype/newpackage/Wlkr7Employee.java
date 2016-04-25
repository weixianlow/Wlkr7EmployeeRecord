/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeetype.newpackage;


import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


/**
 *
 * @author weixianlow
 */
public class Wlkr7Employee extends Wlkr7BasicInfo implements Wlkr7Training{

    private Boolean cashManagementTraining;
    private Boolean healthCode;
    private Boolean foodTraining;
    
    
    public Wlkr7Employee(){
        super.changeToEmployeeStatus();
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

    public JSONObject toJsonString(){
        JSONObject obj = new JSONObject();
        obj.put("firstName", super.getFirstName());
        obj.put("lastName", super.getLastName());
        
        obj.put("address", super.getAddress());
        obj.put("phoneNumber", super.getPhonenumber());
        
        obj.put("employeeID", super.getEmployeeID());
        obj.put("morts", super.getMorts().toString());
        obj.put("doMundos", super.getDoMundos().toString());
        obj.put("infusion", super.getInfusion().toString());
        obj.put("kateAndEmmas", super.getKateAndEmmas().toString());
        obj.put("pomodoros", super.getPomodoros().toString());
        obj.put("employee", super.getEmployeeStatus().toString());
        obj.put("supervisor", super.getSupervisorStatus().toString());
        obj.put("manager", super.getManagerStatus().toString());
        obj.put("cashManagementTraining", cashManagementTraining.toString());
        obj.put("healthCode", healthCode.toString());
        obj.put("foodTraining", foodTraining.toString());
        
        System.out.println(obj.toJSONString());
        return obj;
        
    }
    
    public void initFromJsonString(String jsonString){
        if(jsonString == null || jsonString.equals("")){
            return;
        }
        System.out.println("Passed First Test");
        System.out.println(jsonString);
        
        JSONObject jsonObj;
        try{
            jsonObj = (JSONObject)JSONValue.parse(jsonString);
        }catch(Exception ex){
            return;
        }
       
        
        System.out.println("Parse Complete");
        
        if(jsonObj == null){
            return;
        }
        
        System.out.println("Checking of jsonObj is not null");
        
        String buffer = "";
        super.setFirstName((String)jsonObj.get("firstName"));
        System.out.println(super.getFirstName());
        super.setLastName((String)jsonObj.get("lastName"));
        
        super.setAddress((String)jsonObj.get("address"));
        super.setPhonenumber((String)jsonObj.get("phoneNumber"));
        
        super.setEmployeeID((String)jsonObj.get("employeeID"));
        
        buffer = (String)jsonObj.get("morts");
        if(buffer.equals("true"))
        {
            super.setMorts(true);
        }else{
            super.setMorts(false);
        }
        
        buffer = (String)jsonObj.get("doMundos");
        if(buffer.equals("true"))
        {
            super.setDoMundos(true);
        }else{
            super.setDoMundos(false);
        }
        
        buffer = (String)jsonObj.get("infusion");
        if(buffer.equals("true"))
        {
            super.setInfusion(true);
        }else{
            super.setInfusion(false);
        }
        
        buffer = (String)jsonObj.get("kateAndEmmas");
        if(buffer.equals("true"))
        {
            super.setKateAndEmmas(true);
        }else{
            super.setKateAndEmmas(false);
        }
        
        buffer = (String)jsonObj.get("pomodoros");
        if(buffer.equals("true"))
        {
            super.setPomodoros(true);
        }else{
            super.setPomodoros(false);
        }
        
        buffer = (String)jsonObj.get("cashManagementTraining");
        if(buffer.equals("true"))
        {
            cashManagementTraining = true;
        }else{
            cashManagementTraining = false;
        }
        
        buffer = (String)jsonObj.get("healthCode");
        if(buffer.equals("true"))
        {
            healthCode = true;
        }else{
            healthCode = false;
        }
        
        buffer = (String)jsonObj.get("foodTraining");
        if(buffer.equals("true"))
        {
            foodTraining = true;
        }else{
            foodTraining = false;
        }
        
        buffer = (String)jsonObj.get("employee");
        if(buffer.equals("true"))
        {
            super.changeToEmployeeStatus();
        }
        
        buffer = (String)jsonObj.get("supervisor");
        if(buffer.equals("true"))
        {
            super.changeToSupervisorStatus();
        }
        
        buffer = (String)jsonObj.get("manager");
        if(buffer.equals("true"))
        {
            super.changeToManagerStatus();
        }
        
        
    }
    
}
