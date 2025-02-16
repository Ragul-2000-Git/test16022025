package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pom  extends CONSTRUCTOR_POM{
	public login_pom(WebDriver Driver)
	{
		super(Driver);
	}

@FindBy(xpath="//*[@placeholder=\"Username\"]")	WebElement uss;
@FindBy(xpath="//*[@placeholder=\"Password\"]")WebElement pass;
@FindBy(xpath="//*[@type=\"submit\"]") WebElement btn;

public void ussername(String a)
{
	uss.sendKeys(a);
}
public void password(String b)
{
	pass.sendKeys(b);
}
public void click()
{
	btn.click();
}
	
	
	
	
	
	
	
	
	
	
}
