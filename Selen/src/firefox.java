import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Hariom\\Automation\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
