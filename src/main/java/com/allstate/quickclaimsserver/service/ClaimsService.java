package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.domain.Task;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
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

    public void addTask(Integer claimNumber, Task newTask);

    public List<Task> getAllTasks(Integer claimNumber);

    public Task updateClaimTask(Integer taskNumber, Map<String, Object> fields);

}
