package com.example.department.Department.dto;

import com.example.department.Department.Department;

import java.util.List;

public class Department_Courses_Students_DTO {
    private Department department;
    private List<Course_Students_DTO> courseStudentsDtoList;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course_Students_DTO> getCourseStudentsDtoList() {
        return courseStudentsDtoList;
    }

    public void setCourseStudentsDtoList(List<Course_Students_DTO> courseStudentsDtoList) {
        this.courseStudentsDtoList = courseStudentsDtoList;
    }
}
