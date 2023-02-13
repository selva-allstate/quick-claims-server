package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class BootstrapService {

    @Autowired
    private ClaimsRepository claimsRepository;

    @PostConstruct
    public void setUpInitialData() {
        int numberOfClaims = claimsRepository.findAll().size();
        if (numberOfClaims == 0) {

            Task newTask = new Task(1,"", "open");
            List<Task> newTasks = new ArrayList<>();
            newTasks.add(newTask);

            Claims newClaim = new Claims(1, 512345098,"Anna", 1000.00, LocalDate.parse("2022-01-31", DateTimeFormatter.ISO_LOCAL_DATE), "",  0, "PROPERTY", "","","","","","North Road, Belfast","",newTasks);
            Claims saveClaim = claimsRepository.save(newClaim);
            System.out.println("Claims saved with id" + saveClaim.getClaimNumber());

            Task newTask1 = new Task(2,"", "open");
            List<Task> newTasks1 = new ArrayList<>();
            newTasks1.add(newTask1);

            Claims newClaim1 = new Claims(2, 764435698, "Michael", 2000.00, LocalDate.parse("2021-02-02", DateTimeFormatter.ISO_LOCAL_DATE),"", 3, "MOTOR","", "","Toyota","Yaris", "2003","", "", newTasks1);
            claimsRepository.save(newClaim1);

            Task newTask2 = new Task(3,"", "open");
            List<Task> newTasks2 = new ArrayList<>();
            newTasks2.add(newTask2);

            Claims newClaim2 = new Claims(3, 589789454, "Peter", 5100.00, LocalDate.parse("2022-02-01", DateTimeFormatter.ISO_DATE), "", 1, "MOTOR","","","BMW","e36","1999", "","",newTasks2);
            claimsRepository.save(newClaim2);

            Task newTask3 = new Task(4,"", "open");
            List<Task> newTasks3 = new ArrayList<>();
            newTasks3.add(newTask3);

            Claims newClaim3 = new Claims(4, 765098687, "Sarah", 8960.00, LocalDate.parse("2023-01-01", DateTimeFormatter.ISO_DATE),"", 0, "PET","Dog", "Golden Retriever","", "", "", "", "",newTasks3);
            claimsRepository.save(newClaim3);

            Task newTask4 = new Task(5,"", "open");
            List<Task> newTasks4 = new ArrayList<>();
            newTasks4.add(newTask4);

            Claims newClaim4 = new Claims(5, 986543320, "Arthur", 530.00, LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE), "", 0, "MOTOR", "", "", "Hyundai","Tucson","2022","","",newTasks4);
            claimsRepository.save(newClaim4);

            Task newTask5 = new Task(6,"", "open");
            List<Task> newTasks5 = new ArrayList<>();
            newTasks5.add(newTask5);

            Claims newClaim5 = new Claims(6, 878543098,"Srikantha", 250.00, LocalDate.parse("2020-02-01", DateTimeFormatter.ISO_DATE), "", 2, "MOTOR", "", "", "Audi","A4","2006","","",newTasks5);
            claimsRepository.save(newClaim5);

            Task newTask6 = new Task(7,"", "open");
            List<Task> newTasks6 = new ArrayList<>();
            newTasks6.add(newTask6);

            Claims newClaim6 = new Claims(7,  897043209,"Lauren", 7000.00, LocalDate.parse("2022-06-01", DateTimeFormatter.ISO_DATE), "",  5, "PET", "Dog", "Alaskan Malamute", "", "", "", "", "", newTasks6);
            claimsRepository.save(newClaim6);

            Task newTask7 = new Task(8,"", "open");
            List<Task> newTasks7 = new ArrayList<>();
            newTasks7.add(newTask7);

            Claims newClaim7 = new Claims(8, 794243509,"Charles",150.00, LocalDate.parse("2022-02-02", DateTimeFormatter.ISO_DATE),"", 2, "MOTOR", "", "", "Volkswagen Passat", "2007", "", "", "",newTasks7);
            claimsRepository.save(newClaim7);

            Task newTask8 = new Task(9,"", "open");
            List<Task> newTasks8 = new ArrayList<>();
            newTasks8.add(newTask8);

            Claims newClaim8 = new Claims(9, 908643412,"Phil", 10000.00, LocalDate.parse("2020-01-31", DateTimeFormatter.ISO_DATE),"", 3, "PROPERTY", "", "", "", "", "", "20, Ridgeway Street, Leeds", "",newTasks8);
            claimsRepository.save(newClaim8);

            Task newTask9 = new Task(10,"", "open");
            List<Task> newTasks9 = new ArrayList<>();
            newTasks9.add(newTask9);

            Claims newClaim9 = new Claims(10, 386420754,"Tom", 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), "", 5, "PROPERTY", "", "", "", "","", "15, Harrington Road", "",newTasks9);
            claimsRepository.save(newClaim9);

            Task newTask10 = new Task(11,"", "open");
            List<Task> newTasks10 = new ArrayList<>();
            newTasks10.add(newTask10);

            Claims newClaim10 = new Claims(11, 578043250,"William", 500.00, LocalDate.parse("2023-01-17", DateTimeFormatter.ISO_DATE),"Change Breakpads and servicing" , 1, "AUTO", "", "", "Nissan", "Rogue", "2023", "", "",newTasks10);
            claimsRepository.save(newClaim10);

            Task newTask11 = new Task(12,"", "open");
            List<Task> newTasks11 = new ArrayList<>();
            newTasks11.add(newTask11);

            Claims newClaim11 = new Claims(12, 871209648,"Gemma", 100.00, LocalDate.parse("2023-01-09", DateTimeFormatter.ISO_DATE),"The cat hurt its leg",  0, "PET", "cat", "Maine Coon", "", "", "", "", "",newTasks11);
            claimsRepository.save(newClaim11);
        }
    }
}
