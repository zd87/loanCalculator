package fr.formation.loan.entities;

import java.util.Date;

public class Request {

    private Long id;

    private double capital;

    private Type type;

    private Date startDate;

    private int years;

    private double interestRate;

    private double insuranceRate;

    public Request(double capital, Type type, Date startDate, int years,
	    double interestRate, double insuranceRate) {
	this.capital = capital;
	this.type = type;
	this.startDate = startDate;
	this.years = years;
	this.interestRate = interestRate;
	this.insuranceRate = insuranceRate;
    }

    public Request() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public double getCapital() {
	return capital;
    }

    public void setCapital(double capital) {
	this.capital = capital;
    }

    public Type getType() {
	return type;
    }

    public void setType(Type type) {
	this.type = type;
    }

    public Date getStartDate() {
	return startDate;
    }

    public void setStartDate(Date startDate) {
	this.startDate = startDate;
    }

    public int getYears() {
	return years;
    }

    public void setYears(int years) {
	this.years = years;
    }

    public double getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
    }

    public double getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
	this.insuranceRate = insuranceRate;
    }
}
