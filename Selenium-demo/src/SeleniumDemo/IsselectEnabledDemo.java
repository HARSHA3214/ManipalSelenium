package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsselectEnabledDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement ee = driver.findElement(By.name("userName"));
		if (ee.isEnabled()) {
			ee.sendKeys("sunil");
			ee.clear();
			ee.sendKeys("sunil");
		}
		if (driver.findElement(By.name("userName")).isDisplayed()) 
		{
			
			driver.findElement(By.name("password")).sendKeys("sunil");
			driver.findElement(By.name("login")).click();
			
		}
		if (driver.findElement(By.xpath("//*[@name = 'tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name = 'tripType' and @value='oneway']")).click();
		}
	}

}
