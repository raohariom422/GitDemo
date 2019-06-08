import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Hariom\\\\Automation\\\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.spicejet.com/");
		//For Currency
//		Select sel=new Select(dri.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
//		//sel.selectByIndex(1);
//		sel.selectByValue("INR");
//		sel.selectByVisibleText("INR");
		
		//For Passengers dropdown
		//int count=0;
		dri.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(1000);
//		while(count<5)
//		{
//		Thread.sleep(1000);
		
//		dri.findElement(By.id("hrefIncAdt")).click();
//		count++;
//		}
		System.out.println(dri.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
			dri.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(dri.findElement(By.id("divpaxinfo")).getText());
		dri.findElement(By.id("btnclosepaxoption")).click();
		
		

	}

}
