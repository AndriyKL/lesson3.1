package com.company.entities;

public class Person {
    String initials;
    int age;
    String gender;
    String phoneNumber;

    public Person(String initials, int age, String gender, String phoneNumber) {
        this.initials = initials;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "This is a " + this.gender +" called " + this.initials + " and he/she is " + this.age + " and has a phone number: " + this.phoneNumber;
    }
}
