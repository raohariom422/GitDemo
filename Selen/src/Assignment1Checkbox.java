import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Hariom\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Thread.sleep(10000);
		List<WebElement> check=driver.findElements(By.cssSelector("input[type='checkbox']"));
		int count=check.size();
		System.out.println(count);
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("checkBoxOption1"));
		if(ele.isSelected())
		{
			System.out.println("is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		Thread.sleep(10000);
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement elem=driver.findElement(By.id("checkBoxOption1"));
		if(elem.isSelected())
		{
			System.out.println(" is selected box");
		}
		else
		{
			System.out.println(" is not selected box");
		}
		

	}

}
