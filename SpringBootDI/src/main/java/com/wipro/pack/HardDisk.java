package com.wipro.pack;

import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	private String manufacturer;
	private String capacity;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	public void display() {
		System.out.println("Got HardDisk Object");
	}
	

}
