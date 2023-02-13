package com.allstate.quickclaimsserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="claimstable")
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer claimNumber;
    private Integer policyNumber;
    private String customerName;
    private Double claimAmount;
    private LocalDate claimDate;

    private String claimReason;
    private Integer statusCode;
    private String claimType;

    private String animalType;

    private String animalBreed;

    private String vehicleMake;

    private String vehicleModel;

    private String vehicleManyear;

    private String propertyAddress;

    private String anyotherDetails;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Task> tasks;

    public Integer getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(Integer claimNumber) {
        this.claimNumber = claimNumber;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleManyear() {
        return vehicleManyear;
    }

    public void setVehicleManyear(String vehicleManyear) {
        this.vehicleManyear = vehicleManyear;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getAnyotherDetails() {
        return anyotherDetails;
    }

    public void setAnyotherDetails(String anyotherDetails) {
        this.anyotherDetails = anyotherDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claims claims = (Claims) o;
        return Objects.equals(claimNumber, claims.claimNumber) && Objects.equals(policyNumber, claims.policyNumber) && Objects.equals(customerName, claims.customerName) && Objects.equals(claimAmount, claims.claimAmount) && Objects.equals(claimDate, claims.claimDate) && Objects.equals(claimReason, claims.claimReason) && Objects.equals(statusCode, claims.statusCode) && Objects.equals(claimType, claims.claimType) && Objects.equals(animalType, claims.animalType) && Objects.equals(animalBreed, claims.animalBreed) && Objects.equals(vehicleMake, claims.vehicleMake) && Objects.equals(vehicleModel, claims.vehicleModel) && Objects.equals(vehicleManyear, claims.vehicleManyear) && Objects.equals(propertyAddress, claims.propertyAddress) && Objects.equals(anyotherDetails, claims.anyotherDetails) && Objects.equals(tasks, claims.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimNumber, policyNumber, customerName, claimAmount, claimDate, claimReason, statusCode, claimType, animalType, animalBreed, vehicleMake, vehicleModel, vehicleManyear, propertyAddress, anyotherDetails, tasks);
    }

    @Override
    public String toString() {
        return "Claims{" +
                "claimNumber=" + claimNumber +
                ", policyNumber=" + policyNumber +
                ", customerName='" + customerName + '\'' +
                ", claimAmount=" + claimAmount +
                ", claimDate=" + claimDate +
                ", claimReason='" + claimReason + '\'' +
                ", statusCode=" + statusCode +
                ", claimType='" + claimType + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalBreed='" + animalBreed + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleManyear='" + vehicleManyear + '\'' +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", anyotherDetails='" + anyotherDetails + '\'' +
                ", tasks=" + tasks +
                '}';
    }

    public Claims(Integer claimNumber, Integer policyNumber, String customerName, Double claimAmount, LocalDate claimDate, String claimReason, Integer statusCode, String claimType, String animalType, String animalBreed, String vehicleMake, String vehicleModel, String vehicleManyear, String propertyAddress, String anyotherDetails, List<Task> tasks) {
        this.claimNumber = claimNumber;
        this.policyNumber = policyNumber;
        this.customerName = customerName;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.claimReason = claimReason;
        this.statusCode = statusCode;
        this.claimType = claimType;
        this.animalType = animalType;
        this.animalBreed = animalBreed;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleManyear = vehicleManyear;
        this.propertyAddress = propertyAddress;
        this.anyotherDetails = anyotherDetails;
        this.tasks = tasks;
    }

    public Claims(){

    }
}
