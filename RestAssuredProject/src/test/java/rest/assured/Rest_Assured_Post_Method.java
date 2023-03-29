package rest.assured;


import org.json.JSONObject;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class Rest_Assured_Post_Method {


	@Test
	public void test01() {
//				Map<String, Object> map=new HashMap<String, Object>();
//				map.put("name", "Muguntha");
//				map.put("job", "tester");
//				System.out.println(map);


		//		System.out.println(json);
		//		System.out.println(json.toString(2));

//		RestAssured.baseURI="https://reqres.in";
//		RequestSpecification request = RestAssured.given();
//		request.header("Content-Type","application/json");
		JSONObject json=new JSONObject();
		json.put("name", "Muguntha");
		json.put("job", "tester");
		//System.out.println(json);
		System.out.println(json.toString(2));
		given().
		header("Content-Type","application/json").
		accept("application/json").
		body(json.toString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
			
		

		




	}

}
