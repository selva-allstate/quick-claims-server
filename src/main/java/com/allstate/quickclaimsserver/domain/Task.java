package com.allstate.quickclaimsserver.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity

@Table(name="taskstable")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskNumber;
    private String taskDescription;
    private String taskStatus;

    public Task() {
    }

    public Task(Integer taskNumber, String taskDescription, String taskStatus) {
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public Integer getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskNumber, task.taskNumber) && Objects.equals(taskDescription, task.taskDescription) && Objects.equals(taskStatus, task.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskNumber, taskDescription, taskStatus);
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskNumber=" + taskNumber +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                '}';
    }

}
