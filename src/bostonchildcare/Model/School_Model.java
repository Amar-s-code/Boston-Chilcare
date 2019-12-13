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
public class School_Model {
   private List<ClassRoom_Model> classrooms;

    public School_Model(List<ClassRoom_Model> classrooms) {
        this.classrooms = classrooms;
    }
}
