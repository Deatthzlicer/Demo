package com.example.demo;

public class DemoForm {
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public int getPredominantDegrees() {
		return predominantDegrees;
	}

	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private  int location=0;
	 private int predominantDegrees=0;
	 private int year=0;
	
	 DemoForm(int location,int predominantDegrees, int year){
		this.location=location;
		this.predominantDegrees=predominantDegrees;
		this.year=year;
	}
	
	
}
