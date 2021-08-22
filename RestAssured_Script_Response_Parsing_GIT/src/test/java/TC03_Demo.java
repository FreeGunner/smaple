import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.RestAssured;


public class TC03_Demo {
	Response r;
	String url;
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		   url ="http://api.exchangeratesapi.io/v1/latest?access_key=b735637fd9878096661343ed2ed964e4";
	}
	@When("posted with correct Information")
	public void posted_with_correct_information() {
		 r =  RestAssured.get(url).then().log().all().extract().response(); 
		 
		 }

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		String sOp=r.getStatusLine();
		Assert.assertFalse(true,sOp="HTTP/1.1 200 OK");
		
	}
	

}