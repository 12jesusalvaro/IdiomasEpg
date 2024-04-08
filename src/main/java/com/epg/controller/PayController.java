package com.epg.controller;

import com.epg.model.Pay;
import com.epg.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PayController {

    @Autowired
    PayService payService;

    @GetMapping("/pays")
    public List<Pay> getAllPays() { return payService.getAllPays(); }
}
