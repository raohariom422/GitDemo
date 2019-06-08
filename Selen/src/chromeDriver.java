import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver  {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Hariom\\Automation\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//driver.get("https://www.google.co.in/");
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getCurrentUrl());
		//driver.get("https://www.facebook.com/");
//			driver.findElement(By.id("email")).sendKeys("raohariom@gmail.com");
//			driver.findElement(By.name("pass")).sendKeys("everythingisplanned");
//			driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.cssSelector("#email")).sendKeys("ack");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("am");
//		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
			driver.get("http://qa-crm-int.roofandfloor.com/");	
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ajayk@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("planned");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Login un-successful')]")).getText());
			
//	driver.findElement(By.("pass")).sendKeys("everythingisplanned");
//			driver.findElement(By.linkText("Forgotten account?")).click();
			
			//driver.navigate().back();
			//driver.navigate().forward();
			//System.out.println(driver.getPageSource());
			//driver.close();//close the current browser
			//driver.quit();//close all browser
			

		}

	}


