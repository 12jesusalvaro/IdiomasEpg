package com.epg.controller;

import com.epg.model.Note;
import com.epg.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {
    
    @Autowired
    NoteService noteService;
    
    @GetMapping("/notes")
    public List<Note> getAllNotes() { return noteService.getAllNotes(); }
}
