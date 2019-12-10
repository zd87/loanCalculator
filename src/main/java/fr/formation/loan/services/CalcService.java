package fr.formation.loan.services;

import java.util.List;

import fr.formation.loan.AmortStats;
import fr.formation.loan.entities.Request;

public interface CalcService {

    List<AmortStats> calc(Request request);
}
