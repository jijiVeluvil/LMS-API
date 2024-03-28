package lms.Utils;



import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lms.Endpoints.ConstantFilePaths;

public class RestassuredExtension {
	private static RequestSpecification reqSpecific;
	
	public RestassuredExtension() {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(ConstantFilePaths.BASE_URL);
		builder.setContentType(ContentType.JSON);
		reqSpecific = RestAssured.given().spec(builder.build());
		
	}	
		
	public static ResponseOptions<Response> PostOpsWithBody(String url,Map<String, String> body)  {
	        reqSpecific.body(body);
	        return reqSpecific.post(url);
	    }
	
	public static void requestWithAuth(String token) {
		reqSpecific.header(new Header("Authorization", "Bearer " +token ));
		
	}
	public static void requestWithNoAuth() {
		reqSpecific.header(new Header("NoAuth"," "));
		
	}
	
	
	public static Response  getAllRequestWithEndpoint(String endPoint) {
		try {
		 return reqSpecific.get(new URI(endPoint));
		}catch(URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	
	}
	
	
	/*public static void getWithPathParram(String url, Map<String,String> pathParam) {
		
		
		try {
			reqSpecific.pathParam("id", pathParam);
			reqSpecific.get(new URI(url));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public static ResponseOptions<Response> postRequest(String url, Map<String,String> body, String token) {
		
		try {
			reqSpecific.header(new Header("Authorization", "Bearer " +token ));
			reqSpecific.body(body);
			return reqSpecific.post(new URI(url));
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/

	
}
