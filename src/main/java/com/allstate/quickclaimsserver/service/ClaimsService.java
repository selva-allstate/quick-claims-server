package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claims;

import java.util.List;

public interface ClaimsService {
    public List<Claims> getAllClaims();
    public List<Claims> getByclaimType(String claimType);
}
