/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import bostonchildcare.View.StudentEnrollmentForm_View;
import javax.swing.JOptionPane;

/**
 *
 * @author amarn
 */
public class StudentEnrollmentForm_Validation_Helper {
    public static boolean validate_form(StudentEnrollmentForm_View enroll_view){
        if(!enroll_view.getSfname_field().getText().isEmpty()||!enroll_view.getSlname_field().getText().isEmpty()||                                                          //checks if the any of the field is empty
                !enroll_view.getPfname_field().getText().isEmpty()||!enroll_view.getPlname_field().getText().isEmpty()||!enroll_view.getSage_field().getText().trim().isEmpty()||!enroll_view.getContact_field().getText().isEmpty()){
        return true;
        }else{
        JOptionPane.showMessageDialog(null,"Some fields are blank", "Error",JOptionPane.ERROR_MESSAGE);
        return false;
        } 
    }
}
