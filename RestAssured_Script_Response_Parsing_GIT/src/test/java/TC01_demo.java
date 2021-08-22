import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class TC01_demo {
	@Test
	void storeResponse()
	{
		Response resPonse;
		resPonse = RestAssured.get("https://api.exchangeratesapi.io/v1/latest?access_key=b735637fd9878096661343ed2ed964e4");		
		((RestAssured) resPonse).given().when().get().then().log().ifValidationFails().statusCode(200);	
	}
}
