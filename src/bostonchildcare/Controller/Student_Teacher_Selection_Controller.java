/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bostonchildcare.Controller;
import bostonchildcare.View.Student_Teacher_Selection_View;
/**
 *
 * @author amarn
 */
public class Student_Teacher_Selection_Controller {
    private final Student_Teacher_Selection_View st_selection_view;
    private StudentEnrollmentForm_Controller s_enrollment_cont;

    public Student_Teacher_Selection_Controller() {
        this.st_selection_view = Student_Teacher_Selection_View.getinstance();
    }
    
    public void initController(){
     st_selection_view.getNew_student_enrollment_button().setVisible(false);
     st_selection_view.getExisting_student_button().setVisible(false);
     st_selection_view.getStudent_pane_button().addActionListener(l->show_student_buttons());
     st_selection_view.getNew_student_enrollment_button().addActionListener(l->show_new_enrollment_page());
     st_selection_view.setVisible(true);
    }

//    public Student_Teacher_Selection_View getSt_selection_view() {
//        return st_selection_view;
//    }
//
//    public void setSt_selection_view(Student_Teacher_Selection_View st_selection_view) {
//        this.st_selection_view = st_selection_view;
//    }
   
    public void show_student_buttons(){
        st_selection_view.getNew_student_enrollment_button().setVisible(true);
        st_selection_view.getExisting_student_button().setVisible(true);
    }
    
   public void show_new_enrollment_page(){
       st_selection_view.setVisible(false);
       s_enrollment_cont = StudentEnrollmentForm_Controller.getInstance();
       s_enrollment_cont.initController();
       
   }
    
}
