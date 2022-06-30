package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    int experience;

    public Driver(String initials, int age, String gender, String phoneNumber, int experience) {
        super(initials, age, gender, phoneNumber);
        this.experience = experience;
    }

}
