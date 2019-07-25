package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearning.upskills.in/");
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='list-items-admin']/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\ImtiazNaikwadi\\Desktop\\Goals.txt");

	}

}
