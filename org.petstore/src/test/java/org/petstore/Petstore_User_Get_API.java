package org.petstore;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Petstore_User_Get_API {

	@Test(priority = 1)
	public void successful() {
		String username="Mug11";
		given()
		.pathParam("username",username)
		.when()
		.get("https://petstore.swagger.io/v2/user/{username}")
		.then()
		.statusCode(200)
		
		.log().all();

	}
	// @Test(priority = 2)
	public void user_not_found() {
		String username="Mugunthaaa";
		given()
		.pathParam("username",username)
		.when()
		.get("https://petstore.swagger.io/v2/user/{username}")
		.then()
		
		.statusCode(200);



	}


}
