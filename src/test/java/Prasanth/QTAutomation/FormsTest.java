package Prasanth.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormsTest {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Form");
		
		WebElement fn=driver.findElement(By.id("firstname"));
		fn.sendKeys("Prasanth");
		String fnname=fn.getAttribute("value");
		System.out.println("First Name: "+fnname);
		
		WebElement ln=driver.findElement(By.id("lastname"));
		ln.sendKeys("RK");
		String lnname=ln.getAttribute("value");
		System.out.println("last Name: "+lnname);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[2]/input")).click();
		
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]/input")).click();
        
        WebElement drp= driver.findElement(By.id("sel1"));
        Select select= new Select(drp);
        select.selectByVisibleText("Canada");
        
        driver.findElement(By.id("datepicker")).sendKeys("04/07/1992");
        
        driver.findElement(By.id("phonenumber")).sendKeys("123456789");
        
        WebElement us=driver.findElement(By.id("username"));
        us.sendKeys("prasanth04");
        String usname=us.getAttribute("value");
        System.out.println("User Name: "+usname);
        
        WebElement mail=driver.findElement(By.id("email"));
        mail.sendKeys("prasanth04@gmail.com");
        String mailid=mail.getAttribute("value");
        System.out.println("Email: "+mailid);
        
        WebElement cmnt=driver.findElement(By.id("comment"));
        cmnt.sendKeys("I am very good boy");
        String comment=cmnt.getAttribute("value");
        System.out.println("About me: "+comment);
        
        
        
        WebElement pwd=driver.findElement(By.id("pwd"));
        pwd.sendKeys("password");
               
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
