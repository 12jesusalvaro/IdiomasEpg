package com.epg.service;

import com.epg.model.Language;
import com.epg.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;
    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }
}
