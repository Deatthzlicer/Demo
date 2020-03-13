package com.example.demo;

public class ForwardObjectRequest {

	
	/**
	 * 
	 * Object to get the Request primitives values to String
	 */
	DemoForm form;

	ForwardObjectRequest(DemoForm form)

	{
		this.form = form;

	}

	public String getLocation() {
		return "" + form.getLocation();
	}

	public String getPredominantDegrees() {
		return "" + form.getPredominantDegrees();
	}

	public String getYear() {
		return "" + form.getYear();
	}
}
