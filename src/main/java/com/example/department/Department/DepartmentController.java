package com.example.department.Department;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    DepartmentService departmentService;

    DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id){
        Department departmentById = departmentService.getDepartmentById(id);

        if(departmentById == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(departmentById, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createDepartment(@RequestBody Department department){
        boolean isDepartmentCreated = departmentService.createDepartment(department);

        if(isDepartmentCreated){
            return new ResponseEntity<>("department successfully created", HttpStatus.CREATED);
        }

        return new ResponseEntity<>("department not created", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
