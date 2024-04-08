package com.epg.controller;

import com.epg.model.Rol;
import com.epg.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolController {
    @Autowired
    RolService rolService;

    @GetMapping("/roles")
    public List<Rol> getAllRoles() {
        return rolService.getAllRoles();
    }

}
