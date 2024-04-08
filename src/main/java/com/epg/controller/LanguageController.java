package com.epg.controller;

import com.epg.model.Language;
import com.epg.model.User;
import com.epg.repository.UserRepository;
import com.epg.service.LanguageService;
import com.epg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {
    @Autowired
    LanguageService languageService;

    @GetMapping("/languages")
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguages();
    }
}
