package com.example.inclassassignment07_jiaqiq;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    int age;
    int classNumber;
    boolean isGirl;
    String gender;

    public Student(String name, int age, boolean isGirl, int classNumber) {
        this.name = name;
        this.age = age;
        this.isGirl = isGirl;
        this.classNumber = classNumber;
        if (isGirl == true) {
            gender = "girl";
        } else {
            gender = "boy";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public boolean isGirl() {
        return isGirl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void setGirl(boolean girl) {
        isGirl = girl;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nClass: " + classNumber + "\n\n";
    }
}
