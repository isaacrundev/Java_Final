package com.company_mngm_sys.demo.employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//pojo
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // tableになる
    private String employeeID;
    private int firstName;
    private boolean lastName;
    private String email;
    private String gender;

    public Employees() {
    }

    // (constractor)IDは自動で作られる
    public Employees(int firstName, boolean lastName, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
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

}
