/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bostonchildcare.Controller;

import Helpers.FieldValidator;
import Helpers.StudentEnrollmentForm_Validation_Helper;
import bostonchildcare.Model.Student_Model;
import bostonchildcare.View.StudentEnrollmentForm_View;
import bostonchildcare.View.Student_Teacher_Selection_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author amarn
 */
public class StudentEnrollmentForm_Controller{
    private final StudentEnrollmentForm_View studenroll_view;
    private Student_Teacher_Selection_View st_view;
    private Student_Model stud;
    private static final StudentEnrollmentForm_Controller instance = new StudentEnrollmentForm_Controller();

    private StudentEnrollmentForm_Controller( ) {
        this.studenroll_view = StudentEnrollmentForm_View.getInstance();
        studenroll_view.getSubmit_button().addActionListener(l->saveStudentEnrollment_detail());

    }
    
    public static StudentEnrollmentForm_Controller getInstance(){
        return instance;
    }
    
    public void initController(){
        studenroll_view.setVisible(true);
        st_view = Student_Teacher_Selection_View.getinstance();
        studenroll_view.getSage_field().setValue("");
        studenroll_view.getSfname_field().setText("");
        studenroll_view.getSlname_field().setText("");
        studenroll_view.getPfname_field().setText("");
        studenroll_view.getPlname_field().setText("");
        studenroll_view.getContact_field().setText("");
    }
    
    public void saveStudentEnrollment_detail(){
        
            if(StudentEnrollmentForm_Validation_Helper.validate_form(studenroll_view)){         // a general check to see if all the fields are not empty , if so use the details to create a new student object and save details to it
                stud = new Student_Model();
                if(!FieldValidator.age_validator(Integer.valueOf((studenroll_view.getSage_field().getText().trim().isEmpty())?"0":studenroll_view.getSage_field().getText()))){      //proper age range check
                JOptionPane.showMessageDialog(null,"The age should be within 72 months","Error",JOptionPane.ERROR_MESSAGE);
                studenroll_view.setVisible(false);
                st_view.setVisible(true);
                }else{
                int age = Integer.valueOf(studenroll_view.getSage_field().getText());
                stud.setAge(age);
                }
                if(!FieldValidator.email_Validation(studenroll_view.getContact_field().getText())){                //formatting of e-mail check
                JOptionPane.showMessageDialog(null,"The contact email is not properly formatted","Error",JOptionPane.ERROR_MESSAGE);
                studenroll_view.setVisible(false);
                st_view.setVisible(true);
            
                }else{
                stud.setContact(studenroll_view.getContact_field().getText());
                }
                
                stud.setFname(studenroll_view.getSfname_field().getText());
                stud.setLname(studenroll_view.getSlname_field().getText());
                stud.setPfname(studenroll_view.getPfname_field().getText());
                stud.setPlname(studenroll_view.getPlname_field().getText());
                studenroll_view.setVisible(false);
                st_view.setVisible(true);
            }
            
            
        
    }


    
}
