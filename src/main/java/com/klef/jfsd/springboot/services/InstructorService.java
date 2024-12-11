package com.klef.jfsd.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Instructor;
@Service
public class InstructorService {
	    Instructor createInstructor(Instructor instructor);
	    List<Instructor> getAllInstructors();
	    Instructor getInstructorById(Long id);
	    String updateInstructor(Long id, Instructor instructor);
	    String deleteInstructor(Long id);


}
