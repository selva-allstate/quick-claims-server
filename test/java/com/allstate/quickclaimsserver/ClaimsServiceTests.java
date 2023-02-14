package com.allstate.quickclaimsserver;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.data.TaskRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.domain.Task;
import com.allstate.quickclaimsserver.service.BootstrapService;
import com.allstate.quickclaimsserver.service.ClaimsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class ClaimsServiceTests {

    @Autowired
    private ClaimsService claimsService;

    @MockBean
    private ClaimsRepository claimsRepository;
    @MockBean
    private TaskRepository taskRepository;

    @MockBean
    private BootstrapService bootstrapService;

    @Test
    public void testgetAllStatuscodes()
    {
        List<Claims> claimsList = new ArrayList<>();

        Task newTask1 = new Task(10,"", "open");
        List<Task> newTasks1 = new ArrayList<>();
        newTasks1.add(newTask1);
        Claims newClaim1 = new Claims(10, 386420754,"Tom", 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), "", 1, "PROPERTY", "", "", "", "","", "15, Harrington Road", "",newTasks1);

        claimsList.add(newClaim1);

        Task newTask2 = new Task(10,"", "open");
        List<Task> newTasks2 = new ArrayList<>();
        newTasks2.add(newTask2);
        Claims newClaim2 = new Claims(10, 386420754,"Tom", 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), "", 5, "PROPERTY", "", "", "", "","", "15, Harrington Road", "",newTasks2);

        claimsList.add(newClaim2);

        Task newTask3 = new Task(10,"", "open");
        List<Task> newTasks3 = new ArrayList<>();
        newTasks3.add(newTask3);
        Claims newClaim3 = new Claims(10, 386420754,"Tom", 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), "", 1, "PROPERTY", "", "", "", "","", "15, Harrington Road", "",newTasks3);

        claimsList.add(newClaim3);

        Task newTask4 = new Task(10,"", "open");
        List<Task> newTasks4 = new ArrayList<>();
        newTasks4.add(newTask3);
        Claims newClaim4 = new Claims(10, 386420754,"Tom", 1302.00, LocalDate.parse("2017-02-01", DateTimeFormatter.ISO_DATE), "", 2, "PROPERTY", "", "", "", "","", "15, Harrington Road", "",newTasks4);

        claimsList.add(newClaim4);

        Mockito.when(claimsRepository.findAll()).thenReturn(claimsList);

        List <Integer> statuscodes = claimsService.getAllStatuscodes();

        assertEquals(3,statuscodes.size());


    }
}
