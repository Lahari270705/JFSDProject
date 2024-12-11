
package com.klef.jfsd.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.springboot.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Optional<Instructor> findByUsername(String username);
}