package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class first {
	WebDriver wb;
@BeforeClass
@Parameters({"browser"})
	void apple(String a)
	{
	switch(a)
	{
	case "chrome": wb=new ChromeDriver();break;
	case "edge": wb=new EdgeDriver();break;
	}
	wb.manage().window().maximize();
	wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@Test(priority=2)
void ball()
{
wb.get("https://testautomationpractice.blogspot.com/");
wb.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ragul");

}
@AfterClass
void cat()
{
wb.quit();

}

	
}
