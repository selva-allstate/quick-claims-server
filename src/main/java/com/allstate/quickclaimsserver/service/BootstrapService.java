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



            Claims newClaim = new Claims(1, 512345098,"Anna", 1000.00, LocalDate.parse("2022-01-31", DateTimeFormatter.ISO_LOCAL_DATE), "",  0, "PROPERTY", "","","","","","North Road, Belfast","");
            Claims saveClaim = claimsRepository.save(newClaim);
            System.out.println("Claims saved with id" + saveClaim.getClaimNumber());
            Claims newClaim1 = new Claims(2, 764435698, "Michael", 2000.00, LocalDate.parse("2021-02-02", DateTimeFormatter.ISO_LOCAL_DATE),"", 3, "MOTOR","", "","Toyota","Yaris", "2003","", "");
            claimsRepository.save(newClaim1);

            Claims newClaim2 = new Claims(3, 589789454, "Peter", 5100.00, LocalDate.parse("2022-02-01", DateTimeFormatter.ISO_DATE), "", 1, "MOTOR","","","BMW","e36","1999", "","" );
            claimsRepository.save(newClaim2);
            Claims newClaim3 = new Claims(4, 765098687, "Sarah", 8960.00, LocalDate.parse("2023-01-01", DateTimeFormatter.ISO_DATE),"", 0, "PET","Dog", "Golden Retriever","", "", "", "", "");
            claimsRepository.save(newClaim3);
            Claims newClaim4 = new Claims(5, 986543320, "Arthur", 530.00, LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE), "", 0, "MOTOR", "", "", "Hyundai","Tucson","2022","","");
            claimsRepository.save(newClaim4);
            Claims newClaim5 = new Claims(6, 878543098,"Srikantha", 250.00, LocalDate.parse("2020-02-01", DateTimeFormatter.ISO_DATE), "", 2, "MOTOR", "", "", "Audi","A4","2006","","");
            claimsRepository.save(newClaim5);
            Claims newClaim6 = new Claims(7,  897043209,"Lauren", 7000.00, LocalDate.parse("2022-06-01", DateTimeFormatter.ISO_DATE), "",  5, "PET", "Dog", "Alaskan Malamute", "", "", "", "", "");
            claimsRepository.save(newClaim6);
            Claims newClaim7 = new Claims(8, 794243509,"Charles",150.00, LocalDate.parse("2022-02-02", DateTimeFormatter.ISO_DATE),"", 2, "MOTOR", "", "", "Volkswagen Passat", "2007", "", "", "");
            claimsRepository.save(newClaim7);
            Claims newClaim8 = new Claims(9, 908643412,"Phil", 10000.00, LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE),"", 3, "PROPERTY", "", "", "", "", "", "20, Ridgeway Street, Leeds", "");
            claimsRepository.save(newClaim8);
            Claims newClaim9 = new Claims(10, 386420754,"Tom", 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), "", 5, "PROPERTY", "", "", "", "","", "15, Harrington Road", "");
            claimsRepository.save(newClaim9);
            Claims newClaim10 = new Claims(11, 578043250,"William", 500.00, LocalDate.parse("2023-01-17", DateTimeFormatter.ISO_DATE),"Change Breakpads and servicing" , 1, "AUTO", "", "", "Nissan", "Rogue", "2023", "", "");
            claimsRepository.save(newClaim10);
            Claims newClaim11 = new Claims(12, 871209648,"Gemma", 100.00, LocalDate.parse("2023-01-09", DateTimeFormatter.ISO_DATE),"The cat hurt its leg",  0, "PET", "cat", "Maine Coon", "", "", "", "", "");
            claimsRepository.save(newClaim11);
        }
    }
}
