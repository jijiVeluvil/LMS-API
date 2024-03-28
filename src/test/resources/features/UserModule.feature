@UserModule
Feature: LMS API UserModule

  @GET_User_with_All_Roles_01
  Scenario: Check if admin able to retrieve all Admins with roles
    Given Admin sets authorization to bearer token
    When Admin sends HTTPS Request with endpoint
    Then Admin receives 200 OK Status with response body.
    
   @GET_User_With_All_Roles_02 
   Scenario: Check if admin able to retrieve all Admins with roles with No authorization
   	Given Admin sets authorization to No  Auth.
		When Admin sends HTTPS Request with endpoint
		Then Admin receives status 401 with Unauthorized message.
		
	 @GET_User_With_All_Roles_03 
   Scenario: Check if admin able to retrieve all Admins with roles with invalid endpoint
   	Given Admin sets authorization to bearer token
		When Admin sends HTTPS Request with invalid endpoint
		Then Admin receives status 404 with Not Found error message
		
		

		
		
   	
                                                                      


    
