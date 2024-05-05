package week2.day3;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter the Username");
	}
	public void enterPassword() {
		System.out.println("Enter the Password");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LoginTestData Information = new LoginTestData();
     Information.enterCredentials();
     Information.navigateToHomePage();
     Information.enterUsername();
     Information.enterPassword();
	}

}
