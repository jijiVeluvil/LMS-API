package lms.StepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lms.Endpoints.ConstantFilePaths;
import lms.Utils.RestassuredExtension;

public class UserLogin {
	Map<String,String> data = new HashMap<String,String>();
	public static ResponseOptions<Response> response;
	
	RequestSpecification request;
	ValidatableResponse valid_resp;
	public static String Admin_token="";
	
	@Given("Admin creates POST Request  with valid credentials.")
	public <val> void admin_creates_post_request_with_valid_credentials(DataTable dataTable) {
		data.put("password", dataTable.cell(1, 1));
		data.put("userLoginEmailId", dataTable.cell(1, 0));
		
		
		
	}

	@When("Admin creates Post Https method  with valid endpoint.")
	public void admin_creates_post_https_method_with_valid_endpoint() {
		
		response = RestassuredExtension.PostOpsWithBody(ConstantFilePaths.USER_LOGIN_ENDPOINT, data);
   	 
	}

	@Then("Admin User receives the bearer token.")
	public void admin_user_receives_the_bearer_token() {
		response.getBody().jsonPath().get("token");
		
		Admin_token = response.body().path("token");
		System.out.println("Token:    "+Admin_token);
	    
	}



}
