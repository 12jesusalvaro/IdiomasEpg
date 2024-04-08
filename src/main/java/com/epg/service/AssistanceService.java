package com.epg.service;

import com.epg.model.Assistance;
import com.epg.repository.AssistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistanceService {

    @Autowired
    private AssistanceRepository assistanceRepository;

    public List<Assistance> getAllAssistances() { return assistanceRepository.findAll(); }
}
