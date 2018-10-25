package com.oreilly.cloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

public class Animals {

	@Bean
	public List<String> dogs(){
		return Arrays.asList("Jhonny", "Mili");
	}
	
	@Bean
	public List<String> cats(){
		return Arrays.asList("Meg", "Lisa");
	}
}
