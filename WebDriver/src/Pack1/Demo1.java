package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.className("txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println(label1);
		System.out.println("github test");
		driver.close();
		
	}

}
