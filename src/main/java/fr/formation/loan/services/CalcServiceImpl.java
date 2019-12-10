package fr.formation.loan.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.loan.AmortStats;
import fr.formation.loan.entities.Request;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public List<AmortStats> calc(Request request) {
	int years = request.getYears();
	double capital = request.getCapital();
	double interestRate = request.getInterestRate() / 100.00;
	double insuranceRate = request.getInsuranceRate() / 100.00;
	double insurancePymt = capital * insuranceRate;
	double firstAmort = firstAmortization(years, capital, interestRate);
	double firstInterest = interestPymt(capital, interestRate);
	double capitalLeft = capital - firstAmort;
	/***/
	List<AmortStats> result = new ArrayList<>();
	/* First stats */
	AmortStats firstStats = new AmortStats(1, firstAmort, firstInterest,
		capitalLeft, insurancePymt);
	result.add(firstStats);
	/* The rest of the stats */
	for (int year = 2; year <= years; year++) {
	    double capitalPymt = amortization(year, interestRate, firstAmort);
	    double interestPymt = interestPymt(capitalLeft, interestRate);
	    capitalLeft = capitalLeft - capitalPymt;
	    capitalLeft = Math.round(capitalLeft * 100.0) / 100.0;
	    AmortStats monthlyStats = new AmortStats(year, capitalPymt,
		    interestPymt, capitalLeft, insurancePymt);
	    result.add(monthlyStats);
	}
	return result;
    }

    static double firstAmortization(int n, double capital, double intRate) {
	double result = capital * intRate / (Math.pow(1 + intRate, n) - 1);
	return Math.round(result * 100.0) / 100.0;
    }

    static double amortization(int year, double rate, double firstPymt) {
	double result = Math.pow(1 + rate, year - 1) * firstPymt;
	return Math.round(result * 100.0) / 100.0;
    }

    static double interestPymt(double capitalLeft, double intRate) {
	double result = capitalLeft * intRate;
	return Math.round(result * 100.0) / 100.0;
    }
}
