/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bostonchildcare.Model;

import java.util.List;

/**
 *
 * @author amarn
 */
public class ClassRoom_Model {
    private int ageGroup;
    private int capacity;
    private List<Teacher_Model> teachers;
    private List<Student_Model> students;
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

   public void addTeacher(Teacher_Model t){
       this.teachers.add(t);
   }
   
   public void addStudent(Student_Model s){
       this.students.add(s);
   }
   
}
