import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Hariom\\\\Automation\\\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("https://accounts.google.com/signout/chrome/landing?continue=https://mail.google.com/mail&oc=https://mail.google.com/mail&hl=en");
		dri.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		System.out.println(dri.getTitle());
		
		//to get all the windows
		Set<String> id=dri.getWindowHandles();
		Iterator<String> it=id.iterator();
		String Parent=it.next();
		String child=it.next();
		dri.switchTo().window(child);
		System.out.println(dri.getTitle());
		dri.switchTo().window(Parent);
		
	

	}

	
}
