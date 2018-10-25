package com.oreilly.cloud;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class microserviceController {
	
	@RequestMapping("/{id}")
	public String findByTitle(@PathVariable("id") String id) throws URISyntaxException {
		System.out.println("Controller "+ id);
		URI uri = new URI("http://localhost:9999/lists/" + id); 
		return new RestTemplate().getForObject(uri, String.class);
	}	
	
	
	@RequestMapping("/teste")
	public String cars() {
		System.out.println("Controller /teste");
		return "Teste";
	}
	
//	@RequestMapping("/dogs")
//	public String dogs() {
//		System.out.println("Controller /dogs");
//		return String.join(" ,", dogList);
//	}
//	
//	@RequestMapping("/cats")
//	public String cats() {
//		System.out.println("Controller /cats");
//		return String.join(" ,", catList);
//	}
}
