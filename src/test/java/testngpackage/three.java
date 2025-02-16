package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class three {
	WebDriver wb=new ChromeDriver();
@BeforeClass
void firststep()
{
	wb.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
}
@Test
void secondstep() throws InterruptedException
{
	wb.findElement(By.xpath("//*[@id='input-email']")).sendKeys("VFHXi@gmail.com");
	wb.findElement(By.xpath("//*[@id='input-password']")).sendKeys("ZSvLg@75006");
	wb.findElement(By.xpath("//*[@value=\"Login\"]")).click();
	boolean status=wb.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
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
}
