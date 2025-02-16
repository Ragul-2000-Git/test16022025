package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class five {
@Test
void demo()
{
	WebDriver wb=new ChromeDriver();
	wb.get("https://testautomationpractice.blogspot.com/");
	wb.findElement(By.xpath("//*[@id=\"male\"]")).click();
}
}
