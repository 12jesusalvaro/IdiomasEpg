package com.epg.service;

import com.epg.model.ClassSchedule;
import com.epg.repository.ClassScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassScheduleService {
    @Autowired
    private ClassScheduleRepository classScheduleRepository;
    public List<ClassSchedule> getAllClassSchedules() {
        return classScheduleRepository.findAll();
    }
}
