package com.iu.s2;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	private String brand;
	private int size;
	
	public Wheel() {
		// TODO Auto-generated constructor stub
	}
	
	public Wheel(String brand, int size) {
		// TODO Auto-generated constructor stub
	 this.brand = brand;
	 this.size = size;
	}
	
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
