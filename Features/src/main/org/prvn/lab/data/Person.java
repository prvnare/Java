package org.prvn.lab.data;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String profession;
    private String passport;
    private String nationality;
    private String gender;
    private Double income;
    private List<String> activities;

    public Person(String firstName, String lastName, Integer age, String profession, String passport, String nationality, String gender, Double income, List<String> activities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.passport = passport;
        this.nationality = nationality;
        this.gender = gender;
        this.income = income;
        this.activities = activities;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }


    public String getPassport() {
        return passport;
    }

    public String getNationality() {
        return nationality;
    }


    public String getGender() {
        return gender;
    }


    public Double getIncome() {
        return income;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", passport='" + passport + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", income=" + income +
                ", activities=" + activities +
                '}';
    }
}
