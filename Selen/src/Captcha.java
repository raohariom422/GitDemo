import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WB9835-7QZGK2-5VU6DJ
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.get("https://captcha.com/demos/features/captcha-demo.aspx");

	}
	public void switchtoframe(WebDriver dri)
	{
	    int framecount=dri.findElements(By.tagName("iframe")).size();
	    for(int i=0;i<framecount;i++)
	    {
	         dri.switchTo().frame(i);
	         dri.findElement(By.id("CaptchaCodeTextBox"));
	      
	    }
	}

}
