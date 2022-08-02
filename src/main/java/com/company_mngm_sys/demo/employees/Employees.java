package com.company_mngm_sys.demo.employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // A logical grouping of data in rows and columns
// pojo
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // tableになる
    private long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private int birthday;

    // @OneToMany
    // private List<Employees> employees;
    // private List<Employees> employees;

    public Employees() {
    }

    public Employees(String firstName, String lastName, String email, String gender, int birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;

        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

}
