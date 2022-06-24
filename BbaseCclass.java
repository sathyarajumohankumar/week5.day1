package week2.day2assi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BbaseCclass {
	

	
	
		public ChromeDriver driver;
		
			@BeforeMethod
		   public void preCondition(){
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			WebElement eleName = driver .findElement(By.id("username"));
			eleName.sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();		
	}

	@AfterMethod
	 public void postCondition() {
	   driver.close();
	 }
	}