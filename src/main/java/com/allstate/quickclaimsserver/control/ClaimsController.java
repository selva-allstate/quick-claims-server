package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/claims")
public class ClaimsController {
    @Autowired
    ClaimsService claimsService;

    @GetMapping
    public List<Claims> getAllClaims(@RequestParam(value="claimType", required = false) String claimType){
        if (claimType == null) {
            return claimsService.getAllClaims();
        } else
        {
            return claimsService.getByclaimType(claimType);
        }
    }
}
