package Prasanth.QTAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi03b2J4ZX5AhV9ynMBHd0cD0AQPAgI");
        driver.manage().window().maximize();
	}

}
