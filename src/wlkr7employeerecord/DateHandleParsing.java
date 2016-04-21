/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wlkr7employeerecord;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author weixianlow
 */
public class DateHandleParsing {
    
    private static final String DATE_PATTERN = "MM.dd.yyyy";
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
    
    public static String format(LocalDate date){
        if(date == null){
            return null;
        }else{
            return DATE_FORMATTER.format(date);
        }
    }
    
    
    public static LocalDate parsing(String dateString){
        try{
            return DATE_FORMATTER.parse(dateString, LocalDate::from);
        }catch(DateTimeParseException e){
            return null;
        }
    }
    
    public static boolean validDate(String dateString){
        return DateHandleParsing.parsing(dateString)!= null;
    }
}
