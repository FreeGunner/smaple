import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class TC04_Demo {
	
	@Test
	  public void user() {
		
		//Create a reference for Response interface
		Response response;
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a reference variable created above.
		response = RestAssured.get("http://localhost:8080/InfyClinicV2/APP_V2/getDoctor/byId?doctorId=1001");
		
		//Validating STATUS CODE from response
		int statusCode = response.getStatusCode();
		Assert.assertNotEquals(statusCode,200);
		
		//Validating STATUS LINE from response
		String statusLine = response.getStatusLine();
		Assert.assertNotEquals(statusLine /*actual value*/, "HTTP/1.1 200 " /*expected value*/);
		
		//Validating CONTENT TYPE from response
		String contentType = response.getContentType();
		Assert.assertEquals(contentType /* actual value */, "application/json;charset=UTF-8" /* expected value */);
		
		//Validating text from response
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains("John") /*Expected value*/, true /*Actual Value*/, "Response body does not contain John");
	}
}

