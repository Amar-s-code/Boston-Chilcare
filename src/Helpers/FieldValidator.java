/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author amarn
 */
public class FieldValidator {
    //method to check email id field(contact) pattern validation
    public static boolean email_Validation(String email){
    
        String email_Pattern = "^(.+)@(.+)$";
        Pattern pattern  = Pattern.compile(email_Pattern);
        Matcher matcher  = pattern.matcher(email);
   
        return matcher.matches();
    }
    
    public static boolean age_validator(int age){
        if(age>0&&age<73){
        return true;
        }else{
        return false;
        }
    }
}
