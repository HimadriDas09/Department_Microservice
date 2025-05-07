package com.example.department.Department.implementation;

import com.example.department.Department.Department;
import com.example.department.Department.DepartmentRepository;
import com.example.department.Department.DepartmentService;
import com.example.department.Department.dto.Course_Students_DTO;
import com.example.department.Department.dto.Department_Courses_Students_DTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository;

    DepartmentServiceImpl(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department getDepartmentById(Long id) {
        Optional<Department> byId = departmentRepository.findById(id);
        return byId.orElse(null);
    }

    @Override
    public List<Department_Courses_Students_DTO> getAllDepartments() {
        return List.of();
    }

    @Override
    public Department_Courses_Students_DTO getDepartmentByName(String name) {
        return null;
    }

    @Override
    public Course_Students_DTO getCourseByCourseNameAndDeptName(String deptName, String courseName) {
        return null;
    }

    @Override
    public boolean createDepartment(Department department) {
        try {
            departmentRepository.save(department);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
