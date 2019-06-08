import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32 (74v)\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.manage().window().maximize();
		dri.manage().deleteAllCookies();
		//if we need to verify session is expired after sometimes,so first delete the cookies,click on ay link it should be redirect to
		// login page-verify login url
		dri.get("");

	}

}
