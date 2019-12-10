package fr.formation.loan.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.loan.AmortStats;
import fr.formation.loan.entities.Request;
import fr.formation.loan.services.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalcService service;

    protected CalculatorController(CalcService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseBody
    public List<AmortStats> calc(@RequestBody Request request) {
	return service.calc(request);
    }
}
