/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bostonchildcare.Model;

/**
 *
 * @author amarn
 */
public class Teacher_Model extends Person_Model{
    private int credits;

    public Teacher_Model(int credits, String fname, String lname, int age) {
        super(fname, lname, age);
        this.credits = credits;
    }
    
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
