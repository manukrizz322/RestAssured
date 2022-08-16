package com.ems.extra_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Serialization {

	@Test
	private void serilization() {
		Map<String, Object> jsonBody = new HashMap<String, Object>();
		List<String> skills=new ArrayList<String>();
		
		skills.add("java");
		skills.add("selenium");
		
		jsonBody.put("first_name", "Agni");
		jsonBody.put("last_name", "A");
		jsonBody.put("email", "agni@arul.com");
		
		jsonBody.put("skills", skills);
		
		
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonBody)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all();
		
		
		
	
	}

}
