package week2.day2assi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;







public class DupliccateLead extends BbaseCclass{
@Test
	public void dupicate() throws InterruptedException {
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sat@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		String FirstLeadId = driver.findElement(By.xpath(
				"(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]"))
				.getText();
		System.out.println("leadId is :" + FirstLeadId);
		driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]"))
				.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);

		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The Title is Correct");
		} else {
			System.out.println("There is nothing");
		}

		
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Create Lead']")).click();
Thread.sleep(3000);
		
	}

}