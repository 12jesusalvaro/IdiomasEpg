package com.epg.service;

import com.epg.model.Pay;
import com.epg.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayService {

    @Autowired
    private PayRepository payRepository;

    public List<Pay> getAllPays() { return payRepository.findAll(); }
}
