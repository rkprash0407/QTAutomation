package Prasanth.QTAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        String t=driver.getTitle();
        System.out.println(t);
	}

}
