package apiAutomation;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;
import static com.jayway.restassured.RestAssured.given;
public class ReusableMethods {
	
	public static void main(String[] args) {
		ReusableMethods post= new ReusableMethods();
		String res=post.makePostCall().toString();
		System.out.println(res);
		//String res=post.postJsonPayload().asString();
		//System.out.println(res);
	}
	
	
	
	/*
	 * public static void makePostCall() { String baseURI=
	 * "https://reqres.in/api/user1";
	 * 
	 * String bo=" '   {  '  + \r\n" + " '       \"name\": \"morpheus\",  '  + \r\n"
	 * + " '       \"job\": \"leader\"  '  + \r\n" + " '  }  ' ; ";
	 * RestAssured.baseURI="https://reqres.in";
	 * 
	 * 
	 * 
	 * String response=
	 * given().body(bo).when().post("/api/users").then().extract().response().
	 * asString();
	 * 
	 * System.out.println(response);
	 * 
	 * }
	 */
	
	    
	/*
	 * public static Response postJsonPayload() { String payload = "{\n" +
	 * "  \"description\": \"Some Description\",\n" + "  \"id\": \"Some id\",\n" +
	 * "  \"name\": \"Some name\"\n" + "}"; return
	 * 
	 * given().contentType(ContentType.JSON)
	 * .body(payload).post("https://reqres.in/api/user1");
	 * 
	 * }
	 */
	
	protected ValidatableResponse makePostCall() {
		
		String url= "https://reqres.in/api/user1";
		 
		 String bo=" '   {  '  + \r\n" + " '       \"name\": \"morpheus\",  '  + \r\n"
		  + " '       \"job\": \"leader\"  '  + \r\n" + " '  }  ' ; ";
		 
		
		ValidatableResponse response;
		RestAssured.baseURI="";
		response=  given().urlEncodingEnabled(true).log().all()
		.body("")
		.post(url)
		.then();
		
		
		return response;
		
		
	}
}
