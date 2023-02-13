package com.allstate.quickclaimsserver.data;

import com.allstate.quickclaimsserver.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    public Task findBytaskNumber(Integer taskNumber);
}
