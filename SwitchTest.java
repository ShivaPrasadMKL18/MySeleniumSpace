package myspace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTest {
	
	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("webdriver.chrome.driver", "D:\\ChromeWebDriver\\chromedriver_win32\\chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     String baseURL = "https://www.fieldglass.com/";
	     driver.get(baseURL);
	         
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	    
	     driver.findElement(By.xpath("//a[@href='https://www.fieldglass.net/']")).click();
	  
	         
	     /*driver.switchTo().window("https://www.fieldglass.net");	          
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);              
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcdedfdfdfdf@gmail.com");
	     */
	         
	     driver.close();
	  
	}

}
