package com.allstate.quickclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="claimstable")
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer policyNumber;
    private Integer claimNumber;
    private Double claimAmount;
    private String claimDate;
    private Integer statusCode;
    private String claimType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Integer getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(Integer claimNumber) {
        this.claimNumber = claimNumber;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claims claims = (Claims) o;
        return Objects.equals(id, claims.id) && Objects.equals(policyNumber, claims.policyNumber) && Objects.equals(claimNumber, claims.claimNumber) && Objects.equals(claimAmount, claims.claimAmount) && Objects.equals(claimDate, claims.claimDate) && Objects.equals(statusCode, claims.statusCode) && Objects.equals(claimType, claims.claimType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyNumber, claimNumber, claimAmount, claimDate, statusCode, claimType);
    }

    @Override
    public String toString() {
        return "Claims{" +
                "id=" + id +
                ", policyNumber=" + policyNumber +
                ", claimNumber=" + claimNumber +
                ", claimAmount=" + claimAmount +
                ", claimDate=" + claimDate +
                ", statusCode=" + statusCode +
                ", claimType='" + claimType + '\'' +
                '}';
    }

    public Claims(Integer id, Integer policyNumber, Integer claimNumber, Double claimAmount, String claimDate, Integer statusCode, String claimType) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.claimNumber = claimNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.statusCode = statusCode;
        this.claimType = claimType;
    }
    public Claims(){

    }
}
