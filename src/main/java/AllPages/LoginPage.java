package AllPages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import BasePackage.BaseClass;


public class LoginPage extends BaseClass {
	static By username = By.id("email");
	static By password = By.id("pass");
	static By loginbutton = By.name("login");
	//public static WebDriver driver;
	
	public static void Enter_Email(String EmailId)
	{
		//WebDriver driver = new ChromeDriver();
		driver.findElement(username).sendKeys(EmailId);
	}
	
	public static void Enter_Pwd(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public static void LoginIn()
	{
		driver.findElement(loginbutton).click();
	}


}
