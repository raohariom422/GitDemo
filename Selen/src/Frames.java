import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Hariom\\\\Automation\\\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("http://jqueryui.com/droppable/");
		dri.switchTo().frame(dri.findElement(By.cssSelector("iframe.demo-frame")));
		//dri.findElement(By.id("draggable")).click();
		Actions a=new Actions(dri);
		WebElement source=dri.findElement(By.id("draggable"));
		WebElement target=dri.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		//comes out of frame
		dri.switchTo().defaultContent();
		
		
		

	}

}
