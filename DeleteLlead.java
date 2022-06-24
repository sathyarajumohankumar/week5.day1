package week2.day2assi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;







public class DeleteLlead extends BbaseCclass{
@Test
	public void delete() throws InterruptedException {

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String leadId = driver.findElement(By.xpath("(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]"))
				.getText();
		System.out.println("leadId is :" + leadId);

		driver.findElement(By.xpath(
				"(//button[@class='x-btn-text x-tbar-page-first']/preceding::div[@class='x-grid3-scroller']//a)[1]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		if (driver.getTitle().contains("TestLeaf")) {
			System.out.println("Title is Correct");
		} else {
			System.out.println("Nothing");
		}
}

}