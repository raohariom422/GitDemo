import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32 (74v)\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.manage().window().maximize();
		dri.get("https://www.cricbuzz.com/");
		//takes the screenshot and get screenshot as file format
		File src=((TakesScreenshot)dri).getScreenshotAs(OutputType.FILE);
		//copy the file from source to our local
		//download the jar https://commons.apache.org/proper/commons-io/
		FileUtils.copyFile(src, new File("E://Postman Rahul//screen.png"));
	}

}
