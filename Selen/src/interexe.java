import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class interexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Hariom\\Automation\\msedgedriver.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
