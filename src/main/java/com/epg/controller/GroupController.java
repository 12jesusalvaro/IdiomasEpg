package com.epg.controller;

import com.epg.model.Group;
import com.epg.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("/groups")
    public List<Group> getAllGroups () { return groupService.getAllGroups(); }
}
