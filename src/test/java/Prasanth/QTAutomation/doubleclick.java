package Prasanth.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.uitestpractice.com/Students/Actions");
		Thread.sleep(5000);
		WebElement dbclick=driver.findElement(By.name("dblClick"));
		 Actions actions=new Actions(driver);
		 actions.doubleClick(dbclick).build().perform();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
         
	}

}
