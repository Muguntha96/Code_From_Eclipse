package org.petstore;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//import org.json.JSONObject;

public class Petstore_user_login {
	
	@Test(priority = 1)
	public void valid_user_login() {
		given()
		.queryParam("username","Rams1")
		.queryParam("password","12345")
		.header("api_key","special-key")
		.accept("application/json")
		.when()
		.get("https://petstore.swagger.io/v2/user/login")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority = 2)
	public void user_logOut() {
		given()
		.get("https://petstore.swagger.io/v2/user/logout")
		.then()
		.statusCode(200);
		
	}
	
	
	

}
