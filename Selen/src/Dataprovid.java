import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovid {
	
	@DataProvider
	
	public Object[][] getData()
	{
		//1st cominati on un and pwd- good credit history
		// with different un and pwd- no credit history
		//3rd- fraud data[iterations]i.e3 [values each iteration how many values] i.e 2
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstun";
		data[0][1]="firstpwd";
		//coulumns in the row nothing but values for that particular combination(row)
		//2nd set
		data[1][0]="secondun";
		data[1][1]="secondpwd";
		//3rd set
		data[2][0]="fraudun";
		data[2][1]="fraudpwd";
		return data;
		
		
	}
	
	@Test(dataProvider="getData")
	public void Catch(String un,String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
	
	}

}
