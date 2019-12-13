/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bostonchildcare;

import bostonchildcare.Controller.StudentEnrollmentForm_Controller;
import bostonchildcare.Model.Student_Model;
import bostonchildcare.View.StudentEnrollmentForm_View;
import bostonchildcare.View.Student_Teacher_Selection_View;
import bostonchildcare.Controller.Student_Teacher_Selection_Controller;


/**
 *
 * @author amarn
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //StudentEnrollmentForm_View view = new StudentEnrollmentForm_View();
        //view.setVisible(true);
        //Student_Teacher_Selection_View sview = new Student_Teacher_Selection_View();
        Student_Teacher_Selection_Controller scont = new Student_Teacher_Selection_Controller();
        scont.initController();
        //StudentEnrollmentForm_Controller senrcont = new StudentEnrollmentForm_Controller();
        //senrcont.initController();
        //sview.getNew_student_enrollment_button().setVisible(false);
        //sview.getExisting_student_button().setVisible(false);
        //Student_Model stu = new Student_Model();
        //StudentEnrollmentForm_Controller contrl = new StudentEnrollmentForm_Controller(view, stu);
        //contrl.initController();
    }
    
}
