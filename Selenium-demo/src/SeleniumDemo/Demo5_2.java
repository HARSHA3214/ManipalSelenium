package SeleniumDemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("tabcount: "+tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.linkText("Create an account")).click();
		driver.switchTo().window(tabs.get(0));
		tabs.size();
		
		
}
}
