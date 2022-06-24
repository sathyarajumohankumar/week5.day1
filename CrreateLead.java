package week2.day2assi;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CrreateLead extends BbaseCclass{

		@Test
		public  void create() {

				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
			  	driver.findElement(By.id("firstNameField")).sendKeys("sathya");
				driver.findElement(By.id("lastNameField")).sendKeys("sairam");
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sat");
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sai");
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
				driver.findElement(By.id("createContactForm_description")).sendKeys("leading Company");
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sat@gmail.com");
				WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select sa = new Select(state);
				sa.selectByVisibleText("New York");
				driver.findElement(By.className("smallSubmit")).click();
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateContactForm_description")).clear();
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Amazing Sel");
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				System.out.println("Title of Web Page is :"+driver.getTitle());
			
					
							
			
			
			
			
			


		}
	}

