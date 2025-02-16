package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver wb=new ChromeDriver();
	@BeforeClass
	void firststep()
	{
		wb.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
	}
	@Test(dataProvider="dp")
	void secondstep(String a,String B) throws InterruptedException 
	{
		WebElement cc=wb.findElement(By.xpath("//*[@id='input-email']"));
		Thread.sleep(10);
		WebElement ccv=	wb.findElement(By.xpath("//*[@id='input-password']"));
		cc.sendKeys(a);
		ccv.sendKeys(B);
		wb.findElement(By.xpath("//*[@value=\"Login\"]")).click();
	
		
		Thread.sleep(15);
		boolean status=wb.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		Thread.sleep(15);
		System.out.println(status);
		if(status==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	@AfterClass
	void three()
	{
		wb.close();
	
	}
	@DataProvider(name="dp")
	Object [][] wow ()
	{
		Object a[][]= {{"VFHXi@gmail.com","ZSvLg@75006"},{"ragul.com","test@134"},{"jamesbond.com","test"},
				
		};
		return a;
	}
	
}
