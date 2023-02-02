package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class BootstrapService {

    @Autowired
    private ClaimsRepository claimsRepository;

    @PostConstruct
    public void setUpInitialData() {
        int numberOfClaims = claimsRepository.findAll().size();
        if (numberOfClaims == 0) {



            Claims newClaim = new Claims(1, 101000000, 512345098, 1000.00, LocalDate.parse("2022-01-31", DateTimeFormatter.ISO_LOCAL_DATE), 0, "PROPERTY");
            Claims saveClaim = claimsRepository.save(newClaim);
            System.out.println("Claims saved with id" + saveClaim.getId());
            Claims newClaim1 = new Claims(2, 102000000, 764435698, 2000.00, LocalDate.parse("2021-02-02", DateTimeFormatter.ISO_LOCAL_DATE), 3, "AUTO");
            claimsRepository.save(newClaim1);

            Claims newClaim2 = new Claims(3, 103000000, 589789454, 5100.00, LocalDate.parse("2022-02-01", DateTimeFormatter.ISO_DATE), 1, "AUTO");
            claimsRepository.save(newClaim2);
            Claims newClaim3 = new Claims(4, 104000000, 765098687, 8960.00, LocalDate.parse("2023-01-01", DateTimeFormatter.ISO_DATE), 0, "PET");
            claimsRepository.save(newClaim3);
            Claims newClaim4 = new Claims(5, 105000000, 986543320, 530.00, LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE), 0, "AUTO");
            claimsRepository.save(newClaim4);
            Claims newClaim5 = new Claims(6, 106000000, 878543098, 250.00, LocalDate.parse("2020-02-01", DateTimeFormatter.ISO_DATE), 2, "AUTO");
            claimsRepository.save(newClaim5);
            Claims newClaim6 = new Claims(7, 107000000, 897043209, 7000.00, LocalDate.parse("2022-06-01", DateTimeFormatter.ISO_DATE), 5, "PET");
            claimsRepository.save(newClaim6);
            Claims newClaim7 = new Claims(8, 108000000, 794243509, 150.00, LocalDate.parse("2022-02-02", DateTimeFormatter.ISO_DATE), 2, "AUTO");
            claimsRepository.save(newClaim7);
            Claims newClaim8 = new Claims(9, 109000000, 908643412, 10000.00, LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE), 3, "PROPERTY");
            claimsRepository.save(newClaim8);
            Claims newClaim9 = new Claims(10, 110000000, 386420754, 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), 5, "PROPERTY");
            claimsRepository.save(newClaim9);
            Claims newClaim10 = new Claims(11, 111000000, 578043250, 500.00, LocalDate.parse("2023-01-17", DateTimeFormatter.ISO_DATE), 1, "AUTO");
            claimsRepository.save(newClaim10);
            Claims newClaim11 = new Claims(12, 112000000, 871209648, 100.00, LocalDate.parse("2023-01-09", DateTimeFormatter.ISO_DATE), 0, "PET");
            claimsRepository.save(newClaim11);
        }
    }
}
