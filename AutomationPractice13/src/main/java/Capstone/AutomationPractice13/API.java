package Capstone.AutomationPractice13;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Response io = get("https://reqres.in/api/users?page=2");
		io.prettyPrint();
		int status = io.getStatusCode();
		System.out.println(status);
		Assert.assertEquals(status, 200);
		ResponseBody body = io.getBody();
		String converttostring = body.asString();
		System.out.println(converttostring);
		Assert.assertEquals(converttostring.contains("Ferguson"), true,"name is displaying");*/
		Post();
	}
	public static void Post() {
		File ot = new File(System.getProperty("user.dir")+"\\House.jason");
		Response us = given().header("x-api-key","reqres-free-v1").contentType(ContentType.JSON).body(ot).post("https://reqres.in/api/users");
		us.prettyPrint();
		System.out.println(us.getStatusCode());//In case of Put(), change the name of method as put and use the same code
		

	}

}
