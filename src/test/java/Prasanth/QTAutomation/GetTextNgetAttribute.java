package Prasanth.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextNgetAttribute {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		String text = driver.findElement(By.id("p3")).getText();
        System.out.println(text);
        WebElement un=driver.findElement(By.id("input1"));
        WebElement pw=driver.findElement(By.id("input2"));
        un.sendKeys("JAVA");
        pw.sendKeys("SELENIUM");
        String Us1 =un.getAttribute("value");
        System.out.println(Us1);
        String Pd1 =pw.getAttribute("value");
        System.out.println(Pd1);
        un.clear();
        pw.clear();
        un.sendKeys("selenium");
        pw.sendKeys("java");
        Us1 =un.getAttribute("value");
        System.out.println(Us1);
        Pd1 =pw.getAttribute("value");
        System.out.println(Pd1);

	}

}
