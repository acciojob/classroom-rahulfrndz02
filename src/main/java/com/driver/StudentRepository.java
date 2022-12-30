package com.driver;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class StudentRepository {
    private static HashMap<String, Student> studentDb;
    private static HashMap<String , Teacher> teacherDb;
    private static HashMap<String, List<String>> pairDb;

    public StudentRepository(){
        this.studentDb=new HashMap<>();
        this.teacherDb=new HashMap<>();
        this.pairDb=new HashMap<>();
    }

    public static void saveStudent(Student student){
        studentDb.put(student.getName(), student);
    }

    public static void saveTeacher(Teacher teacher){
        teacherDb.put(teacher.getName(), teacher);
    }

    public static void saveStudentTeacherPair(String movie, String Director){

        if(teacherDb.containsKey(Director) && studentDb.containsKey(movie)){
            List<String> currentStudents=new ArrayList<>();
            if(pairDb.containsKey(Director)){
                currentStudents=pairDb.get(Director);
                currentStudents.add(movie);
                pairDb.put(Director,currentStudents);
            }
        }
    }

    public static Student findStudent(String student){
        return  studentDb.get(student);
    }
    public static Teacher findTeacher(String teacher){
        return teacherDb.get(teacher);
    }

    public static List<String> findStudentByTeacherName(String teacher){
        List<String> studentList = new ArrayList<String>();
        if(pairDb.containsKey(teacher)) studentList = pairDb.get(teacher);
        return studentList;
    }
    public static List<String> findAllStudents(){
        return new ArrayList<>(studentDb.keySet());
    }

    public static void deleteTeacherByName(String teacher){
        List<String> students = new ArrayList<String>();
        if(pairDb.containsKey(teacher)){
            students = pairDb.get(teacher);
            for(String movie: students){
                if(studentDb.containsKey(movie)){
                    studentDb.remove(movie);
                }
            }

            pairDb.remove(teacher);
        }

        if(teacherDb.containsKey(teacher)){
            teacherDb.remove(teacher);
        }
    }

    public static void deleteAllTeachers() {
        HashSet<String> studentSet = new HashSet<String>();

        //directorMap = new HashMap<>();

        for (String teacher : pairDb.keySet()) {
            for (String student : pairDb.get(teacher)) {
                studentSet.add(student);
            }
        }

        for (String movie : studentSet) {
            if (studentDb.containsKey(movie)) {
                studentDb.remove(movie);
            }
        }


    }

}
