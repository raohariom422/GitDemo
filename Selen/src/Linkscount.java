import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//count of links on page
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("http://qaclickacademy.com/practice.php");
		List<WebElement> count=dri.findElements(By.tagName("a"));
		System.out.println(count.size());
		//find the links only in footer section
		WebElement footer=dri.findElement(By.id("gf-BIG"));
		List<WebElement> footcount=footer.findElements(By.tagName("a"));
		System.out.println(footcount.size());
		
		//count of only first column section in footer
		WebElement firstcol=dri.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
		List<WebElement> firco=firstcol.findElements(By.tagName("a"));
		int county=firco.size();
		// click on each link and check the links are working
		// solution is -> if we hold cltrl+click the page will open in new tab
		// we will open all the links in new tab and by get window handles we will get title of all tha pages
		for(int i=1;i<county;i++)
		{
			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstcol.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(1000);
		}
			Set<String> win=dri.getWindowHandles();
			Iterator<String> it=win.iterator();
			while(it.hasNext())
			{
				dri.switchTo().window(it.next());
				System.out.println(dri.getTitle());
			}
			
		}
		
				
		
		
		

	}


