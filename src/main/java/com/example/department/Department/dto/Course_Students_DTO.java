package com.example.department.Department.dto;

import com.example.department.Department.external.Course;
import com.example.department.Department.external.Student;

import java.util.List;

public class Course_Students_DTO {
    private Course course;
    private List<Student> studentList;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
