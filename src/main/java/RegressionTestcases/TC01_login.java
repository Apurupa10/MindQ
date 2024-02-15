package RegressionTestcases;

import AllPages.LoginPage;

public class TC01_login extends LoginPage {

	public static void main(String[] args) {
		BrowserLaunch();
		Enter_Email("Apurupa@gmail.com");
		Enter_Pwd("Passsword");
		LoginIn();
		BrowserClose();
	}

}
