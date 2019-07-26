package Pack1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver_win32_new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");		
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Performance")).click();	*/
		
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		System.out.println("Link Count is: "+linkCount.size());
		System.out.println("Total Links: \n");
		for(WebElement e:linkCount){
			String text = e.getText();
			System.out.println(text);
		}
		
		
		List<WebElement> linkCount1 = driver.findElements(By.xpath("//*[contains(@href,'underconst')]"));
		System.out.println("\nUnder Construction Link Count is: "+linkCount1.size());
		for(WebElement e:linkCount1){
			String text = e.getText();
			System.out.println(text);
		} 
		System.out.println("Second Git Test");


	}

}
