package com.springexample;
 
import javax.inject.Inject;
 
public class StudentHolder {
     
    /* Inject annotation wires the property byType by default */
    @Inject
    Student student;
     
    public Student getStudent() {
        return student;
    }
 
    public void setStudent(Student student) {
        this.student = student;
    }   
     
    public void displayStudentDetails(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student No: "+student.getStudentNo());
        System.out.println("Student Name: "+student.getStudentName());
    }
}