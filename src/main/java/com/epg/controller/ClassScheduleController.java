package com.epg.controller;


import com.epg.model.ClassSchedule;
import com.epg.service.ClassScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassScheduleController {
    @Autowired
     ClassScheduleService classScheduleService;

    @GetMapping("/class-schedules")
    public List<ClassSchedule> getAllClassSchedules() {
        return classScheduleService.getAllClassSchedules();
    }
}
