package com.epg.service;

import com.epg.model.Student;
import com.epg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getAllStudents(){ return studentRepository.findAll(); }
}
