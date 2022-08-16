package com.ems.pojo_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {
	
	public static void main(String[] args) throws JsonProcessingException {
		Employee employyee1=new Employee();
		employyee1.setFirst_name("Agni");
		employyee1.setLast_name("A");
		employyee1.setEmail("Agni@agni.com");
		employyee1.setSkills(Arrays.asList("java","selenium"));
	
	System.out.println(employyee1.getFirst_name());
	System.out.println(employyee1.getLast_name());
	System.out.println(employyee1.getEmail());
	System.out.println(employyee1.getSkills());
	
	ObjectMapper mapper=new ObjectMapper();
	String writeValueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employyee1);
	System.out.println(writeValueAsString);
	}

}
