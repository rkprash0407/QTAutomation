package Prasanth.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		String title= driver.getTitle();
		System.out.println("WebPage Title: " +title);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement sort = driver.findElement(By.id("s-result-sort-select"));
		Select select = new Select(sort);
		
		List<WebElement> list = select.getOptions();
		
		System.out.println("total options: "+list.size());
		
		System.out.println("The Options are:");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(2000);
		select.selectByVisibleText("Newest Arrivals");
		//Thread.sleep(2000);
		WebElement arrival = driver.findElement(By.id("s-result-sort-select_4"));
		Boolean newest= arrival.isDisplayed();
		if(newest=true) {
            System.out.println("Newest Arrival is loaded");
        }
        else
        {
            System.out.println("not loaded");
        }
		driver.close();
		
		

	}

}
