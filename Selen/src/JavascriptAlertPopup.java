import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	// if pop up is made by javascript then we could not able to find the xpath of that pop up
		//we need to use the Alert class
		
		System.setProperty("webdriver.gecko.driver", "C:\\Hariom\\Automation\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();// click on ok or yes
		// driver.switchTo().alert().dismiss(); click on no or cancel
		//driver.switchTo().alert().sendKeys(arg0); if u want to enter anything in pop up

	}

}
