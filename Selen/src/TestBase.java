import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {
	
	@Test
	 
	public void login() throws IOException
	{
		WebDriver dri=null;
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Postman Rahul\\Selen\\Selen\\dataDriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("USERNAME"));
		if(prop.getProperty("BROWSER").equals("CHROME"))
		{
			 dri=new ChromeDriver();
		}
		else if(prop.getProperty("BROWSER").equals("firefox"))
		{
			
		}
		else
		{
			//InternetExplorerDriver ie=new InternetExplorerDriver
		}
		dri.get(prop.getProperty("URL"));
	}
	// each and every test cases will execute this one, as its a base test

}
