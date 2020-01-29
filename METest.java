package myspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class METest {
	
	public static void main(String[] args) throws Exception {
		 
		
		System.setProperty("webdriver.edge.driver", "D:\\MicrosoftEdgeDriver\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		
		String baseURL = "www.facebook.com";
		driver.get(baseURL);
		
		WebElement touch = driver.findElement(By.name("email"));
		touch.click();
		touch.sendKeys("Hello world");
		Thread.sleep(5);
		
		
		
		driver.quit();
//this is shiva commit.......
//close
//METest
		
	}
}
