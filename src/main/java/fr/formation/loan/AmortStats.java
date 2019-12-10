package fr.formation.loan;

public class AmortStats {

    private int year;

    private double capitalPymt;

    private double interestPymt;

    private double capitalLeft;

    private double annuity;

    private double insurancePymt;

    private double totalPymt;

    public AmortStats(int year, double capitalPymt, double interestPymt,
	    double capitalLeft, double insurancePymt) {
	this.year = year;
	this.capitalPymt = capitalPymt;
	this.interestPymt = interestPymt;
	this.capitalLeft = capitalLeft;
	this.annuity = capitalPymt + interestPymt;
	this.insurancePymt = insurancePymt;
	this.totalPymt = capitalPymt + interestPymt + insurancePymt;
    }

    public AmortStats() {
    }

    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    public double getCapitalPymt() {
	return capitalPymt;
    }

    public void setCapitalPymt(double capitalPymt) {
	this.capitalPymt = capitalPymt;
    }

    public double getInterestPymt() {
	return interestPymt;
    }

    public void setInterestPymt(double interestPymt) {
	this.interestPymt = interestPymt;
    }

    public double getCapitalLeft() {
	return capitalLeft;
    }

    public void setCapitalLeft(double capitalLeft) {
	this.capitalLeft = capitalLeft;
    }

    public double getAnnuity() {
	return annuity;
    }

    public void setAnnuity(double annuity) {
	this.annuity = annuity;
    }

    public double getInsurancePymt() {
	return insurancePymt;
    }

    public void setInsurancePymt(double insurancePymt) {
	this.insurancePymt = insurancePymt;
    }

    public double getTotalPymt() {
	return totalPymt;
    }

    public void setTotalPymt(double totalPymt) {
	this.totalPymt = totalPymt;
    }
}
