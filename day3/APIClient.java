package week2.day3;

public class APIClient {
	
       // Implement sending request with only endpoint
	   public void sendRequest(String endpoint)
	   {
       System.out.println("Sending request to endpoint: " + endpoint);
       }

       // Send request with endpoint, requestBody, and requestStatus
       public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
       {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        System.out.println("Request status: " + requestStatus);
       }
  
       public static void main(String[] args)
       {
		APIClient MethodOverloading = new APIClient();
		MethodOverloading.sendRequest("One Argument");
		MethodOverloading.sendRequest("1st Args", "2nd Args",true);
        }
}
