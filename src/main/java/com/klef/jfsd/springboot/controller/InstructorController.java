package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Instructor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.services.InstructorService;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Adjust origin as per your frontend host
@RequestMapping("/api/instructor")
public class InstructorController {
	@Autowired
	private InstructorService instructorService;

    @PostMapping("/create")
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.createInstructor(instructor);
    }

    @GetMapping("/all")
    public List<Instructor> getAllInstructor() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/all/{id}")	
    public Instructor getInstructorById(@PathVariable Long id) {
        return instructorService.getInstructorById(id);
    }

    @PutMapping("/update/{id}")
    public String updateInstructor(@PathVariable Long id, @RequestBody Instructor instructor) {
        return instructorService.updateInstructor(id, instructor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteInstructor(@PathVariable Long id) {
        return instructorService.deleteInstructor(id);
    }
}
