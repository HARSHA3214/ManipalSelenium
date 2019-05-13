package SeleniumDemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5_1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.linkText("Admin"));
		Actions abc = new Actions(driver);
		abc.contextClick(link).build().perform();
		Robot RC = new Robot();
		RC.keyPress(KeyEvent.VK_DOWN);
		RC.keyPress(KeyEvent.VK_ENTER);
		RC.keyPress(KeyEvent.VK_CONTROL);
		RC.keyPress(KeyEvent.VK_TAB);
		System.out.println(driver.getCurrentUrl());
		

	}

}
