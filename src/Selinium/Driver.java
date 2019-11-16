package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	static WebDriver driver;

	public static WebDriver getWebDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Softwares\\Chrome Web Drivers 76\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}

}
