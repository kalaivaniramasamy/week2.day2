package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://acme-test.uipath.com/login");
		chromeDriver.manage().window().maximize();
		chromeDriver.findElement(By.id("email")).sendKeys("kalai.testleaf@gmail.com");
		chromeDriver.findElement(By.id("password")).sendKeys("kalai@23");
		Thread.sleep(3000);
		chromeDriver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("Page Title : "+chromeDriver.getTitle());
		Thread.sleep(3000);
		chromeDriver.findElement(By.linkText("Log Out")).click();
		
	}

}
