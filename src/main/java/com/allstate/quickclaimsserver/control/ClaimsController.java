package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.domain.Task;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.quickclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/claims")
public class ClaimsController {
    @Autowired
    ClaimsService claimsService;

    @GetMapping
    public List<Claims> getAllClaims(@RequestParam(value="claimType", required = false) String claimType,
                                     @RequestParam(value="policyNo", required = false) Integer policyNo)

    {
        if (claimType != null) {
            return claimsService.getByclaimType(claimType);

        } else if (policyNo != null)
        {
            return claimsService.getByPolicyNumber(policyNo);
        }
        else {
            return claimsService.getAllClaims();
        }
    }

    @GetMapping("/{claimNumber}")
    public Claims findByclaimNumber(@PathVariable("claimNumber") Integer claimnumber) throws ClaimNotFoundException {
        return claimsService.getByclaimNumber(claimnumber);
    }

    @GetMapping("/status/{statusCode}")
    public List<Claims> getAllClaimStatusCode(@PathVariable("statusCode") Integer statuscode){
        return  claimsService.getBystatusCode(statuscode);
    }

    @PostMapping
    public Claims saveNewClaim(@RequestBody Claims claims){
        System.out.println(claims);
        return claimsService.saveClaim(claims);
    }

    @PostMapping("/{claimNumber}/task")
    public void addTask(@PathVariable Integer claimNumber, @RequestBody Task newTask){
        System.out.println(newTask);
        claimsService.addTask(claimNumber, newTask);
    }

    @GetMapping("/{claimNumber}/task")
    public List<Task> getAllTasks(@PathVariable Integer claimNumber){
       return claimsService.getAllTasks(claimNumber);
    }
    @PutMapping("/task/{taskNumber}")
    public Task updateClaimTask(@PathVariable Integer taskNumber, @RequestBody HashMap<String, Object> fields) {
        System.out.println(fields);
        return claimsService.updateClaimTask(taskNumber, fields);
    }
    @PutMapping("/{claimNumber}")
    public Claims updateClaim(@PathVariable Integer claimNumber,  @RequestBody HashMap<String, Object> fields)
    {
        return claimsService.updateClaim(claimNumber, fields);
    }
}
