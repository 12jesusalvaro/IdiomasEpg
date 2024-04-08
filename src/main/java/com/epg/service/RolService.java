package com.epg.service;

import com.epg.model.ClassSchedule;
import com.epg.model.Rol;
import com.epg.repository.ClassScheduleRepository;
import com.epg.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;
    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }
}
