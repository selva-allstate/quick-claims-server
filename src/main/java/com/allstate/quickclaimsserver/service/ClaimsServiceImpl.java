package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimsServiceImpl implements ClaimsService{

    @Autowired
    ClaimsRepository claimsRepository;
    @Override
    public List<Claims> getAllClaims() {
        return claimsRepository.findAll();
    }

    @Override
    public List<Claims> getByclaimType(String claimType) {
        return claimsRepository.findAllByclaimType(claimType);
    }
}
