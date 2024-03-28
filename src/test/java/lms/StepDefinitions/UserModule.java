package lms.StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import lms.Endpoints.ConstantFilePaths;
import lms.Utils.RestassuredExtension;

public class UserModule {
	public static Response response;
	@Given("Admin sets authorization to bearer token")
	public void admin_sets_authorization_to_bearer_token() {
	    RestassuredExtension.requestWithAuth(UserLogin.Admin_token);
	    System.out.println("Token:    " +UserLogin.Admin_token);
	}

	@When("Admin sends HTTPS Request with endpoint")
	public void admin_sends_https_request_with_endpoint() {
	    response = RestassuredExtension.getAllRequestWithEndpoint(ConstantFilePaths.All_USERS_WITH_ROLES_ENDPOINT);
	}

	@Then("Admin receives {int} OK Status with response body.")
	public void admin_receives_ok_status_with_response_body(Integer int1) {
		response.then().statusCode(int1);
        System.out.println(response.getBody().asPrettyString());
	}
	
	@Given("Admin sets authorization to No  Auth.")
	public void admin_sets_authorization_to_no_auth() {
	    RestassuredExtension.requestWithNoAuth();
	}

	@Then("Admin receives status {int} with Unauthorized message.")
	public void admin_receives_status_with_unauthorized_message(Integer int1) {
		response.then().statusCode(int1);
        System.out.println(response.getBody().asPrettyString());
	}
	@When("Admin sends HTTPS Request with invalid endpoint")
	public void admin_sends_https_request_with_invalid_endpoint() {
	    response = RestassuredExtension.getAllRequestWithEndpoint(ConstantFilePaths.ALL_USERS_WITH_ROLES_INVALID_ENDPOINT);
	}

	@Then("Admin receives status {int} with Not Found error message")
	public void admin_receives_status_with_not_found_error_message(Integer int1) {
		response.then().statusCode(int1);
        System.out.println(response.getBody().asPrettyString());
	}

}
