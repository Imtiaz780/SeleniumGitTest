package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		
		WebElement RD = driver.findElement(By.xpath("//*[@value='roundtrip']"));
		
		if (RD.isSelected())
			
		{
			System.out.println("Round Trip enabled");
			driver.findElement(By.xpath("//*[@value='oneway']")).click();
			System.out.println("One Way Trip Enabled");
		}
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);

		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
		System.out.println(data.get(i).getText());
		}
	
	   sel.selectByVisibleText("2");
	   Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("1");
		
		driver.findElement(By.xpath("//*[@name='servClass'] ")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.xpath("//*[@name='servClass'and @value ='Busniess']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Imtiaz");
		driver.findElement(By.name("passLast0")).sendKeys("Naikwadi");
		driver.findElement(By.name("creditnumber")).sendKeys("4567 7860 7860");
		List<WebElement> checkbox  = driver.findElements(By.name("ticketLess"));
		
		for(WebElement e:checkbox)
		{
		e.click();
		}

		for(int i=1;i<checkbox.size();i++)
		{
		checkbox.get(i).click();
		}

	}

}
