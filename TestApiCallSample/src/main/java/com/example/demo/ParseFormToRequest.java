package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class ParseFormToRequest {

	Map<String, String> param = null;
	
	ParseFormToRequest(ForwardObjectRequest inputForm)
	{
		
		param = new HashMap<String, String>();
		
		param.put("location", inputForm.getLocation());
		param.put("degrees", inputForm.getPredominantDegrees());
		param.put("year", inputForm.getYear());
		
	}
	
	public Map<String, String> retrieveParsedFormOntoRequest () {return param;} 
	
 }
