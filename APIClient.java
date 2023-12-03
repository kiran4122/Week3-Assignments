package week3.day2;

public class APIClient {
	
	
	public void sendRequest(String endpoint) {
		
		System.out.println("Endpoint is :"+ endpoint);
		
	}
	

	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		
		System.out.println("Endpoint is :"+endpoint+ "; Request Body is :"+requestBody+ "; Request Status is:"+requestStatus);
		
	}

	public static void main(String[] args) {
APIClient c1 = new APIClient();
c1.sendRequest("https://www.google.com");
c1.sendRequest("https://facebook.com", "ltest", true);


	}

}
