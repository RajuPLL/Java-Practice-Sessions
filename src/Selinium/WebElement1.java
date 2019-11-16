package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebElement1 {
	static By login = By.id("email");
	static By password = By.id("pass");
	static By loginbutton = By.xpath("//input[@value = 'Log In']");
	static WebDriver driver;

	public static void setinput(String LoginID, String Password) {
		driver.findElement(login).sendKeys(LoginID);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(loginbutton).click();
	}

	public static void main(String[] args) {
		driver = Driver.getWebDriver();
		driver.navigate().to("https:\\www.facebook.com");
		setinput("Karmakar9177@gmail.com", "8768949899");

	}

}
