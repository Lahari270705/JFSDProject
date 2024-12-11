package com.klef.jfsd.springboot.services;

import java.util.List;

import com.klef.jfsd.springboot.model.Instructor;

public interface InstructorService {
    Instructor createInstructor(Instructor instructor);
    List<Instructor> getAllInstructors();
    Instructor getInstructorById(Long id);
    String updateInstructor(Long id, Instructor instructor);
    String deleteInstructor(Long id);
}
