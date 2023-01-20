package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimsService {
    public List<Claims> getAllClaims();
    public List<Claims> getByclaimType(String claimType);

    public Claims getByclaimNumber(Integer claimNumber) throws ClaimNotFoundException;
}
