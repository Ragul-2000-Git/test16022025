package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class second {
	WebDriver wb;
	@Test(priority=1)
	void first()
	{
		wb=new ChromeDriver();
		wb.get("https://testautomationpractice.blogspot.com/");
	}
@Test(priority=2)
void second()
{
	wb.findElement(By.xpath("//*[@class=\"wikipedia-icon\"]")).click();
}
@Test(priority=3)
void three()
{
	Set<String> ss=wb.getWindowHandles();
	for(String aa:ss)
	{
	String c=	wb.switchTo().window(aa).getTitle();
	if(c.equals("Wikipedia, the free encyclopedia"))
	{
		wb.close();
	}
	}
	
}
}
