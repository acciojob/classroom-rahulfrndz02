package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public static void addStudent(Student student){
        StudentRepository.saveStudent(student);
    }

    public static void addTeacher(Teacher teacher){
        StudentRepository.saveTeacher(teacher);
    }

    public static void addStudentTeacherPair(String student, String teacher){
        StudentRepository.saveStudentTeacherPair(student, teacher);
    }
    public static Student getStudentByName(String movie){
        return StudentRepository.findStudent(movie);

    }

    public static Teacher getTeacherByName(String teacherName){
        return StudentRepository.findTeacher(teacherName);
    }

    public static List<String> getStudentsByTeacherName(String teacher){
        return StudentRepository.findStudentByTeacherName(teacher);
    }

    public static List<String> getAllStudents(){
        return StudentRepository.findAllStudents();
    }

    public static void deleteTeacherByName(String teacher){
        StudentRepository.deleteTeacherByName(teacher);
    }

    public static void deleteAllTeachers(){
        StudentRepository.deleteAllTeachers();
    }
}
