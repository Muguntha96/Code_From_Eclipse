package org.petstore;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;
public class Petstore_User_Update {
	//@Test
	public void update_user() {
		
		JSONObject json=new JSONObject();
		json.put("id",30);
		json.put("username","Ram122");
		json.put("firstName","Muguntha1");
		json.put("lastName","Ramkumar1");
		json.put("email","abc@gmail.com");
		json.put("password","12345");
		json.put("phone","98938444");
		json.put("userStatus",1);
		given()
		.header("Content-Type","application/json")
		.accept("application/json")
		.pathParam("username", "Rams")
		.header("api_key","special-key")
		.body(json.toString())
		.when()
		.put("https://petstore.swagger.io/v2/user/{username}")
		.then()
		
		.statusCode(200)
		.log().all();
		
	}
	
	@Test(dependsOnMethods = "del_req")
	public void get_user() {
		given()
		.get("https://petstore.swagger.io/v2/user/Rams1")
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void del_req() {
		given()
		.delete("https://petstore.swagger.io/v2/user/Ram")
		.then()
		.statusCode(200);
		
	}

}
