package com.camunda.demo.SimpleDemo;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Random rand = new Random();
		
		execution.setVariable("name", "Rakesh");
		execution.setVariable("weatherOk", rand.nextBoolean());

	}

}