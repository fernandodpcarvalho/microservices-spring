package com.oreilly.cloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Cars {

	public List<String> cars(){
		return Arrays.asList("Palio", "Fusca");
	}
}
