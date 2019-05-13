package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4_4 {

	public static void main(String[] args) throws Throwable {
		//http://retail.upskills.in/admin/
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://retail.upskills.in/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement link2 = driver.findElement(By.id("menu-catalog"));
		Actions click = new Actions(driver);
		click.moveToElement(link2).build().perform();
		click.click();
		

	}

}
