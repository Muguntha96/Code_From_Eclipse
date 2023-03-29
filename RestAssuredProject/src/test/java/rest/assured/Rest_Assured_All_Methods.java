package rest.assured;


import org.testng.annotations.Test;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Rest_Assured_All_Methods {

	@Test(priority=1)
	public void test01() {
		given().
		get("https://reqres.in/api/unknown").
		then().
		body("data.name", hasItems("cerulean")).
	
		statusCode(200).
		log().all();
		
	}
	
	@Test(priority=0)
	public void test_02() {
		JSONObject json=new JSONObject();
		json.put("email","eve.holt@reqres.in");
		json.put("password","pistol");
		given().
		header("Content-Type", "application/json").
		accept("application/json").
		body(json.toString()).
		when().
		post("https://reqres.in/api/register").
		then().
		statusCode(200);
	}
		
@Test()
public  void test_03() {
	given().
	delete("https://reqres.in/api/users/2").
	then().
		statusCode(204);
}
		

	
		

	
	
	
}
