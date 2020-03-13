package com.example.demo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApiCallSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiCallSampleApplication.class, args);

		try {

			URL url = new URL("https://api.data.gov/ed/collegescorecard/v1/schools");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("api_key", "QbocncMBeazCPc2w5N8LYCVewV3dSCCb99Mg0wWC");
			
			
			Map<String, String> parameters = new HashMap<>();
			parameters.put("api_key", "QbocncMBeazCPc2w5N8LYCVewV3dSCCb99Mg0wWC");
			 
			con.setDoOutput(true);
			DataOutputStream out = new DataOutputStream(con.getOutputStream());
			
			
			out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
			out.flush();
			out.close();
			
			

		//con.setRequestProperty("Content-Type", "application/json");
   // String contentType = con.getHeaderField("Content-Type");

con.setConnectTimeout(5000);
con.setReadTimeout(5000);
			


int status = con.getResponseCode();
    
System.out.println(status);


    	BufferedReader in = new BufferedReader(
				  new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
				    content.append(inputLine);
				}
				in.close();
		
				System.out.println(inputLine);
    		
    	
					con.disconnect();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
finally {

}
	}

	

	
	
	
	

}
 class ParameterStringBuilder {
    public static String getParamsString(Map<String, String> params) 
      throws UnsupportedEncodingException{
        StringBuilder result = new StringBuilder();
 
        for (Map.Entry<String, String> entry : params.entrySet()) {
          result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
          result.append("=");
          result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
          result.append("&");
        }
 
        String resultString = result.toString();
        return resultString.length() > 0
          ? resultString.substring(0, resultString.length() - 1)
          : resultString;
    }
}