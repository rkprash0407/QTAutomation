package Prasanth.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trivago {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.trivago.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		// select Mumbai location
		driver.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@data-testid='suggestion-title'])[1]")).click();
		Thread.sleep(2000);
		//Select the check-in and check-out dates
		driver.findElement(By.xpath("//span[@class='absolute w-2 h-2 bg-grey-900 transform rotate-45 -translate-y-1/2 top-1/2 -translate-x-1/2 left-0']")).click();
		driver.findElement(By.xpath("//span[@class='absolute w-2 h-2 bg-grey-900 transform rotate-45 -translate-y-1/2 top-1/2 translate-x-1/2 right-0']")).click();
		  Thread.sleep(2000);
    	driver.findElement(By.xpath("//button/span[@class='inline-flex leading-none transform self-center']")).click();
    	 Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@data-testid='guest-selector-apply']")).click();
	   Thread.sleep(30000);
	   WebElement rating= driver.findElement(By.id("sorting-selector"));
	   Select select = new Select(rating);
	   select.selectByIndex(4);
	   Thread.sleep(10000);
	   List<WebElement> Hotels = driver.findElements(By.xpath("//button[@data-testid='item-name']//span[@itemprop='name']"));
       System.out.println("No. of Hotels: " + Hotels.size());
       for(int i = 0; i< Hotels.size(); i++) {
         String h = Hotels.get(i).getText();
         System.out.println("Hotel name: " + h);
	   List<WebElement> hlist=driver.findElements(By.xpath("//p[@class='font-bold text-green-900 text-xl']"));
	   for(int a = i; a< hlist.size();)
	   {
		   System.out.println("rent: "+hlist.get(a).getText());
		   System.out.println();
		   String s=hlist.get(a).getText();
		   if(s.equals(s))
		   {
		   break;
	   }
       }

	}
       List<WebElement> Rlist=driver.findElements(By.xpath("//span[@itemprop='ratingValue']"));
       for(int k = 0; k< Rlist.size();k++)
       {
    	 
           for(int i = k; i< Hotels.size();) {
             String h = Hotels.get(i).getText();
            System.out.println("Hotel name: " + h);
           String R=Rlist.get(k).getText();
          System.out.println("Rating: "+R);
          
          String E=Rlist.get(k).getText().split(" ")[0];
        Float Count=Float.parseFloat(E);
        
            if(Count<10&&Count>9)
            {
            	
                System.out.println("Rating of the Hotel is high");
                System.out.println();
                break;
            }
            else
            {
                System.out.println("Rating is low");
            }
       }
     }
	}

}
