package com.epg.controller;

import com.epg.model.Certificate;
import com.epg.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertificateController {

    @Autowired
    CertificateService certificateService;

    @GetMapping("/certificates")
    public List<Certificate> getAllCertificates() { return certificateService.getAllCertificates(); }
}
