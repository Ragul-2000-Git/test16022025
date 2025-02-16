package TESTCASES;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.info_pom;
import POM.login_pom;

public class checbox_tc {
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
	void info()
	{
		login_pom pp=new login_pom(wb);
		pp.ussername("Admin");
		pp.password("admin123");
		pp.click();
		info_pom tt=new info_pom(wb);
		tt.in();
		tt.ck();
	}

}
