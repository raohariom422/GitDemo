import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Hariom\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.rediff.com/");
//		driver.findElement(By.cssSelector("a[title*='Already a user? Sign in']")).click();
//		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("email");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("good");
		

	}

}
