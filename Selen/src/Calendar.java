
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("https://www.spicejet.com/");
		dri.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dri.findElement(By.xpath("//a[contains(text(),' Bengaluru (BLR)')] ")).click();
		Thread.sleep(1000);
		//dri.findElement(By.xpath("(//a[contains(text(),' Ahmedabad (AMD)')])[2]")).click();
		dri.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),' Ahmedabad (AMD)')]"))
		.click();
		//Month
		dri.findElement(By.cssSelector("div[id='ui-datepicker-div'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		WebElement mont=dri.findElement(By.cssSelector("div[id='ui-datepicker-div'] [class='ui-icon ui-icon-circle-triangle-e']"));
	while(!mont.getText().contains("July 2019"))
		{
			dri.findElement(By.cssSelector("div[id='ui-datepicker-div'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		//-dri.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
// month and date
		//dri.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		//class name will be same in path if u see in html(common logic every date have)
		//grab the common attribute put it into list and iterate
		Thread.sleep(1000);
		List<WebElement> dates=dri.findElements(By.xpath("//td[@data-handler='selectDay']"));
		int count=dates.size();
		for(int i=0;i<count;i++)
		{
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				dates.get(i).click();
				break;
			}
		}
		
	}

}
