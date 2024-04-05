
package com.epg.controller;

import com.epg.model.User;
import com.epg.dao.UserDao;
import com.epg.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    
    @Autowired
    UserDao userDao;
    @PostMapping("/addUser")
        
    public void save(@RequestBody User user) {
        userDao.save(user);
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
