package rest.assured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;


public  class Rest_Assured_Get_Method {
	
	//@Test
	public void test_01() {
		
		Response response=get("https://reqres.in/api/users?page=2");
		
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Response Body : "+response.getBody().asString());
		System.out.println("Response Header : "+response.getHeader("ContentType"));
	}	
	
	@Test
	public void test_02() {
		
		given().get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7))
			.body("data.first_name", hasItems("Michael","Lindsay"))
			.log().all();
	}

	

	

}
