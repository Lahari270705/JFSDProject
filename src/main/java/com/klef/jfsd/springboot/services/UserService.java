package com.klef.jfsd.springboot.services;

import java.util.Optional;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Instructor;
import com.klef.jfsd.springboot.model.Student;

public interface UserService {
    Optional<Student> findStudentByUsername(String username);
    Optional<Instructor> findInstructorByUsername(String username);
    Optional<Admin> findAdminByUsername(String username);
}