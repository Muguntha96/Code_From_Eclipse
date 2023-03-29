package org.petstore;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Petstore_User_Post_API {


	@Test
	public void user_create() {
		JSONObject json=new JSONObject();
		json.put("id",17);
		json.put("username","Muguntha17");
		json.put("firstName","Muguntha1");
		json.put("lastName","Ramkumar1");
		json.put("email","abc@gmail.com");
		json.put("password","12345");
		json.put("phone","98938444");
		json.put("userStatus",1);
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
