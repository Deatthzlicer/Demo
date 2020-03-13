package com.example.consumingrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
		
		
		
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
		        .queryParam("api_key", "ZW4Gm3OQEV5heYFvHVZlnx5cw3Xay3mWoLYiwVim")
		 

		HttpEntity<?> entity = new HttpEntity<>(headers);

		HttpEntity<String> response = restTemplate.exchange(
		        builder.toUriString(), 
		        HttpMethod.GET, 
		        entity, 
		        String.class);
		
		
		
		/*
		RestTemplate restTemplate = new RestTemplate();
		String url
		  = "https://api.data.gov/ed/collegescorecard/v1/schools"";
		
		  ResponseEntity<String> response
		  = restTemplate.getForEntity(restTemplate + "", String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		
		
		String result = restTemplate.getForObject("http://example.com/hotels/{location}/bookings/{school.degrees_awarded.predominant}", String.class, param
		
		
		////  General error during semantic analysis: Unsupported class file major version 57
		  
*/
		
	}

}
