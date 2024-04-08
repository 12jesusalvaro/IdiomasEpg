package com.epg.controller;

import com.epg.model.Assistance;
import com.epg.service.AssistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssistanceController {

    @Autowired
    AssistanceService assistanceService;

    @GetMapping("/assistances")
    public List<Assistance> getAllAssistances() { return assistanceService.getAllAssistances(); }
}
