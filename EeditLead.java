package week2.day2assi;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EeditLead extends BbaseCclass {
@Test
	public void edit()
	{
	driver.findElement(By.linkText("CRM/SFA")).click();
	
		
	driver.findElement(By.linkText("Leads")).click();
	
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathya");
	
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rajumohankumar");
	
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sat");
	
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer application");
	
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("test data for the description.");
	
	
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sat@gmail.com");
	

	WebElement eSou= driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dSour = new Select(eSou);	
	
	dSour.selectByValue("LEAD_CONFERENCE");
	

	
	WebElement sState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	Select dState = new Select(sState);
	
	dState.selectByVisibleText("New York");
	
	
	
	driver.findElement(By.name("submitButton")).click();
	
	
	driver.findElement(By.linkText("Edit")).click();
	
	
	driver.findElement(By.id("updateLeadForm_description")).clear();

	
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is the TestLeaf");
	
	
	driver.findElement(By.className("smallSubmit")).click();
	
	
	String title = driver.getTitle();
	System.out.println("Title is: " + title);
	
	
}


	}


