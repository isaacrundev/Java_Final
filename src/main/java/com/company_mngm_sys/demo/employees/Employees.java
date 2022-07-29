package com.company_mngm_sys.demo.employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//pojo
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // tableになる
    private long employeeID;  
    private int firstName;
    private boolean lastName;
    private String email;
    private String gender;
    private String password;  //後で

    public Employees() {
    }

    // (constractor)IDは自動で作られる
    public Employees(int firstName, boolean lastName, String email, String gender, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public boolean isLastName() {
        return lastName;
    }

    public void setLastName(boolean lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
