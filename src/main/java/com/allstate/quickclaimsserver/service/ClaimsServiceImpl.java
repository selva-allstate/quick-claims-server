package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Claims> getBystatusCode(Integer statusCode) {
        return claimsRepository.findAllClaimsBystatusCode(statusCode);
    }

    @Override
    public Claims getByclaimNumber(Integer claimNumber) throws ClaimNotFoundException {
        Optional<Claims> optionalClaim = Optional.ofNullable(claimsRepository.findByclaimNumber(claimNumber));
        if (optionalClaim.isPresent()){
             return optionalClaim.get();
        } else {
            throw new ClaimNotFoundException("There is no claim with Claim Number" + claimNumber);
        }

    }

}
