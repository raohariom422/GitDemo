import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Hariom\\\\Automation\\\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.spicejet.com/");
		dri.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dri.findElement(By.xpath("//a[contains(text(),' Bengaluru (BLR)')] ")).click();
		Thread.sleep(1000);
		//dri.findElement(By.xpath("(//a[contains(text(),' Ahmedabad (AMD)')])[2]")).click();
		dri.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),' Ahmedabad (AMD)')]"))
		.click();

	}

}
