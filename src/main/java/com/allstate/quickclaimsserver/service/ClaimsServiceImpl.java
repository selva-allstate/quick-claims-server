package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
        return claimsRepository.findAllByStatusCode(statusCode);
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

    @Override
    public Claims saveClaim(Claims claims) {
        return claimsRepository.save(claims);
    }

    @Override
    public List<Integer> getAllStatuscodes() {

        return claimsRepository.findAll().stream()
                .map( claims -> claims.getStatusCode())
                     .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public Claims updateClaim(Integer claimNumber, Map<String, Object> fields) {
        Claims claims=claimsRepository.findByclaimNumber(claimNumber);
        if (fields.containsKey("customerName")){
            claims.setCustomerName(fields.get("customerName").toString());
        }
        if (fields.containsKey("claimAmount")){
            claims.setClaimAmount(Double.parseDouble(fields.get("claimAmount").toString()));
        }
        if (fields.containsKey("policyNumber")){
            claims.setPolicyNumber(Integer.parseInt(fields.get("policyNumber").toString()));
        }
        if (fields.containsKey("statusCode")){
            claims.setStatusCode(Integer.parseInt(fields.get("statusCode").toString()));
        }
        if (fields.containsKey("propertyAddress")){
            claims.setPropertyAddress(fields.get("propertyAddress").toString());
        }
        if (fields.containsKey("claimDate")){
            claims.setClaimDate(LocalDate.parse(fields.get("claimDate").toString()));
        }
        if (fields.containsKey("claimReason")){
            claims.setClaimReason(fields.get("claimReason").toString());
        }
        if (fields.containsKey("claimType")){
            claims.setClaimType(fields.get("claimType").toString());
        }
        if (fields.containsKey("animalType"))
        {
            claims.setAnimalType(fields.get("animalType").toString());
        }
        if (fields.containsKey("animalBreed"))
        {
            claims.setAnimalBreed(fields.get("animalBreed").toString());
        }
        if (fields.containsKey("vehicleMake"))
        {
            claims.setVehicleMake(fields.get("vehicleMake").toString());
        }
        if (fields.containsKey("vehicleManyear"))
        {
            claims.setVehicleManyear(fields.get("vehicleManyear").toString());
        }
        if (fields.containsKey("propertyAddress"))
        {
            claims.setPropertyAddress(fields.get("propertyAddress").toString());
        }
        if (fields.containsKey("anyotherDetails"))
        {
            claims.setAnyotherDetails(fields.get("anyotherDetails").toString());
        }
        return claimsRepository.save(claims);
    }

}
