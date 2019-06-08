import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handlingsslcertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ssl certifications
		// handling insecure certifications
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//belongs to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		WebDriver d=new ChromeDriver(c);
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32 (74v)\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//dri.get("pass the insecure web url to proceed anyway");

	}

}
