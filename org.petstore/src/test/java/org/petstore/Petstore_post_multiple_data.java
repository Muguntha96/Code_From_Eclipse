package org.petstore;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class Petstore_post_multiple_data {
	
	
	
	
	
	@Test
	public void user_multiple_data() {
		JSONObject json=new JSONObject();
		json.put("id",30);
		json.put("username","Muguntha26");
		json.put("firstName","Muguntha26");
		json.put("lastName","Ramkumar26");
		json.put("email","gml@gmail.com");
		json.put("password","223344");
		json.put("phone","989384345");
	    json.put("userStatus",20);
		given()
		.header("Content-Type","application/json")
		.accept("application/json")
		.header("api_key","special-key")
		.body(json.toString())
				.when()
		.post("https://petstore.swagger.io/v2/user")
		.then()
		.statusCode(200)
		.log().all();
	}

}
