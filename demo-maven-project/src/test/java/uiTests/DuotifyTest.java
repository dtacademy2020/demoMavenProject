package uiTests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DuotifyTest {
	
	
	@Test (groups = {"smoke"})
	public void negativeLogin() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://test2-env.eba-3s8p7zn5.us-east-2.elasticbeanstalk.com/register.php");
		
		driver.findElement(By.id("loginUsername")).sendKeys("duotech");
		
		driver.findElement(By.id("loginPassword")).sendKeys("duotech202");
		
		driver.findElement(By.name("loginButton")).click();
		
		assertTrue(driver.getPageSource().contains("Your username or password was incorrect"));
		
	}

}
