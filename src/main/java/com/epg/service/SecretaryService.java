package com.epg.service;

import com.epg.model.Secretary;
import com.epg.repository.SecretaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretaryService {
    @Autowired
    private SecretaryRepository secretaryRepository;

    public List<Secretary> getAllSecretaries() {
        return secretaryRepository.findAll();
    }
}
