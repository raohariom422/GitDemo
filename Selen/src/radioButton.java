import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Hariom\\\\Automation\\\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();

		dri.get("http://www.echoecho.com/htmlforms10.htm");
		// dri.findElement(By.xpath("//input[@value='Butter']")).click();
		List<WebElement> source = dri.findElements(By.xpath("//input[@name='group1']"));
		int count = source.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			Thread.sleep(1000);
			String text = source.get(i).getAttribute("value");
			if (text.equals("Cheese")) {
				source.get(i).click();
			}

		}

	}

}
