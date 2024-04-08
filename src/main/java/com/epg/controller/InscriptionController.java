package com.epg.controller;

import com.epg.model.Inscription;
import com.epg.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InscriptionController {

    @Autowired
    InscriptionService inscriptionService;

    @GetMapping("/inscriptions")
    public List<Inscription> getAllInscriptions() { return inscriptionService.getAllInscriptions(); }
}
