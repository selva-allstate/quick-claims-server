package com.allstate.quickclaimsserver;

import com.allstate.quickclaimsserver.domain.Claims;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DomainClassTests {
    @Test
    public void test2ClaimsWithSameclaimNumberAreEqual() {
        Claims claim1 = new Claims();
        Claims claim2 = new Claims();
        claim1.setClaimNumber(123);
        claim2.setClaimNumber(123);
        assertEquals(claim1, claim2);

    }
}
