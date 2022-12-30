package com.driver;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class StudentRepository {
    HashMap<String, Student> studentDb = new HashMap<>();
    HashMap<String , Teacher> teacherDb = new HashMap<>();
    HashMap<String, List<String>> pairDb = new HashMap<>();

//    public StudentRepository(){
//        this.studentDb=new HashMap<>();
//        this.teacherDb=new HashMap<>();
//        this.pairDb=new HashMap<>();
//    }

    public void saveStudent(Student student){
        studentDb.put(student.getName(), student);
    }

    public void saveTeacher(Teacher teacher){
        teacherDb.put(teacher.getName(), teacher);
    }

    public void saveStudentTeacherPair(String student, String teacher){

        List<String> studentList = pairDb.getOrDefault(teacher,new ArrayList<>());
        studentList.add(student);
        pairDb.put(teacher,studentList);
    }

    public Student findStudent(String student){
        return  studentDb.get(student);
    }
    public Teacher findTeacher(String teacher){
        return teacherDb.get(teacher);
    }

    public List<String> findStudentByTeacherName(String teacher){
        List<String> studentList = new ArrayList<String>();
        if(pairDb.containsKey(teacher)) studentList = pairDb.get(teacher);
        return studentList;
    }
    public List<String> findAllStudents(){
        return new ArrayList<>(studentDb.keySet());
    }

    public void deleteTeacherByName(String teacher){
        List<String> studentList = pairDb.get(teacher);
        for(String student : studentList){
            if(studentDb.containsKey(student)){
                studentDb.remove(student);
            }
        }
        pairDb.remove(teacher);
    }

    public void deleteAllTeachers() {
        for(String teacher : pairDb.keySet()){
            List<String> studentList = pairDb.get(teacher);
            for(String student : studentList){
                if(studentDb.containsKey(student)){
                    studentDb.remove(student);
                }
            }
        }
        pairDb.clear();
    }
}
