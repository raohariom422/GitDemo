import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//Selenium grid allows us to run our tests on different machines against different browsers
//		//hub is our m/c for execution of test in different m/c we need to download jars standalone
//		//The Selenium Server is needed in order to run Remote Selenium WebDriver. 
//		Selenium 3.X is no longer capable of running Selenium RC directly, 
//		rather it does it through emulation and the WebDriverBackedSelenium interface.
		//Teamviewer: id: 1 509 670 352, pwd: ugq228
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		//dc.se

		//Webdriver driver=new ChromeDriver();new url pass the hub url
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://rediff.com");

	}

}
