package rest.assured;

import org.testng.annotations.Test;
import org.json.JSONObject;
import static io.restassured.RestAssured.*;

public class Rest_Assured_Put_Method {
	
	@Test
	public void test01() {
		JSONObject json=new JSONObject();
		json.put("name","Ramkumar");
		json.put("job","Engineer");
		
		System.out.printf("Updated json is : %s" ,json.toString(2));
		System.out.println();
		given().
		header("Content-Type","application/json").
		body(json.toString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
		
		
		

	}

}
