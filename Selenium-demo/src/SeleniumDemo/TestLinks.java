package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Hotels")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Under"))
		{
		System.out.println("Page is not working");

	}
		else {
			System.out.println("Page is working");
		}
}
}
