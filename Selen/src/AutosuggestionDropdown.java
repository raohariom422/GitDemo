import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Hariom\\\\Automation\\\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
	    dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("https://roofandfloor.thehindu.com/");
		dri.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		WebElement source=dri.findElement(By.xpath("//input[@type='text']"));
		source.clear();
		source.sendKeys("sowp");
		
		//
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		WebDriverWait d=new WebDriverWait(dri,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']")));
		//d.until(ExpectedConditions.elementToBeClickable(locator));
		Wait<WebDriver> wt=new FluentWait<WebDriver>(dri).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3));
//		WebElement foo=wt.until(new Function<WebDriver, WebElement>() {
//			public WebElement applyy(WebDriver driver) {
//			return driver.findElement(By.id("foo"));
//			}
//			});
		dri.findElement(By.xpath("//button[@type='button']")).click();
		
	

	}

}
