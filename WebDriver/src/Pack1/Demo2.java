package Pack1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement	UN = driver.findElement(By.name("userName"));
		if(UN.isEnabled())
				{
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			UN.clear();
			
				}
		if(driver.findElement(By.name("userName")).isDisplayed())
			
		{
			System.out.println(UN.getAttribute("value"));
			String name  = UN.getAttribute("value");
			System.out.println(name);
			String name1 = UN.getAttribute("name");
			driver.findElement(By.name(name1)).clear();
			System.out.println(name1);
			String type = UN.getAttribute("type");
			System.out.println(type);
			String label1 = driver.findElement(By.xpath("//*[contains(text(), 'User')]")).getText();
			System.out.println(label1);
			driver.close();
				}
			
	
	}

}
