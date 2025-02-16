package TESTCASES;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.login_pom;

public class login_tc {
	public WebDriver wb;
	@BeforeClass
	void test()
	{
		wb=new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	void testcase()
	{
		login_pom pp=new login_pom(wb);
		pp.ussername("Admin");
		pp.password("admin123");
		pp.click();
		
	}
	@AfterClass
	void finish()
	{
		wb.quit();
	}

}
