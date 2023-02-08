package com.allstate.quickclaimsserver.data;

import com.allstate.quickclaimsserver.domain.Claims;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimsRepository extends JpaRepository<Claims, Integer> {
    public List<Claims> findAllByclaimType(String claimType);
    public Claims findByclaimNumber(Integer claimNumber);
    public List<Claims> findAllByStatusCode(Integer statusCode);

}
