package com.epg.controller;

import com.epg.model.TeacherGuide;
import com.epg.service.TeacherGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherGuideController {

    @Autowired
    TeacherGuideService teacherGuideService;

    @GetMapping("/teacherguides")
    public List<TeacherGuide> getAllTeacherGuides () { return teacherGuideService.getAllTeacherGuides(); }
}
