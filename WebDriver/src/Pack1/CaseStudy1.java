package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		
		String Underconstitle = "Under Construction : Mercury Tours";
		List<WebElement> link = driver.findElements(By.tagName("a"));
		String[] linktext = new String[link.size()];
		int i=0;
		for(WebElement e:link)
		{
			linktext[i] = e.getText();
			i++;
			
		}
		for(String t:linktext)
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(Underconstitle))
			{
				System.out.println("\"" + t + "\"" + "\"+ underconstruction");
			}
			else
			{
				System.out.println("\"" + t + "\"" + "\" + is working");
			}
			
		}
	}

}
