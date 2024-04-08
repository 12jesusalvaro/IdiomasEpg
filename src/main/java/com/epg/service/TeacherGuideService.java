package com.epg.service;

import com.epg.model.TeacherGuide;
import com.epg.repository.TeacherGuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherGuideService {

    @Autowired
    private TeacherGuideRepository teacherGuideRepository;

    public List<TeacherGuide> getAllTeacherGuides () { return teacherGuideRepository.findAll(); }
}
