package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

	@Test(enabled = false)
	private void getMethod() {

		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification request = RestAssured.given();
		Response response = request.request(Method.GET, "/employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getStatusCode());
	}
    @Test(enabled = false)
	private void postMethod() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification requestSpecification=
				RestAssured.given()
				.body("{\r\n"
						+ "      \"first_name\": \"Agni\",\r\n"
						+ "      \"last_name\": \"A\",\r\n"
						+ "      \"email\": \"Agni@arulprasath.com\",\r\n"
						
						+ "\r\n"
						+ "    }");
		Response response=requestSpecification.request(Method.POST, "/employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
		System.out.println(response.statusCode());
				
		
	}
    
    @Test(enabled = false)
    private void putMethod() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification request=RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						
						+ "      \"first_name\": \"Ann\",\r\n"
						+ "      \"last_name\": \"Smith\",\r\n"
						+ "      \"email\": \"ann@codingthesmartway.com\"\r\n"
						+ "    }");
	    Response response =request.request(Method.PUT, "/employees/12");
	    System.out.println(response.asPrettyString());
	    System.out.println(response.statusLine());
	    System.out.println(response.statusCode());
	}
    @Test
    private void deleteMethod() {
    	RestAssured.baseURI="http://localhost:3000";
    	RequestSpecification request=RestAssured.given();
    	Response response=request.request(Method.DELETE, "/employees/6");
    	System.out.println(response.asPrettyString());
    	System.out.println(response.statusLine());
    	System.out.println(response.statusCode());
    	
    	
	}

}
