package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4_5 {

	public static void main(String[] args) throws Throwable {
			//http://retail.upskills.in/admin/
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://realestate.upskills.in");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.className("sign-in")).click();
			driver.findElement(By.name("log")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("admin@123");
			driver.findElement(By.name("login")).click();
			WebElement link3 = driver.findElement(By.xpath("//li[contains(@class,'with-avatar')]"));
			Actions abc = new Actions(driver);
			//Action moveToLink = abc.moveToElement(link3).click().build();
			//moveToLink.perform();
			Action moveToLink = abc.moveToElement(link3).click().build();
			
			

	}

}
