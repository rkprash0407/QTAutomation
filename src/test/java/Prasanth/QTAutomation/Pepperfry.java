package Prasanth.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pepperfry {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pepperfry.com/");
		Thread.sleep(3000);
		String title=driver.getTitle();
		//System.out.println("title:"+title);
		List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'Online Furniture Shopping Store')]"));
	      // verify list size
	      if ( l.size() > 0){
	         System.out.println("Yes it is present. ");
	      } else {
	         System.out.println("No is not present. ");
	      }
	      
	      driver.findElement(By.xpath("//*[@id=\"homeContainer\"]/div[12]/div/div[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[3]/a")).click();
	      Thread.sleep(1000);
	      List<WebElement> bench1 = driver.findElements(By.xpath("//ul[@class='clip-main-cat-wrpr clip-main-wrap-cat']"));
	      for(int i=0;i<bench1.size();i++)
	      {
	      String b1 = bench1.get(i).getText();
	     // System.out.println("Category :"+i+" ");
	      System.out.println(b1);
	      }
	      
	      WebElement Indus = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[6]/a/div/div[2]/p"));
          System.out.println("Available options of Industrial benches:"+ Indus.getText());
          
          String num=Indus.getText().split(" ")[0];
          int Count=Integer.parseInt(num);
          System.out.println("No. of Industrial benches:"+Count);
          if(Count>1)
          {
              System.out.println("Industrial benches are more than 1");
          } 
          else
          {
              System.out.println("Industrial benches are not available");
          }
          
          driver.close();
	      
	      }
	      
	}


