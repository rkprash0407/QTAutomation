package Prasanth.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		 WebElement element=driver.findElement(By.id("mySelect"));
	        Select select=new Select(element);
	        //1.  select by index
	        //select.selectByValue("pineapple");
	        //2. select by value
	        //select.selectByVisibleText("Banana");
	        //select.selectByIndex(1);
	        //3.  select by visibletext
	        List<WebElement> fruits = select.getOptions();
	        System.out.println(fruits.size());
	        for (int i=0;i<fruits.size();i++)
	        {
	        	System.out.println("List of Fruits:" +fruits.get(i).getText());
	        }
	        }
	        
	}
	


