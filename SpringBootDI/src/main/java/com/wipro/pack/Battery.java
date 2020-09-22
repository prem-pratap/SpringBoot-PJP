package com.wipro.pack;

import org.springframework.stereotype.Component;
//springboot dependency injection 
@Component
public class Battery {
	private String model;
	private int power;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public void  display() {
		System.out.println("Got battery object");
	}
}
