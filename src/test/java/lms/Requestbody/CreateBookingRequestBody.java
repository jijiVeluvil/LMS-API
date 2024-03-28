/*package lms.Requestbody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lms.Endpoints.ConstantFilePaths;
import lms.Payload.Booking;
import lms.Payload.BookingDates;
import lms.Utils.ExcelReader;

public class CreateBookingRequestBody extends ExcelReader {
	public  Booking bookingPayLoad ;
	public  BookingDates bookingDates;
	
	public List<Booking> Requestbody(){
		
		List<Booking> bookingPayloadList = new ArrayList<>();
        ExcelReader excelReader = new ExcelReader();
        List<Map<String, String>> data = excelReader.getExcelDataWithFilloAPI(ConstantFilePaths.CREATEBOOKING_EXCELDATA, ConstantFilePaths.EXCEL_DATA_QUERRY) ;     
        for (Map<String, String> rowdata : data) {
        	this.bookingPayLoad = new Booking();
    		this.bookingDates= new BookingDates();
    		bookingDates.setCheckin("2024-04-05");
    		bookingDates.setCheckout("2023-04-17");
        	bookingPayLoad.setFirstname(rowdata.get("firstname"));
        	bookingPayLoad.setLastname(rowdata.get("lastname"));
        	bookingPayLoad.setTotalprice(111);
        	bookingPayLoad.setDepositpaid(true);
        	bookingPayLoad.setBookingdates(bookingDates);
        	bookingPayLoad.setAdditionalneeds("true");
        	bookingPayloadList.add(bookingPayLoad);
        	
        	}
        	
        return bookingPayloadList;
   
        }
	
	public List<Booking> RequestbodyanotherWay(){
		List<Booking> bookingPayloadList = new ArrayList<>();
        ExcelReader excelReader = new ExcelReader();
        List<Map<String, String>> data = excelReader.getExcelDataWithFilloAPI(ConstantFilePaths.CREATEBOOKING_EXCELDATA, ConstantFilePaths.EXCEL_DATA_QUERRY) ;
        try {
         bookingDates = new BookingDates("2024-10-03","2024-10-10");
         for (Map<String, String> rowdata : data) {
        	 bookingPayLoad = new Booking(rowdata.get("firstname"),rowdata.get("lastname"),Integer.parseInt(rowdata.get("totalprice")),true,bookingDates,"breakfast");
         }
         }catch (NumberFormatException e) {
             // Handle the case where the inputString is not a valid integer
             e.printStackTrace(); // Or log the error
         }
        return bookingPayloadList;
	}
}*/
