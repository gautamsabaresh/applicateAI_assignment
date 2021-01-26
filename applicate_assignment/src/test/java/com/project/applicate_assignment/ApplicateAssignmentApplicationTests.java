package com.project.applicate_assignment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.json.JsonParseException;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.get;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ApplicateAssignmentApplicationTests {
//Testcase to check if the sku_names are returned if the given text and suppplier ID match and exist in the table.
	@Test
	public void testgetskuname1() {

		get("http://localhost:8080/retail/getskuname/ing/2")
				.then()
				.assertThat()
				.statusCode(200);
	}
//	Testcase when the given text doesn't exist in the table.
	@Test
	public void testgetskuname2(){
		get("http://localhost:8080/retail/getskuname/pppp/2")
		.then()
		.assertThat()
		.statusCode(404);
	}
	
//Testcase for post API of supplier data
	@SuppressWarnings("unchecked")
	@Test
	public void testpostsupplier() throws JsonParseException{
	 RestAssured.baseURI ="http://localhost:8080/retail";
	 RequestSpecification request = RestAssured.given();
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("supplier_id", 5); // Cast
	 requestParams.put("supplier_name", "Singh");
	 request.header("Content-Type", "application/json");
	 request.body(requestParams.toJSONString());
	 Response response = request.post("/addsupplier");
	 response
	 .then()
	 .assertThat()
	 .statusCode(201);
	}
	
	//Testcase of POST API of catalog data
	@SuppressWarnings("unchecked")
	@Test
	public void testpostitem() throws JsonParseException{
	 RestAssured.baseURI ="http://localhost:8080/retail";
	 RequestSpecification request = RestAssured.given();
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("sku_code", 5); // Cast
	 requestParams.put("sku_name", "Polo");
	 requestParams.put("sku_description", "mint"); // Cast
	 requestParams.put("brand_name", "kellogs");
	 requestParams.put("brand_description", "Very Nice"); // Cast
	 requestParams.put("supplier_id", 2);
	 request.header("Content-Type", "application/json");
	 request.body(requestParams.toJSONString());
	 System.out.println(request.toString());
	 Response response = request.post("/addcatalog");
	 response
	 .then()
	 .assertThat()
	 .statusCode(201);
	}
	

}
