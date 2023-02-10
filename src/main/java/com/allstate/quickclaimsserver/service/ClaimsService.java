package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;
import java.util.Map;

public interface ClaimsService {
    public List<Claims> getAllClaims();
    public List<Claims> getByclaimType(String claimType);

    public List<Claims> getByPolicyNumber(Integer policyNumber);

    public List<Claims> getBystatusCode(Integer statusCode);

    public Claims getByclaimNumber(Integer claimNumber) throws ClaimNotFoundException;

    public Claims saveClaim(Claims claims);

    public List<Integer> getAllStatuscodes();

    public Claims updateClaim(Integer claimNumber, Map<String, Object> fields);
}
