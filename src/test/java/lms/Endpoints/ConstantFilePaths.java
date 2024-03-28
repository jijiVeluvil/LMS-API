package lms.Endpoints;

public class ConstantFilePaths {
	public static final String CREATEBOOKING_EXCELDATA = "./src/test/resources/bookingApItestData.xlsx";
	public static final String STATUS_CODE_QUERRY = "select expectedstatuscode from createbooking where Run='Yes'";
	public static final String EXCEL_DATA_QUERRY = "select * from createbooking where Run = 'Yes'";
	
	public static final String  BASE_URL = "https://lms-marchapi-hackathon-a258d2bbd43b.herokuapp.com/lms";
	
	//userModuleEndpoints
	public static final String USER_LOGIN_ENDPOINT = "/login";
	public static final String All_USERS_WITH_ROLES_ENDPOINT = "/users/roles";
	public static final String ALL_USERS_WITH_ROLES_INVALID_ENDPOINT = "/users/role";
	

}
