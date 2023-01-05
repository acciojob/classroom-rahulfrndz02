package com.driver;

public class Student {

    private String name;
    private int age;
    private double averageScore;
    private String course;
    private int rollNumber;
    private double score;

    public Student(){

    }

    public Student(String name, int age, double averageScore, String course, int rollNumber, double score) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.course = course;
        this.rollNumber = rollNumber;
        this.score = score;
    }



    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
