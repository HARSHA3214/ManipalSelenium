package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		String Parentwindow = driver.getWindowHandle();
		System.out.println("Parentwindow: " + Parentwindow);
		WebElement clickbutton = driver.findElement(By.id("button1"));
		for(int i=0;i<=3;i++)
		{
			clickbutton.click();
			Thread.sleep(2000);
			driver.manage()
			driver.getWindowHandle()
			
		}
			
	}

}
