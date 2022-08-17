package Prasanth.QTAutomation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trainticket {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("HYD");
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("PUNE");
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ENTER);
		WebElement calen = driver.findElement(By.xpath("//p-calendar[@id='jDate']//input[@type='text']"));
		calen.click();
		calen.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']//tr[2]//td[6]")).click();
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.xpath("//p-dropdown[@id='journeyClass']//ul//li/span"));
        for (WebElement option : options)
        {
            String Text=option.getText();
            if (Text.equals("Sleeper (SL)"))
            {
                option.click(); 
                break;
            }
        }
        Thread.sleep(3000);
        //Select the check box "Divyaang concession"
        driver.findElement(By.xpath("//label[@for='concessionBooking']")).click();
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
        Thread.sleep(4000);
        WebElement  tickets=driver.findElement(By.xpath("(//div[@class='hidden-xs']//span)[1]"));
        System.out.println(tickets.getText());
        List<WebElement> Train = driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
        System.out.println("Total Trains: " + Train.size());
        for(int i = 0; i< Train.size(); i++) {
           String s = Train.get(i).getText(); 
           System.out.println("Available Train name & number: " + s);
        }
        //Capture the results screenshot
        File SS=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SS, new File("C:\\SelePics\\IRCTC5.png"));
        //Close the Application
        driver.close();
}
	

	}


