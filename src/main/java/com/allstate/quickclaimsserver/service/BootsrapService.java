package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BootsrapService {

    @Autowired
    private ClaimsRepository claimsRepository;

    @PostConstruct
    public void setUpInitialData() {
        Claims newClaim = new Claims(101000000, 512345098, 1000.00, 2022-01-31, 0, "PROPERTY");
        claimsRepository.save(newClaim);

    }
}
