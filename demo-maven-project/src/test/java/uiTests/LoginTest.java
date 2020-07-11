package uiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	@Test
	public void testCase1() {
		System.out.println("Test message");
		
		Faker f = new Faker();
		
		System.out.println(f.chuckNorris().fact());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(f.address().city());
		}
		
		
	}
	
	
	@Test (groups = {"smoke"})
	
	public void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys(new Faker().book().author() + Keys.ENTER);
		
			
		
	}
	

}
