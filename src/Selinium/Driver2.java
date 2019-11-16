package Selinium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver2 {
	
	WebDriver driver;
	
	public WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "\"F:\\\\Softwares\\\\Chrome Web Drivers 76\\\\chromedriver_win32\\\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		return driver;	
	}

}
