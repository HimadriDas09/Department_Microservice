package com.example.department.Department;

import com.example.department.Department.dto.Course_Students_DTO;
import com.example.department.Department.dto.Department_Courses_Students_DTO;

import java.util.List;

public interface DepartmentService {
    Department getDepartmentById(Long id);

    List<Department_Courses_Students_DTO> getAllDepartments();

    Department_Courses_Students_DTO getDepartmentByName(String name);

    Course_Students_DTO getCourseByCourseNameAndDeptName(String deptName, String courseName);

    boolean createDepartment(Department department);
}
