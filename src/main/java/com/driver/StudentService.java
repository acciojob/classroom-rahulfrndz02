package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void getStudentByCourse(String course){
        studentRepository.findStudentByCourse(course);
    }
    public void getStudentByRoll(int roll){
        studentRepository.findStudentByRoll(roll);
    }
    public void findTeacherBySubject(String subject){
        studentRepository.getTeacherBySubject(subject);
    }

    public void getSalaryByTeacher(double salary){
        studentRepository.getSalaryByTeacher(salary);
    }
    public void addStudent(Student student){
        studentRepository.saveStudent(student);
    }

    public void addTeacher(Teacher teacher){
        studentRepository.saveTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher){
        studentRepository.saveStudentTeacherPair(student, teacher);
    }
    public Student getStudentByName(String name){
        return studentRepository.findStudent(name);

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

    public List<String> findStudentByScore(double score){
        return studentRepository.findStudentByScore(score);
    }
}
