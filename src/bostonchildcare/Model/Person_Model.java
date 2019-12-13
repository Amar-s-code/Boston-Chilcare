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
public class Person_Model {
    private String fname;
    private String lname;
    private int age;
    
    public Person_Model(){
    }

    public Person_Model(String fname,String lname,int age){
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
