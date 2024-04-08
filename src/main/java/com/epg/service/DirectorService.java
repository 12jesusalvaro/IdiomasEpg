package com.epg.service;

import com.epg.model.Director;
import com.epg.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    public List<Director> getAllDirectors() { return directorRepository.findAll(); }
}
