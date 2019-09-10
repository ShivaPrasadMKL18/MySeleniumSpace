package myspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreFront {
	
	  public static void main(String args[]) {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\ChromeWebDriver\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  String baseURL = "http://10.105.149.19/Citrix/RfHTML5Web/";
		  driver.get(baseURL);
		  
		  WebElement store = driver.findElement(By.xpath("//input[@type='text']"));
		  store.click();
		  store.sendKeys("shiva.prasad@citrix.com");
		  driver.findElement(By.xpath("//a[@id='loginBtn']"));
		  
	  }

}
