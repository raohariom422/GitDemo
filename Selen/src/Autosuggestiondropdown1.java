import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32 (74v)\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("https://roofandfloor.thehindu.com/");
		dri.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		WebElement source=dri.findElement(By.xpath("//input[@type='text']"));
		source.clear();
		source.sendKeys("sowp");
		Thread.sleep(1000);
		source.sendKeys(Keys.DOWN);
		String text=source.getText();
		System.out.println(text);
		// text wont come due to hidden text selenium could not able to find hidden text-Ajax implementation
		// Javascript dom can extract hidden elements
		//investigate the properties of the object if it have any hidden text
		// javascriptexecutor if u want to print we will use return instead of syso
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)dri;
		String script=" return document.getElementsByClassName(\\\"ant-input ant-select-search__field\\\").value;";
		String test=(String) js.executeScript(script);
		int i=0;
		while(!test.equalsIgnoreCase("Sowparnika Flamenco"))
		{
			i++;
			source.sendKeys(Keys.DOWN);
			script=" return document.getElementsByClassName(\\\"ant-input ant-select-search__field\\\").value;";
			test=(String) js.executeScript(script);
			if(i>10)
			{
				break;
			}
			
			
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("element found");
		}
		
		
		
		
		
		

	}

}
