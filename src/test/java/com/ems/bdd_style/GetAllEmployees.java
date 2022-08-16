package com.ems.bdd_style;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class GetAllEmployees {
	@Test(enabled = false)
	private void getMethod() {
	
		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees")
		.prettyPrint();

	}
	
	@Test(enabled = false)
	private void postMethod() {

		
		given().baseUri("http://localhost:3000")
		.body("{\r\n"
				+ "      \"first_name\": \"Agni\",\r\n"
				+ "      \"last_name\": \"A\",\r\n"
				+ "      \"email\": \"Agni@arulprasath.com\"\r\n"
				+"\r\n"
				+ "}")
		.headers("Content-Type","application/json")
		.when()
		.post("/employees")
		.prettyPrint();
		
	}
	@Test(enabled = false)
	private void putMethod() {
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "      \"first_name\": \"Dinooo\",\r\n"
				+ "      \"last_name\": \"s\",\r\n"
				+ "      \"email\": \"Dinooo@arulprasath.com\"\r\n"
				+"\r\n"
				+ "}")
		.when()
		.put("employees/190")
		.prettyPrint();

	}
	@Test(enabled = false)
	private void deleteMethod() {
		given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/employees/10")
		.prettyPrint();
		
	}
	@Test
	private void createEmployeeFromJsonFile() {
		
		File jsonFile=new File("postData.json");

		given()
		.baseUri("http://localhost:3000")
		.headers("Content-Type","application/json")
		.body(jsonFile)
		.when()
		.post("/employees")
		.prettyPrint();
	}

}
