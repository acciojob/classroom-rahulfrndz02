package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.saveStudent(student);
    }

    public void addTeacher(Teacher teacher){
        studentRepository.saveTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher){
        studentRepository.saveStudentTeacherPair(student, teacher);
    }
    public Student getStudentByName(String movie){
        return studentRepository.findStudent(movie);

    }

    public Teacher getTeacherByName(String teacherName){
        return studentRepository.findTeacher(teacherName);
    }

    public List<String> getStudentsByTeacherName(String teacher){
        return studentRepository.findStudentByTeacherName(teacher);
    }

    public List<String> getAllStudents(){
        return studentRepository.findAllStudents();
    }

    public void deleteTeacherByName(String teacher){
        studentRepository.deleteTeacherByName(teacher);
    }

    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
}
