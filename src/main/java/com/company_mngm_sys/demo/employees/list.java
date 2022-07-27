package com.company_mngm_sys.demo.employees;

//pojoを作る
public class list {
    private String fullName;
    private int age;
    private boolean employeed;
    private String gender;

    // default constractor
    public list() {
    }

    // paramitarised constractor
    public list(String fullName, int age, boolean employeed, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.employeed = employeed;
        this.gender = gender;
    }

    //getter and setter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployeed() {
        return employeed;
    }

    public void setEmployeed(boolean employeed) {
        this.employeed = employeed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
