package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriharshaRegulavalas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.name("userName"));
		Username.sendKeys("sunil");
		//String attribute1 = Username.getAttribute("value");
		//System.out.println(attribute1);
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@name = 'tripType' and @value='oneway']")).click();
		WebElement ele = driver.findElement(By.name("passCount"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("1");
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		sel.ge
		for (int i=0; i< data.size(); i++)
				{
			System.out.println(data.get(i).getText());
				}
		WebElement ele1 = driver.findElement(By.name("fromPort"));
		Select sel1 = new Select(ele1);
		sel1.selectByVisibleText("London");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='radio' and @value = 'Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Sriharsha");
		driver.findElement(By.name("passLast0")).sendKeys("R");
		driver.findElement(By.name("creditnumber")).sendKeys("01234567890");
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for (WebElement e:checkbox)
		{
			e.click();
		}
		
		
		driver.findElement(By.name("buyFlights")).click();
	}

}
