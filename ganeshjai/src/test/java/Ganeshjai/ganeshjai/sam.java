package Ganeshjai.ganeshjai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sam {
	WebDriver driver;
	@BeforeTest
	public void test1() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
	
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
	
		
		
		
	}
	@Test
	public void click() {
		WebElement elem = driver.findElement(By.id("twotabsearchtextbox"));
		elem.click();
		elem.sendKeys("Acceroies");

	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
