package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    int experience;

    public Driver(String initials, int age, String gender, String phoneNumber, int experience) {
        super(initials, age, gender, phoneNumber);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "This is a " + this.getGender() +"-driver called " + this.getInitials() + ", he/she is " + this.getAge() + ", has a phone number: " + this.getPhoneNumber() + " and is driving for " + this.experience +  " years";
    }
}
