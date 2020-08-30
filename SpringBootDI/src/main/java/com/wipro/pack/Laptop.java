package com.wipro.pack;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;;

@Component
public class Laptop {

	private String name;
	private String manufacturer;
	
	@Autowired
	private Battery battery;
	@Autowired
	private HardDisk harddisk;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public HardDisk getHardisk() {
		return harddisk;
	}
	public void setHardisk(HardDisk harddisk) {
		this.harddisk = harddisk;
	}
	
	public void Display() {
		System.out.println("Got laptop object");
		battery.display();
		harddisk.display();
		
		
		
	}
}
	
