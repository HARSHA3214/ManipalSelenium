package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String ExpectedTitle = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Title is same and Logout");
			driver.findElement(By.className("panelTrigger activated-welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@id='welcome-menu']/ul/li[2]/a")).click();
		} else {
			System.out.println("Title is not same");
		}
		
		

	}

}
