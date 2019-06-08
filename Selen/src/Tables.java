import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Postman Rahul\\chromedriver_win32 (74v)\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int sum=0;
		dri.get("https://www.cricbuzz.com/live-cricket-scorecard/20239/nz-vs-sl-match-3-icc-cricket-world-cup-2019");
		//traverse from parent to child we required runs from one table, class name is common for all tables
		// if we take classname , it might be second table data also it will refer
		//locate the parent we selected the Parent section first
		WebElement table=dri.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//it will checkonly in particular table,then grab all rows in that parent section
		int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(rowcount);
		//now we grab the 3rd column value, 3 rd child is in 3 rd row sow  we need to traverse up to there
		//traversing to third child ,parent xpath space tagname:nth-child(3)
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(count);
		for(int i=0;i<count-2;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			System.out.println(value);
			int valueint=Integer.parseInt(value);
			sum=sum+valueint;
			
		}
		System.out.println(sum);
		
		// extras and total also displaying now we need to (b 1, lb 0, w 8, nb 2, p 0)
		// (10 wkts, 29.2 Ov) and display only integer value for ex: 4 and 124
		//for that class is commom for all so first we find the xpath of extras then we traverse up to sibling/following-sibling:: tagname
		//now we need to add all the runs and compare with the total
		String extras=dri.findElement(By.xpath("//div[contains(text(),'Extras')]/following-sibling::div")).getText();
		int extrarun=Integer.parseInt(extras);
		int totalruns=sum+extrarun;
		String AcualTotal=dri.findElement(By.xpath("//div[contains(text(),'Total')]/following-sibling::div")).getText(); 
		int totalvalue=Integer.parseInt(AcualTotal);
		if(totalruns==totalvalue)
		{
			System.out.println("count matches"+totalvalue);
		}
		else
		{
			System.out.println("count fails");
		}
	
		
		
		
		

	}

}
