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
public class Student_Model extends Person_Model {
    private String pfname;
    private String plname;
    private String contact;
    
    public Student_Model(){
        super();
    }
    
    public Student_Model(String fname,String lname,int age,String pfname,String plname,String contact){
        super(fname,lname,age);
        this.pfname = pfname;
        this.plname = plname;
        this.contact = contact;
    }
    
    //to implement getters and setters 

    public String getPfname() {
        return pfname;
    }

    public void setPfname(String pfname) {
        this.pfname = pfname;
    }

    public String getPlname() {
        return plname;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
}
