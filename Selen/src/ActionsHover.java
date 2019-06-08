import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("https://www.amazon.in/");
		Actions a=new Actions(dri);
		//Moves to specific element
		WebElement ele=dri.findElement(By.id("nav-link-yourAccount"));
		a.moveToElement(ele).build().perform();
		//right click
		a.moveToElement(ele).contextClick().build().perform();
		//a.moveToElement(dri.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//double click
		a.moveToElement(dri.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").
		doubleClick().build().perform();
	
		

	}

}
