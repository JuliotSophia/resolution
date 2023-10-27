package DockerSam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Samp {
	
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chromedriver","E:\\gokila\\chromedriver.exe");
	     WebDriver driver = new FirefoxDriver();		
	     driver.get("https://www.google.com/");
	     	driver.exit();
			driver.quit();
		
		
		
	}

}
