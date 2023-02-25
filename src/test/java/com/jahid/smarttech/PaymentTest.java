package com.jahid.smarttech;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class PaymentTest {
	
	public static void main(String[] args) {
		String url = "https://samples.openweathermap.org/data/2.5/weather?q=newyork,us&appid=25e4fc6e6b2e357a177262c7005";
        Response response = RestAssured.request(Method.GET, url);
        
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        
        
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);
	}

}
