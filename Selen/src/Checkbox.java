import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Hariom\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		List<WebElement> check=driver.findElements(By.cssSelector("input[type='checkbox']"));
		ArrayList<String> arr=new ArrayList<String>();
		int count=check.size();
		System.out.println(count);
		
		
//		for(int i=0;i<count;i++)
//		{
//			String text=check.get(i).getText();
//			arr.add(text);
//		}
//		Collections.sort(arr);
//		Thread.sleep(1000);
//		for(String stm:arr)
//		{
//			System.out.println(stm);
//		}
		
		WebElement ele=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		ele.click();
		//Assert.assertFalse(ele.isSelected());
		//Assert.assertTrue(condition);
		//Assert.assertEquals(actual, expected);
		if(ele.isSelected())
		{
			System.out.println("Checkbox is selected");
			
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("(//input[@name='ctl00$mainContent$rbtnl_Trip'])[2]")).click();
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}

}
