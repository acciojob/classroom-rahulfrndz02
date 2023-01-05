package com.driver;

public class Teacher {

    private String name;
    private int numberOfStudents;
    private int age;
    private String subTeacher;
    private double salary;

    public Teacher() {

    }

    public Teacher(String name, int numberOfStudents, int age, String subTeacher, double salary) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
        this.subTeacher= subTeacher;
        this.salary= salary;
    }

    public String getSubTeacher() {
        return subTeacher;
    }

    public void setSubTeacher(String subTeacher) {
        this.subTeacher = subTeacher;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}