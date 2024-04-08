package com.epg.controller;

import com.epg.model.Director;
import com.epg.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectorController {

    @Autowired
    DirectorService directorService;

    @GetMapping("/directors")
    public List<Director> getAllDirectors() { return directorService.getAllDirectors(); }
}
