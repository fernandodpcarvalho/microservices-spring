package com.oreilly.cloud;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Import(Animals.class)
public class SpringMicroservicesApplication {
	
	@Autowired
	@Resource(name="dogs")
	public List<String> dogList;
	
	@Autowired
	@Resource(name="cats")
	public List<String> catList;
	
	@Autowired
	public Cars cars;
	
	
	@RequestMapping("/cars")
	public String cars() {
		return String.join(", ", cars.cars());
	}
	
	@RequestMapping("/dogs")
	public String dogs() {
		return String.join(" ,", dogList);
	}
	
	@RequestMapping("/cats")
	public String cats() {
		return String.join(" ,", catList);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesApplication.class, args);
	}
}
